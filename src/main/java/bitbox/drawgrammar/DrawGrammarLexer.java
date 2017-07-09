// Generated from /home/fusiled/workspace/bitbox/src/main/java/bitbox/drawgrammar/DrawGrammar.g4 by ANTLR 4.7
package bitbox.drawgrammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawGrammarLexer extends Lexer {
    public static final int
            NUMBER = 1, STRING = 2, STR_DELIM = 3, ELEM_SEP = 4, COMMA_SEP = 5, BR_OPEN = 6, BR_CLOSE = 7,
            RANGE_POINTS = 8, WS = 9;
    public static final String[] ruleNames = {
            "NUMBER", "STRING", "STR_DELIM", "ELEM_SEP", "COMMA_SEP", "BR_OPEN", "BR_CLOSE",
            "RANGE_POINTS", "WS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\67\b\1\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6" +
                    "\2\27\n\2\r\2\16\2\30\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\4\3" +
                    "\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\6\n\62\n\n\r\n\16\n" +
                    "\63\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\5\3\2" +
                    "\62;\3\2$$\5\2\13\f\17\17\"\"\29\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2" +
                    "\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2" +
                    "\2\2\3\26\3\2\2\2\5\32\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3" +
                    "\2\2\2\17+\3\2\2\2\21-\3\2\2\2\23\61\3\2\2\2\25\27\t\2\2\2\26\25\3\2\2" +
                    "\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\4\3\2\2\2\32\36\5\7\4" +
                    "\2\33\35\n\3\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2" +
                    "\37!\3\2\2\2 \36\3\2\2\2!\"\5\7\4\2\"\6\3\2\2\2#$\7$\2\2$\b\3\2\2\2%&" +
                    "\7<\2\2&\n\3\2\2\2\'(\7.\2\2(\f\3\2\2\2)*\7]\2\2*\16\3\2\2\2+,\7_\2\2" +
                    ",\20\3\2\2\2-.\7\60\2\2./\7\60\2\2/\22\3\2\2\2\60\62\t\4\2\2\61\60\3\2" +
                    "\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\b\n" +
                    "\2\2\66\24\3\2\2\2\6\2\30\36\63\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, null, null, "'\"'", "':'", "','", "'['", "']'", "'..'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "NUMBER", "STRING", "STR_DELIM", "ELEM_SEP", "COMMA_SEP", "BR_OPEN",
            "BR_CLOSE", "RANGE_POINTS", "WS"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public DrawGrammarLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "DrawGrammar.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}