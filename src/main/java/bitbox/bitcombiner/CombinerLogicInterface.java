package bitbox.bitcombiner;

import bitbox.logicgrammar.LogicGrammarLexer;
import bitbox.logicgrammar.LogicGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

/**
 * Created by fusiled on 04/07/17.
 */
public interface CombinerLogicInterface {


    static int getResult(String equationString) throws LogicGrammarParsingException {
        CharStream is = CharStreams.fromString(equationString);
        LogicGrammarLexer lex = new LogicGrammarLexer(is);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        LogicGrammarParser parser = new LogicGrammarParser(tokens);
        System.out.println("Parsing equation: " + equationString);
        int final_result;
        try {
            final_result = parser.root().result;
        } catch (RecognitionException re) {
            throw new LogicGrammarParsingException();
        }
        return final_result;
    }
}
