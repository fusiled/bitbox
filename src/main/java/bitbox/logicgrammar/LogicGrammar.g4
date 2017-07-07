grammar LogicGrammar;

root returns[int result]: {$result=0; }
  lower_orl=orl { $result=$lower_orl.result ; }
  | lower_root=root ORL_TOKEN  lower_orl=orl { $result = ( ($lower_root.result!=0) || ($lower_orl.result!=0) )? 1 : 0 ; }
  ;

orl returns[int result]:
    lower_andl=andl {$result = $lower_andl.result; }
  | lower_orl=orl ANDL_TOKEN lower_andl=andl { $result = ( ($lower_orl.result!=0) && ($lower_andl.result!=0) )? 1 : 0 ; }
  ;

andl returns[int result]:
    lower_orb=orb {$result = $lower_orb.result; }
  | lower_andl=andl ORB_TOKEN lower_orb=orb {$result = $lower_andl.result | $lower_orb.result; }
  ;

orb returns[int result]:
    lower_xorb=xorb {$result = $lower_xorb.result; }
  | lower_orb=orb XORB_TOKEN lower_xorb=xorb {$result = $lower_orb.result ^ $lower_xorb.result; }
  ;

xorb returns[int result]:
    lower_andb=andb {$result = $lower_andb.result; }
  | lower_xorb=xorb ANDB_TOKEN lower_andb=andb {$result = $lower_xorb.result & $lower_andb.result; }
  ;

andb returns[int result ]:
    lower_cmp=compare { $result = $lower_cmp.result;}
  | lower_andb=andb EQUAL_TOKEN lower_cmp=compare { $result = ( $lower_andb.result == $lower_cmp.result ) ? 1 : 0; }
  | lower_andb=andb DIFFERENT_TOKEN compare { $result = ( $lower_andb.result != $lower_cmp.result ) ? 0 : 1 ; }
  ;

compare returns[int result] :
    lower_bitwise=bitwise {$result = $lower_bitwise.result; } #compareSimple
  | lower_compare=compare GREAT_TOKEN lower_bitwise=bitwise { $result = ( $lower_compare.result > $lower_bitwise.result ) ? 1 : 0  ; } #compareGreat
  | lower_compare=compare LESS_TOKEN lower_bitwise=bitwise { $result = ( $lower_compare.result < $lower_bitwise.result ) ? 1 : 0  ; } #compareLess
  | lower_compare=compare GEQ_TOKEN lower_bitwise=bitwise { $result = ( $lower_compare.result >= $lower_bitwise.result ) ? 1 : 0  ; } #compareGeq
  | lower_compare=compare LEQ_TOKEN lower_bitwise=bitwise { $result = ( $lower_compare.result <= $lower_bitwise.result ) ? 1 : 0  ; } #compareLeq
  ;

bitwise returns[int result]:
    lower_addsub=addsub {$result = $lower_addsub.result; }
    | lower_bitwise=bitwise RSHIFT_TOKEN lower_addsub=addsub { $result = $lower_bitwise.result >> $lower_addsub.result ; }
    | lower_bitwise=bitwise LSHIFT_TOKEN lower_addsub=addsub { $result = $lower_bitwise.result << $lower_addsub.result ; }
  ;

addsub returns[int result]:
    lower_mdr=muldivrem {$result = $lower_mdr.result; }
  | lower_as=addsub SUM_TOKEN lower_mdr=muldivrem { $result = $lower_as.result + $lower_mdr.result ; }
  | lower_as=addsub SUB_TOKEN lower_mdr=muldivrem { $result = $lower_as.result - $lower_mdr.result ; }
  ;


muldivrem returns[int result]:
    lower_neg=neg {$result=$lower_neg.result;}
  | lower_mdr=muldivrem MUL_TOKEN lower_neg=neg {$result = $lower_mdr.result * $lower_neg.result; }
  | lower_mdr=muldivrem DIV_TOKEN lower_neg=neg {$result = $lower_mdr.result / $lower_neg.result; }
  | lower_mdr=muldivrem REM_TOKEN lower_neg=neg {$result = $lower_mdr.result % $lower_neg.result; }
  ;


neg returns [int result]:
    lower_base=base {$result = $lower_base.result; }
  | SUB_TOKEN lower_base=base {$result = - $lower_base.result; }
  | NOTB_TOKEN lower_base=base {$result = ~ $lower_base.result ; }
  | NOTL_TOKEN lower_base=base {$result = (!($lower_base.result!=0))? 1: 0; }
  ;

base returns [int result] :
  num=NUMBER { $result = Integer.parseInt($num.text); }
  | L_SQUARE lower_root=root R_SQUARE { $result=$lower_root.result; }
  ;

L_SQUARE: '(';
R_SQUARE: ')';
NOTL_TOKEN: '!';
NOTB_TOKEN: '~';
MUL_TOKEN: '*';
DIV_TOKEN: '/';
REM_TOKEN: '%';
SUM_TOKEN: '+';
SUB_TOKEN: '-';
RSHIFT_TOKEN: '>>';
LSHIFT_TOKEN: '<<';
GREAT_TOKEN: '>';
LESS_TOKEN: '<';
GEQ_TOKEN: '>=';
LEQ_TOKEN: '<=';
DIFFERENT_TOKEN: '!=';
EQUAL_TOKEN : '==';
XORB_TOKEN : '^';
ANDB_TOKEN : '&';
ORB_TOKEN : '|';
ANDL_TOKEN : '&&';
ORL_TOKEN : '||';
NUMBER : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines