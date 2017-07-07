// Generated from /home/fusiled/workspace/bitbox/src/main/java/bitbox/drawgrammar/DrawGrammar.g4 by ANTLR 4.7
package bitbox.drawgrammar;

import java.util.Set;
import java.util.HashSet;
import java.util.SortedMap;
import java.util.TreeMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, STRING=2, STR_DELIM=3, ELEM_SEP=4, COMMA_SEP=5, BR_OPEN=6, BR_CLOSE=7, 
		RANGE_POINTS=8, WS=9;
	public static final int
		RULE_root = 0, RULE_rangeList = 1, RULE_rangeElem = 2, RULE_bitRange = 3, 
		RULE_number_list = 4;
	public static final String[] ruleNames = {
		"root", "rangeList", "rangeElem", "bitRange", "number_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\"'", "':'", "','", "'['", "']'", "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "STRING", "STR_DELIM", "ELEM_SEP", "COMMA_SEP", "BR_OPEN", 
		"BR_CLOSE", "RANGE_POINTS", "WS"
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

	@Override
	public String getGrammarFileName() { return "DrawGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public SortedMap<Integer,String> map;
		public RangeListContext rl;
		public RangeListContext rangeList() {
			return getRuleContext(RangeListContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGrammarListener ) ((DrawGrammarListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGrammarListener ) ((DrawGrammarListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGrammarVisitor ) return ((DrawGrammarVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((RootContext)_localctx).rl = rangeList();
			((RootContext)_localctx).map = ((RootContext)_localctx).rl.map; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeListContext extends ParserRuleContext {
		public SortedMap<Integer,String> map;
		public RangeElemContext re;
		public RangeListContext rl;
		public RangeElemContext rangeElem() {
			return getRuleContext(RangeElemContext.class,0);
		}
		public TerminalNode COMMA_SEP() { return getToken(DrawGrammarParser.COMMA_SEP, 0); }
		public RangeListContext rangeList() {
			return getRuleContext(RangeListContext.class,0);
		}
		public RangeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGrammarListener ) ((DrawGrammarListener)listener).enterRangeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGrammarListener ) ((DrawGrammarListener)listener).exitRangeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGrammarVisitor ) return ((DrawGrammarVisitor<? extends T>)visitor).visitRangeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeListContext rangeList() throws RecognitionException {
		RangeListContext _localctx = new RangeListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rangeList);
		try {
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				((RangeListContext)_localctx).re = rangeElem();

				            ((RangeListContext)_localctx).map = new TreeMap();
				            for(int elem : ((RangeListContext)_localctx).re.numSet){
				                _localctx.map.put(elem,((RangeListContext)_localctx).re.description.replace("\"",""));
				            }
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				((RangeListContext)_localctx).re = rangeElem();
				setState(17);
				match(COMMA_SEP);
				setState(18);
				((RangeListContext)_localctx).rl = rangeList();

				            for(int elem: ((RangeListContext)_localctx).re.numSet){
				                System.out.println("put "+elem+","+((RangeListContext)_localctx).re.description);
				                ((RangeListContext)_localctx).rl.map.put(elem,((RangeListContext)_localctx).re.description.replace("\"",""));
				            }
				            ((RangeListContext)_localctx).map = ((RangeListContext)_localctx).rl.map;
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeElemContext extends ParserRuleContext {
		public Set<Integer> numSet;
		public String description = "";
		public BitRangeContext br;
		public Token str;
		public TerminalNode BR_OPEN() { return getToken(DrawGrammarParser.BR_OPEN, 0); }
		public TerminalNode BR_CLOSE() { return getToken(DrawGrammarParser.BR_CLOSE, 0); }
		public BitRangeContext bitRange() {
			return getRuleContext(BitRangeContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DrawGrammarParser.STRING, 0); }
		public RangeElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGrammarListener ) ((DrawGrammarListener)listener).enterRangeElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGrammarListener ) ((DrawGrammarListener)listener).exitRangeElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGrammarVisitor ) return ((DrawGrammarVisitor<? extends T>)visitor).visitRangeElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeElemContext rangeElem() throws RecognitionException {
		RangeElemContext _localctx = new RangeElemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rangeElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(BR_OPEN);
			setState(24);
			((RangeElemContext)_localctx).br = bitRange();
			 ((RangeElemContext)_localctx).numSet = ((RangeElemContext)_localctx).br.numSet; 
			setState(26);
			match(BR_CLOSE);
			setState(27);
			((RangeElemContext)_localctx).str = match(STRING);
			 ((RangeElemContext)_localctx).description = (((RangeElemContext)_localctx).str!=null?((RangeElemContext)_localctx).str.getText():null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitRangeContext extends ParserRuleContext {
		public Set<Integer> numSet;
		public Token n1;
		public Token n2;
		public Number_listContext nl;
		public TerminalNode RANGE_POINTS() { return getToken(DrawGrammarParser.RANGE_POINTS, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(DrawGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DrawGrammarParser.NUMBER, i);
		}
		public Number_listContext number_list() {
			return getRuleContext(Number_listContext.class,0);
		}
		public BitRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGrammarListener ) ((DrawGrammarListener)listener).enterBitRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGrammarListener ) ((DrawGrammarListener)listener).exitBitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGrammarVisitor ) return ((DrawGrammarVisitor<? extends T>)visitor).visitBitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitRangeContext bitRange() throws RecognitionException {
		BitRangeContext _localctx = new BitRangeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bitRange);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				((BitRangeContext)_localctx).n1 = match(NUMBER);
				setState(31);
				match(RANGE_POINTS);
				setState(32);
				((BitRangeContext)_localctx).n2 = match(NUMBER);

				            int num1=Integer.parseInt((((BitRangeContext)_localctx).n1!=null?((BitRangeContext)_localctx).n1.getText():null));
				            int num2=Integer.parseInt((((BitRangeContext)_localctx).n2!=null?((BitRangeContext)_localctx).n2.getText():null));
				            ((BitRangeContext)_localctx).numSet =  new HashSet();
				            for(int i=num1; i<=num2; i++)
				            {
				                _localctx.numSet.add(i);
				            }
				       
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((BitRangeContext)_localctx).nl = number_list();
				 ((BitRangeContext)_localctx).numSet =  ((BitRangeContext)_localctx).nl.numSet; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_listContext extends ParserRuleContext {
		public Set<Integer> numSet;
		public Token num;
		public Number_listContext nl;
		public TerminalNode NUMBER() { return getToken(DrawGrammarParser.NUMBER, 0); }
		public TerminalNode COMMA_SEP() { return getToken(DrawGrammarParser.COMMA_SEP, 0); }
		public Number_listContext number_list() {
			return getRuleContext(Number_listContext.class,0);
		}
		public Number_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGrammarListener ) ((DrawGrammarListener)listener).enterNumber_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGrammarListener ) ((DrawGrammarListener)listener).exitNumber_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGrammarVisitor ) return ((DrawGrammarVisitor<? extends T>)visitor).visitNumber_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_listContext number_list() throws RecognitionException {
		Number_listContext _localctx = new Number_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number_list);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((Number_listContext)_localctx).num = match(NUMBER);
				((Number_listContext)_localctx).numSet = new HashSet(); _localctx.numSet.add(Integer.parseInt((((Number_listContext)_localctx).num!=null?((Number_listContext)_localctx).num.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				((Number_listContext)_localctx).num = match(NUMBER);
				setState(42);
				match(COMMA_SEP);
				setState(43);
				((Number_listContext)_localctx).nl = number_list();
				 ((Number_listContext)_localctx).nl.numSet.add(Integer.parseInt((((Number_listContext)_localctx).num!=null?((Number_listContext)_localctx).num.getText():null))); ((Number_listContext)_localctx).numSet = ((Number_listContext)_localctx).nl.numSet;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5(\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\61\n\6\3\6\2\2\7\2\4\6\b\n\2"+
		"\2\2\60\2\f\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b\'\3\2\2\2\n\60\3\2\2\2"+
		"\f\r\5\4\3\2\r\16\b\2\1\2\16\3\3\2\2\2\17\20\5\6\4\2\20\21\b\3\1\2\21"+
		"\30\3\2\2\2\22\23\5\6\4\2\23\24\7\7\2\2\24\25\5\4\3\2\25\26\b\3\1\2\26"+
		"\30\3\2\2\2\27\17\3\2\2\2\27\22\3\2\2\2\30\5\3\2\2\2\31\32\7\b\2\2\32"+
		"\33\5\b\5\2\33\34\b\4\1\2\34\35\7\t\2\2\35\36\7\4\2\2\36\37\b\4\1\2\37"+
		"\7\3\2\2\2 !\7\3\2\2!\"\7\n\2\2\"#\7\3\2\2#(\b\5\1\2$%\5\n\6\2%&\b\5\1"+
		"\2&(\3\2\2\2\' \3\2\2\2\'$\3\2\2\2(\t\3\2\2\2)*\7\3\2\2*\61\b\6\1\2+,"+
		"\7\3\2\2,-\7\7\2\2-.\5\n\6\2./\b\6\1\2/\61\3\2\2\2\60)\3\2\2\2\60+\3\2"+
		"\2\2\61\13\3\2\2\2\5\27\'\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}