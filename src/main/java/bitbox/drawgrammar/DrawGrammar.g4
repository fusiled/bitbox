grammar DrawGrammar;

@header
{
import java.util.Set;
import java.util.HashSet;
import java.util.SortedMap;
import java.util.TreeMap;
}


root returns [ SortedMap<Integer,String> map]
    : rl=rangeList {$map=$rl.map; }
    ;


rangeList returns [ SortedMap<Integer,String> map ]
    : re=rangeElem {
            $map=new TreeMap();
            for(int elem : $re.numSet){
                $map.put(elem,$re.description.replace("\"",""));
            }
        }
    | re=rangeElem COMMA_SEP rl=rangeList {
            for(int elem: $re.numSet){
                $rl.map.put(elem,$re.description.replace("\"",""));
            }
            $map=$rl.map;
        }
    ;

rangeElem returns [ Set<Integer> numSet, String description=""]
    : BR_OPEN br=bitRange { $numSet=$br.numSet; }  BR_CLOSE str=STRING { $description=$str.text; }
    ;

bitRange returns [ Set<Integer> numSet ]
    : n1=NUMBER RANGE_POINTS n2=NUMBER {
            int num1=Integer.parseInt($n1.text);
            int num2=Integer.parseInt($n2.text);
            $numSet= new HashSet();
            for(int i=num1; i<=num2; i++)
            {
                $numSet.add(i);
            }
       }
    | nl=number_list { $numSet = $nl.numSet; }
    ;

number_list returns[ Set<Integer> numSet ]
   : num=NUMBER {$numSet=new HashSet(); $numSet.add(Integer.parseInt($num.text)); }
   | num=NUMBER COMMA_SEP nl=number_list { $nl.numSet.add(Integer.parseInt($num.text)); $numSet=$nl.numSet;}
   ;

NUMBER: [0-9]+ ;
STRING: STR_DELIM (~('"'))* STR_DELIM ;
STR_DELIM: '"';
ELEM_SEP: ':';
COMMA_SEP: ',';
BR_OPEN: '[';
BR_CLOSE: ']';
RANGE_POINTS: '..';
WS : [ \t\r\n]+ -> skip;