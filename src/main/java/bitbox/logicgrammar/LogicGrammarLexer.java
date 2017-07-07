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
		L_SQUARE=1, R_SQUARE=2, NOTL_TOKEN=3, NOTB_TOKEN=4, MUL_TOKEN=5, DIV_TOKEN=6, 
		REM_TOKEN=7, SUM_TOKEN=8, SUB_TOKEN=9, RSHIFT_TOKEN=10, LSHIFT_TOKEN=11, 
		GREAT_TOKEN=12, LESS_TOKEN=13, GEQ_TOKEN=14, LEQ_TOKEN=15, DIFFERENT_TOKEN=16, 
		EQUAL_TOKEN=17, XORB_TOKEN=18, ANDB_TOKEN=19, ORB_TOKEN=20, ANDL_TOKEN=21, 
		ORL_TOKEN=22, NUMBER=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"L_SQUARE", "R_SQUARE", "NOTL_TOKEN", "NOTB_TOKEN", "MUL_TOKEN", "DIV_TOKEN", 
		"REM_TOKEN", "SUM_TOKEN", "SUB_TOKEN", "RSHIFT_TOKEN", "LSHIFT_TOKEN", 
		"GREAT_TOKEN", "LESS_TOKEN", "GEQ_TOKEN", "LEQ_TOKEN", "DIFFERENT_TOKEN", 
		"EQUAL_TOKEN", "XORB_TOKEN", "ANDB_TOKEN", "ORB_TOKEN", "ANDL_TOKEN", 
		"ORL_TOKEN", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'!'", "'~'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>>'", 
		"'<<'", "'>'", "'<'", "'>='", "'<='", "'!='", "'=='", "'^'", "'&'", "'|'", 
		"'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "L_SQUARE", "R_SQUARE", "NOTL_TOKEN", "NOTB_TOKEN", "MUL_TOKEN", 
		"DIV_TOKEN", "REM_TOKEN", "SUM_TOKEN", "SUB_TOKEN", "RSHIFT_TOKEN", "LSHIFT_TOKEN", 
		"GREAT_TOKEN", "LESS_TOKEN", "GEQ_TOKEN", "LEQ_TOKEN", "DIFFERENT_TOKEN", 
		"EQUAL_TOKEN", "XORB_TOKEN", "ANDB_TOKEN", "ORB_TOKEN", "ANDL_TOKEN", 
		"ORL_TOKEN", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\6\30i\n\30\r\30\16\30j\3\31\6\31n\n"+
		"\31\r\31\16\31o\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\3\2\4\3\2\62;\5\2\13\f\17\17\"\"\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2"+
		"\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2"+
		"\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27H\3\2\2\2\31K\3\2\2\2\33M\3\2"+
		"\2\2\35O\3\2\2\2\37R\3\2\2\2!U\3\2\2\2#X\3\2\2\2%[\3\2\2\2\']\3\2\2\2"+
		")_\3\2\2\2+a\3\2\2\2-d\3\2\2\2/h\3\2\2\2\61m\3\2\2\2\63\64\7*\2\2\64\4"+
		"\3\2\2\2\65\66\7+\2\2\66\6\3\2\2\2\678\7#\2\28\b\3\2\2\29:\7\u0080\2\2"+
		":\n\3\2\2\2;<\7,\2\2<\f\3\2\2\2=>\7\61\2\2>\16\3\2\2\2?@\7\'\2\2@\20\3"+
		"\2\2\2AB\7-\2\2B\22\3\2\2\2CD\7/\2\2D\24\3\2\2\2EF\7@\2\2FG\7@\2\2G\26"+
		"\3\2\2\2HI\7>\2\2IJ\7>\2\2J\30\3\2\2\2KL\7@\2\2L\32\3\2\2\2MN\7>\2\2N"+
		"\34\3\2\2\2OP\7@\2\2PQ\7?\2\2Q\36\3\2\2\2RS\7>\2\2ST\7?\2\2T \3\2\2\2"+
		"UV\7#\2\2VW\7?\2\2W\"\3\2\2\2XY\7?\2\2YZ\7?\2\2Z$\3\2\2\2[\\\7`\2\2\\"+
		"&\3\2\2\2]^\7(\2\2^(\3\2\2\2_`\7~\2\2`*\3\2\2\2ab\7(\2\2bc\7(\2\2c,\3"+
		"\2\2\2de\7~\2\2ef\7~\2\2f.\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2k\60\3\2\2\2ln\t\3\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2pq\3\2\2\2qr\b\31\2\2r\62\3\2\2\2\5\2jo\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}