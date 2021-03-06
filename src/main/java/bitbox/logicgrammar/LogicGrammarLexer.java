// Generated from /home/fusiled/workspace/bitbox/src/main/java/bitbox/logicgrammar/LogicGrammar.g4 by ANTLR 4.7
package bitbox.logicgrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HEX_NUMBER=1, INT_NUMBER=2, BIN_NUMBER=3, HEX_PREFIX=4, BIN_PREFIX=5, 
		L_SQUARE=6, R_SQUARE=7, NOTL_TOKEN=8, NOTB_TOKEN=9, MUL_TOKEN=10, DIV_TOKEN=11, 
		REM_TOKEN=12, SUM_TOKEN=13, SUB_TOKEN=14, RSHIFT_TOKEN=15, LSHIFT_TOKEN=16, 
		GREAT_TOKEN=17, LESS_TOKEN=18, GEQ_TOKEN=19, LEQ_TOKEN=20, DIFFERENT_TOKEN=21, 
		EQUAL_TOKEN=22, XORB_TOKEN=23, ANDB_TOKEN=24, ORB_TOKEN=25, ANDL_TOKEN=26, 
		ORL_TOKEN=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"HEX_NUMBER", "INT_NUMBER", "BIN_NUMBER", "HEX_DIGIT", "HEX_PREFIX", "INT_DIGIT", 
		"BIN_DIGIT", "BIN_PREFIX", "L_SQUARE", "R_SQUARE", "NOTL_TOKEN", "NOTB_TOKEN", 
		"MUL_TOKEN", "DIV_TOKEN", "REM_TOKEN", "SUM_TOKEN", "SUB_TOKEN", "RSHIFT_TOKEN", 
		"LSHIFT_TOKEN", "GREAT_TOKEN", "LESS_TOKEN", "GEQ_TOKEN", "LEQ_TOKEN", 
		"DIFFERENT_TOKEN", "EQUAL_TOKEN", "XORB_TOKEN", "ANDB_TOKEN", "ORB_TOKEN", 
		"ANDL_TOKEN", "ORL_TOKEN", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'0x'", "'0b'", "'('", "')'", "'!'", "'~'", "'*'", 
		"'/'", "'%'", "'+'", "'-'", "'>>'", "'<<'", "'>'", "'<'", "'>='", "'<='", 
		"'!='", "'=='", "'^'", "'&'", "'|'", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HEX_NUMBER", "INT_NUMBER", "BIN_NUMBER", "HEX_PREFIX", "BIN_PREFIX", 
		"L_SQUARE", "R_SQUARE", "NOTL_TOKEN", "NOTB_TOKEN", "MUL_TOKEN", "DIV_TOKEN", 
		"REM_TOKEN", "SUM_TOKEN", "SUB_TOKEN", "RSHIFT_TOKEN", "LSHIFT_TOKEN", 
		"GREAT_TOKEN", "LESS_TOKEN", "GEQ_TOKEN", "LEQ_TOKEN", "DIFFERENT_TOKEN", 
		"EQUAL_TOKEN", "XORB_TOKEN", "ANDB_TOKEN", "ORB_TOKEN", "ANDL_TOKEN", 
		"ORL_TOKEN", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LogicGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogicGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\6\2D\n\2\r\2\16\2E\3\3\6\3I\n\3\r\3\16\3J\3\4\3\4\6\4O\n\4\r"+
		"\4\16\4P\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\6\b[\n\b\r\b\16\b\\\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \6 \u0097\n \r \16 \u0098"+
		"\3 \3 \2\2!\3\3\5\4\7\5\t\2\13\6\r\2\17\2\21\7\23\b\25\t\27\n\31\13\33"+
		"\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\32"+
		"9\33;\34=\35?\36\3\2\4\5\2\62;CHch\5\2\13\f\17\17\"\"\2\u009d\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5H\3\2"+
		"\2\2\7L\3\2\2\2\tR\3\2\2\2\13T\3\2\2\2\rW\3\2\2\2\17Z\3\2\2\2\21^\3\2"+
		"\2\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35k\3"+
		"\2\2\2\37m\3\2\2\2!o\3\2\2\2#q\3\2\2\2%s\3\2\2\2\'v\3\2\2\2)y\3\2\2\2"+
		"+{\3\2\2\2-}\3\2\2\2/\u0080\3\2\2\2\61\u0083\3\2\2\2\63\u0086\3\2\2\2"+
		"\65\u0089\3\2\2\2\67\u008b\3\2\2\29\u008d\3\2\2\2;\u008f\3\2\2\2=\u0092"+
		"\3\2\2\2?\u0096\3\2\2\2AC\5\13\6\2BD\5\t\5\2CB\3\2\2\2DE\3\2\2\2EC\3\2"+
		"\2\2EF\3\2\2\2F\4\3\2\2\2GI\5\r\7\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2K\6\3\2\2\2LN\5\21\t\2MO\5\17\b\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2"+
		"PQ\3\2\2\2Q\b\3\2\2\2RS\t\2\2\2S\n\3\2\2\2TU\7\62\2\2UV\7z\2\2V\f\3\2"+
		"\2\2WX\4\62;\2X\16\3\2\2\2Y[\4\62\63\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2"+
		"\\]\3\2\2\2]\20\3\2\2\2^_\7\62\2\2_`\7d\2\2`\22\3\2\2\2ab\7*\2\2b\24\3"+
		"\2\2\2cd\7+\2\2d\26\3\2\2\2ef\7#\2\2f\30\3\2\2\2gh\7\u0080\2\2h\32\3\2"+
		"\2\2ij\7,\2\2j\34\3\2\2\2kl\7\61\2\2l\36\3\2\2\2mn\7\'\2\2n \3\2\2\2o"+
		"p\7-\2\2p\"\3\2\2\2qr\7/\2\2r$\3\2\2\2st\7@\2\2tu\7@\2\2u&\3\2\2\2vw\7"+
		">\2\2wx\7>\2\2x(\3\2\2\2yz\7@\2\2z*\3\2\2\2{|\7>\2\2|,\3\2\2\2}~\7@\2"+
		"\2~\177\7?\2\2\177.\3\2\2\2\u0080\u0081\7>\2\2\u0081\u0082\7?\2\2\u0082"+
		"\60\3\2\2\2\u0083\u0084\7#\2\2\u0084\u0085\7?\2\2\u0085\62\3\2\2\2\u0086"+
		"\u0087\7?\2\2\u0087\u0088\7?\2\2\u0088\64\3\2\2\2\u0089\u008a\7`\2\2\u008a"+
		"\66\3\2\2\2\u008b\u008c\7(\2\2\u008c8\3\2\2\2\u008d\u008e\7~\2\2\u008e"+
		":\3\2\2\2\u008f\u0090\7(\2\2\u0090\u0091\7(\2\2\u0091<\3\2\2\2\u0092\u0093"+
		"\7~\2\2\u0093\u0094\7~\2\2\u0094>\3\2\2\2\u0095\u0097\t\3\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\b \2\2\u009b@\3\2\2\2\b\2EJP\\\u0098\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}