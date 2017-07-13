// Generated from /home/fusiled/workspace/bitbox/src/main/java/bitbox/logicgrammar/LogicGrammar.g4 by ANTLR 4.7
package bitbox.logicgrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicGrammarParser extends Parser {
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
	public static final int
		RULE_root = 0, RULE_orl = 1, RULE_andl = 2, RULE_orb = 3, RULE_xorb = 4, 
		RULE_andb = 5, RULE_compare = 6, RULE_bitwise = 7, RULE_addsub = 8, RULE_muldivrem = 9, 
		RULE_neg = 10, RULE_base = 11, RULE_basednumber = 12;
	public static final String[] ruleNames = {
		"root", "orl", "andl", "orb", "xorb", "andb", "compare", "bitwise", "addsub", 
		"muldivrem", "neg", "base", "basednumber"
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

	@Override
	public String getGrammarFileName() { return "LogicGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogicGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public long result;
		public RootContext lower_root;
		public OrlContext lower_orl;
		public OrlContext orl() {
			return getRuleContext(OrlContext.class,0);
		}
		public TerminalNode ORL_TOKEN() { return getToken(LogicGrammarParser.ORL_TOKEN, 0); }
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		return root(0);
	}

	private RootContext root(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RootContext _localctx = new RootContext(_ctx, _parentState);
		RootContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_root, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			((RootContext)_localctx).result = 0; 
			setState(28);
			((RootContext)_localctx).lower_orl = orl(0);
			 ((RootContext)_localctx).result = ((RootContext)_localctx).lower_orl.result ; 
			}
			_ctx.stop = _input.LT(-1);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RootContext(_parentctx, _parentState);
					_localctx.lower_root = _prevctx;
					_localctx.lower_root = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_root);
					setState(31);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(32);
					match(ORL_TOKEN);
					setState(33);
					((RootContext)_localctx).lower_orl = orl(0);
					 ((RootContext)_localctx).result =  ( (((RootContext)_localctx).lower_root.result!=0) || (((RootContext)_localctx).lower_orl.result!=0) )? 1 : 0 ; 
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OrlContext extends ParserRuleContext {
		public long result;
		public OrlContext lower_orl;
		public AndlContext lower_andl;
		public AndlContext andl() {
			return getRuleContext(AndlContext.class,0);
		}
		public TerminalNode ANDL_TOKEN() { return getToken(LogicGrammarParser.ANDL_TOKEN, 0); }
		public OrlContext orl() {
			return getRuleContext(OrlContext.class,0);
		}
		public OrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterOrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitOrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitOrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrlContext orl() throws RecognitionException {
		return orl(0);
	}

	private OrlContext orl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrlContext _localctx = new OrlContext(_ctx, _parentState);
		OrlContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_orl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(42);
			((OrlContext)_localctx).lower_andl = andl(0);
			((OrlContext)_localctx).result =  ((OrlContext)_localctx).lower_andl.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrlContext(_parentctx, _parentState);
					_localctx.lower_orl = _prevctx;
					_localctx.lower_orl = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_orl);
					setState(45);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(46);
					match(ANDL_TOKEN);
					setState(47);
					((OrlContext)_localctx).lower_andl = andl(0);
					 ((OrlContext)_localctx).result =  ( (((OrlContext)_localctx).lower_orl.result!=0) && (((OrlContext)_localctx).lower_andl.result!=0) )? 1 : 0 ; 
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndlContext extends ParserRuleContext {
		public long result;
		public AndlContext lower_andl;
		public OrbContext lower_orb;
		public OrbContext orb() {
			return getRuleContext(OrbContext.class,0);
		}
		public TerminalNode ORB_TOKEN() { return getToken(LogicGrammarParser.ORB_TOKEN, 0); }
		public AndlContext andl() {
			return getRuleContext(AndlContext.class,0);
		}
		public AndlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterAndl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitAndl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitAndl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndlContext andl() throws RecognitionException {
		return andl(0);
	}

	private AndlContext andl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndlContext _localctx = new AndlContext(_ctx, _parentState);
		AndlContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_andl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			((AndlContext)_localctx).lower_orb = orb(0);
			((AndlContext)_localctx).result =  ((AndlContext)_localctx).lower_orb.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndlContext(_parentctx, _parentState);
					_localctx.lower_andl = _prevctx;
					_localctx.lower_andl = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_andl);
					setState(59);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(60);
					match(ORB_TOKEN);
					setState(61);
					((AndlContext)_localctx).lower_orb = orb(0);
					((AndlContext)_localctx).result =  ((AndlContext)_localctx).lower_andl.result | ((AndlContext)_localctx).lower_orb.result; 
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OrbContext extends ParserRuleContext {
		public long result;
		public OrbContext lower_orb;
		public XorbContext lower_xorb;
		public XorbContext xorb() {
			return getRuleContext(XorbContext.class,0);
		}
		public TerminalNode XORB_TOKEN() { return getToken(LogicGrammarParser.XORB_TOKEN, 0); }
		public OrbContext orb() {
			return getRuleContext(OrbContext.class,0);
		}
		public OrbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterOrb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitOrb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitOrb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrbContext orb() throws RecognitionException {
		return orb(0);
	}

	private OrbContext orb(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrbContext _localctx = new OrbContext(_ctx, _parentState);
		OrbContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_orb, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(70);
			((OrbContext)_localctx).lower_xorb = xorb(0);
			((OrbContext)_localctx).result =  ((OrbContext)_localctx).lower_xorb.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrbContext(_parentctx, _parentState);
					_localctx.lower_orb = _prevctx;
					_localctx.lower_orb = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_orb);
					setState(73);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(74);
					match(XORB_TOKEN);
					setState(75);
					((OrbContext)_localctx).lower_xorb = xorb(0);
					((OrbContext)_localctx).result =  ((OrbContext)_localctx).lower_orb.result ^ ((OrbContext)_localctx).lower_xorb.result; 
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class XorbContext extends ParserRuleContext {
		public long result;
		public XorbContext lower_xorb;
		public AndbContext lower_andb;
		public AndbContext andb() {
			return getRuleContext(AndbContext.class,0);
		}
		public TerminalNode ANDB_TOKEN() { return getToken(LogicGrammarParser.ANDB_TOKEN, 0); }
		public XorbContext xorb() {
			return getRuleContext(XorbContext.class,0);
		}
		public XorbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterXorb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitXorb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitXorb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorbContext xorb() throws RecognitionException {
		return xorb(0);
	}

	private XorbContext xorb(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XorbContext _localctx = new XorbContext(_ctx, _parentState);
		XorbContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_xorb, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(84);
			((XorbContext)_localctx).lower_andb = andb(0);
			((XorbContext)_localctx).result =  ((XorbContext)_localctx).lower_andb.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new XorbContext(_parentctx, _parentState);
					_localctx.lower_xorb = _prevctx;
					_localctx.lower_xorb = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_xorb);
					setState(87);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(88);
					match(ANDB_TOKEN);
					setState(89);
					((XorbContext)_localctx).lower_andb = andb(0);
					((XorbContext)_localctx).result =  ((XorbContext)_localctx).lower_xorb.result & ((XorbContext)_localctx).lower_andb.result; 
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndbContext extends ParserRuleContext {
		public long result;
		public AndbContext lower_andb;
		public CompareContext lower_cmp;
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode EQUAL_TOKEN() { return getToken(LogicGrammarParser.EQUAL_TOKEN, 0); }
		public AndbContext andb() {
			return getRuleContext(AndbContext.class,0);
		}
		public TerminalNode DIFFERENT_TOKEN() { return getToken(LogicGrammarParser.DIFFERENT_TOKEN, 0); }
		public AndbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterAndb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitAndb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitAndb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndbContext andb() throws RecognitionException {
		return andb(0);
	}

	private AndbContext andb(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndbContext _localctx = new AndbContext(_ctx, _parentState);
		AndbContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_andb, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			((AndbContext)_localctx).lower_cmp = compare(0);
			 ((AndbContext)_localctx).result =  ((AndbContext)_localctx).lower_cmp.result;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndbContext(_parentctx, _parentState);
						_localctx.lower_andb = _prevctx;
						_localctx.lower_andb = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_andb);
						setState(101);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(102);
						match(EQUAL_TOKEN);
						setState(103);
						((AndbContext)_localctx).lower_cmp = compare(0);
						 ((AndbContext)_localctx).result =  ( ((AndbContext)_localctx).lower_andb.result == ((AndbContext)_localctx).lower_cmp.result ) ? 1 : 0; 
						}
						break;
					case 2:
						{
						_localctx = new AndbContext(_parentctx, _parentState);
						_localctx.lower_andb = _prevctx;
						_localctx.lower_andb = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_andb);
						setState(106);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(107);
						match(DIFFERENT_TOKEN);
						setState(108);
						compare(0);
						 ((AndbContext)_localctx).result =  ( ((AndbContext)_localctx).lower_andb.result != ((AndbContext)_localctx).lower_cmp.result ) ? 0 : 1 ; 
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompareContext extends ParserRuleContext {
		public long result;
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	 
		public CompareContext() { }
		public void copyFrom(CompareContext ctx) {
			super.copyFrom(ctx);
			this.result = ctx.result;
		}
	}
	public static class CompareLessContext extends CompareContext {
		public CompareContext lower_compare;
		public BitwiseContext lower_bitwise;
		public TerminalNode LESS_TOKEN() { return getToken(LogicGrammarParser.LESS_TOKEN, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public CompareLessContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterCompareLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitCompareLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitCompareLess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareGeqContext extends CompareContext {
		public CompareContext lower_compare;
		public BitwiseContext lower_bitwise;
		public TerminalNode GEQ_TOKEN() { return getToken(LogicGrammarParser.GEQ_TOKEN, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public CompareGeqContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterCompareGeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitCompareGeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitCompareGeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareGreatContext extends CompareContext {
		public CompareContext lower_compare;
		public BitwiseContext lower_bitwise;
		public TerminalNode GREAT_TOKEN() { return getToken(LogicGrammarParser.GREAT_TOKEN, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public CompareGreatContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterCompareGreat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitCompareGreat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitCompareGreat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareLeqContext extends CompareContext {
		public CompareContext lower_compare;
		public BitwiseContext lower_bitwise;
		public TerminalNode LEQ_TOKEN() { return getToken(LogicGrammarParser.LEQ_TOKEN, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public CompareLeqContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterCompareLeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitCompareLeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitCompareLeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareSimpleContext extends CompareContext {
		public BitwiseContext lower_bitwise;
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public CompareSimpleContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterCompareSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitCompareSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitCompareSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		return compare(0);
	}

	private CompareContext compare(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompareContext _localctx = new CompareContext(_ctx, _parentState);
		CompareContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_compare, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CompareSimpleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(117);
			((CompareSimpleContext)_localctx).lower_bitwise = bitwise(0);
			((CompareSimpleContext)_localctx).result =  ((CompareSimpleContext)_localctx).lower_bitwise.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new CompareGreatContext(new CompareContext(_parentctx, _parentState));
						((CompareGreatContext)_localctx).lower_compare = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compare);
						setState(120);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(121);
						match(GREAT_TOKEN);
						setState(122);
						((CompareGreatContext)_localctx).lower_bitwise = bitwise(0);
						 ((CompareGreatContext)_localctx).result =  ( ((CompareGreatContext)_localctx).lower_compare.result > ((CompareGreatContext)_localctx).lower_bitwise.result ) ? 1 : 0  ; 
						}
						break;
					case 2:
						{
						_localctx = new CompareLessContext(new CompareContext(_parentctx, _parentState));
						((CompareLessContext)_localctx).lower_compare = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compare);
						setState(125);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(126);
						match(LESS_TOKEN);
						setState(127);
						((CompareLessContext)_localctx).lower_bitwise = bitwise(0);
						 ((CompareLessContext)_localctx).result =  ( ((CompareLessContext)_localctx).lower_compare.result < ((CompareLessContext)_localctx).lower_bitwise.result ) ? 1 : 0  ; 
						}
						break;
					case 3:
						{
						_localctx = new CompareGeqContext(new CompareContext(_parentctx, _parentState));
						((CompareGeqContext)_localctx).lower_compare = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compare);
						setState(130);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(131);
						match(GEQ_TOKEN);
						setState(132);
						((CompareGeqContext)_localctx).lower_bitwise = bitwise(0);
						 ((CompareGeqContext)_localctx).result =  ( ((CompareGeqContext)_localctx).lower_compare.result >= ((CompareGeqContext)_localctx).lower_bitwise.result ) ? 1 : 0  ; 
						}
						break;
					case 4:
						{
						_localctx = new CompareLeqContext(new CompareContext(_parentctx, _parentState));
						((CompareLeqContext)_localctx).lower_compare = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compare);
						setState(135);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(136);
						match(LEQ_TOKEN);
						setState(137);
						((CompareLeqContext)_localctx).lower_bitwise = bitwise(0);
						 ((CompareLeqContext)_localctx).result =  ( ((CompareLeqContext)_localctx).lower_compare.result <= ((CompareLeqContext)_localctx).lower_bitwise.result ) ? 1 : 0  ; 
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BitwiseContext extends ParserRuleContext {
		public long result;
		public BitwiseContext lower_bitwise;
		public AddsubContext lower_addsub;
		public AddsubContext addsub() {
			return getRuleContext(AddsubContext.class,0);
		}
		public TerminalNode RSHIFT_TOKEN() { return getToken(LogicGrammarParser.RSHIFT_TOKEN, 0); }
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public TerminalNode LSHIFT_TOKEN() { return getToken(LogicGrammarParser.LSHIFT_TOKEN, 0); }
		public BitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitBitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseContext bitwise() throws RecognitionException {
		return bitwise(0);
	}

	private BitwiseContext bitwise(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitwiseContext _localctx = new BitwiseContext(_ctx, _parentState);
		BitwiseContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_bitwise, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			((BitwiseContext)_localctx).lower_addsub = addsub(0);
			((BitwiseContext)_localctx).result =  ((BitwiseContext)_localctx).lower_addsub.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new BitwiseContext(_parentctx, _parentState);
						_localctx.lower_bitwise = _prevctx;
						_localctx.lower_bitwise = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bitwise);
						setState(149);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(150);
						match(RSHIFT_TOKEN);
						setState(151);
						((BitwiseContext)_localctx).lower_addsub = addsub(0);
						 ((BitwiseContext)_localctx).result =  ((BitwiseContext)_localctx).lower_bitwise.result >> ((BitwiseContext)_localctx).lower_addsub.result ; 
						}
						break;
					case 2:
						{
						_localctx = new BitwiseContext(_parentctx, _parentState);
						_localctx.lower_bitwise = _prevctx;
						_localctx.lower_bitwise = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bitwise);
						setState(154);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(155);
						match(LSHIFT_TOKEN);
						setState(156);
						((BitwiseContext)_localctx).lower_addsub = addsub(0);
						 ((BitwiseContext)_localctx).result =  ((BitwiseContext)_localctx).lower_bitwise.result << ((BitwiseContext)_localctx).lower_addsub.result ; 
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddsubContext extends ParserRuleContext {
		public long result;
		public AddsubContext lower_as;
		public MuldivremContext lower_mdr;
		public MuldivremContext muldivrem() {
			return getRuleContext(MuldivremContext.class,0);
		}
		public TerminalNode SUM_TOKEN() { return getToken(LogicGrammarParser.SUM_TOKEN, 0); }
		public AddsubContext addsub() {
			return getRuleContext(AddsubContext.class,0);
		}
		public TerminalNode SUB_TOKEN() { return getToken(LogicGrammarParser.SUB_TOKEN, 0); }
		public AddsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addsub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterAddsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitAddsub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitAddsub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddsubContext addsub() throws RecognitionException {
		return addsub(0);
	}

	private AddsubContext addsub(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddsubContext _localctx = new AddsubContext(_ctx, _parentState);
		AddsubContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_addsub, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			((AddsubContext)_localctx).lower_mdr = muldivrem(0);
			((AddsubContext)_localctx).result =  ((AddsubContext)_localctx).lower_mdr.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AddsubContext(_parentctx, _parentState);
						_localctx.lower_as = _prevctx;
						_localctx.lower_as = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addsub);
						setState(168);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(169);
						match(SUM_TOKEN);
						setState(170);
						((AddsubContext)_localctx).lower_mdr = muldivrem(0);
						 ((AddsubContext)_localctx).result =  ((AddsubContext)_localctx).lower_as.result + ((AddsubContext)_localctx).lower_mdr.result ; 
						}
						break;
					case 2:
						{
						_localctx = new AddsubContext(_parentctx, _parentState);
						_localctx.lower_as = _prevctx;
						_localctx.lower_as = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addsub);
						setState(173);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(174);
						match(SUB_TOKEN);
						setState(175);
						((AddsubContext)_localctx).lower_mdr = muldivrem(0);
						 ((AddsubContext)_localctx).result =  ((AddsubContext)_localctx).lower_as.result - ((AddsubContext)_localctx).lower_mdr.result ; 
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MuldivremContext extends ParserRuleContext {
		public long result;
		public MuldivremContext lower_mdr;
		public NegContext lower_neg;
		public NegContext neg() {
			return getRuleContext(NegContext.class,0);
		}
		public TerminalNode MUL_TOKEN() { return getToken(LogicGrammarParser.MUL_TOKEN, 0); }
		public MuldivremContext muldivrem() {
			return getRuleContext(MuldivremContext.class,0);
		}
		public TerminalNode DIV_TOKEN() { return getToken(LogicGrammarParser.DIV_TOKEN, 0); }
		public TerminalNode REM_TOKEN() { return getToken(LogicGrammarParser.REM_TOKEN, 0); }
		public MuldivremContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muldivrem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterMuldivrem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitMuldivrem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitMuldivrem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MuldivremContext muldivrem() throws RecognitionException {
		return muldivrem(0);
	}

	private MuldivremContext muldivrem(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MuldivremContext _localctx = new MuldivremContext(_ctx, _parentState);
		MuldivremContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_muldivrem, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184);
			((MuldivremContext)_localctx).lower_neg = neg();
			((MuldivremContext)_localctx).result = ((MuldivremContext)_localctx).lower_neg.result;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MuldivremContext(_parentctx, _parentState);
						_localctx.lower_mdr = _prevctx;
						_localctx.lower_mdr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_muldivrem);
						setState(187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(188);
						match(MUL_TOKEN);
						setState(189);
						((MuldivremContext)_localctx).lower_neg = neg();
						((MuldivremContext)_localctx).result =  ((MuldivremContext)_localctx).lower_mdr.result * ((MuldivremContext)_localctx).lower_neg.result; 
						}
						break;
					case 2:
						{
						_localctx = new MuldivremContext(_parentctx, _parentState);
						_localctx.lower_mdr = _prevctx;
						_localctx.lower_mdr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_muldivrem);
						setState(192);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(193);
						match(DIV_TOKEN);
						setState(194);
						((MuldivremContext)_localctx).lower_neg = neg();
						((MuldivremContext)_localctx).result =  ((MuldivremContext)_localctx).lower_mdr.result / ((MuldivremContext)_localctx).lower_neg.result; 
						}
						break;
					case 3:
						{
						_localctx = new MuldivremContext(_parentctx, _parentState);
						_localctx.lower_mdr = _prevctx;
						_localctx.lower_mdr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_muldivrem);
						setState(197);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(198);
						match(REM_TOKEN);
						setState(199);
						((MuldivremContext)_localctx).lower_neg = neg();
						((MuldivremContext)_localctx).result =  ((MuldivremContext)_localctx).lower_mdr.result % ((MuldivremContext)_localctx).lower_neg.result; 
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NegContext extends ParserRuleContext {
		public long result;
		public BaseContext lower_base;
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public TerminalNode SUB_TOKEN() { return getToken(LogicGrammarParser.SUB_TOKEN, 0); }
		public TerminalNode NOTB_TOKEN() { return getToken(LogicGrammarParser.NOTB_TOKEN, 0); }
		public TerminalNode NOTL_TOKEN() { return getToken(LogicGrammarParser.NOTL_TOKEN, 0); }
		public NegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegContext neg() throws RecognitionException {
		NegContext _localctx = new NegContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_neg);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX_NUMBER:
			case INT_NUMBER:
			case BIN_NUMBER:
			case L_SQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((NegContext)_localctx).lower_base = base();
				((NegContext)_localctx).result =  ((NegContext)_localctx).lower_base.result; 
				}
				break;
			case SUB_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(SUB_TOKEN);
				setState(211);
				((NegContext)_localctx).lower_base = base();
				((NegContext)_localctx).result =  - ((NegContext)_localctx).lower_base.result; 
				}
				break;
			case NOTB_TOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(NOTB_TOKEN);
				setState(215);
				((NegContext)_localctx).lower_base = base();
				((NegContext)_localctx).result =  ~ ((NegContext)_localctx).lower_base.result ; 
				}
				break;
			case NOTL_TOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(NOTL_TOKEN);
				setState(219);
				((NegContext)_localctx).lower_base = base();
				((NegContext)_localctx).result =  (!(((NegContext)_localctx).lower_base.result!=0))? 1: 0; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BaseContext extends ParserRuleContext {
		public long result;
		public BasednumberContext num;
		public RootContext lower_root;
		public BasednumberContext basednumber() {
			return getRuleContext(BasednumberContext.class,0);
		}
		public TerminalNode L_SQUARE() { return getToken(LogicGrammarParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(LogicGrammarParser.R_SQUARE, 0); }
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_base);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX_NUMBER:
			case INT_NUMBER:
			case BIN_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				((BaseContext)_localctx).num = basednumber();
				 ((BaseContext)_localctx).result =  ((BaseContext)_localctx).num.result; 
				}
				break;
			case L_SQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(L_SQUARE);
				setState(228);
				((BaseContext)_localctx).lower_root = root(0);
				setState(229);
				match(R_SQUARE);
				 ((BaseContext)_localctx).result = ((BaseContext)_localctx).lower_root.result; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BasednumberContext extends ParserRuleContext {
		public long result;
		public Token num;
		public TerminalNode HEX_NUMBER() { return getToken(LogicGrammarParser.HEX_NUMBER, 0); }
		public TerminalNode BIN_NUMBER() { return getToken(LogicGrammarParser.BIN_NUMBER, 0); }
		public TerminalNode INT_NUMBER() { return getToken(LogicGrammarParser.INT_NUMBER, 0); }
		public BasednumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basednumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).enterBasednumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicGrammarListener ) ((LogicGrammarListener)listener).exitBasednumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicGrammarVisitor ) return ((LogicGrammarVisitor<? extends T>)visitor).visitBasednumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasednumberContext basednumber() throws RecognitionException {
		BasednumberContext _localctx = new BasednumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basednumber);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((BasednumberContext)_localctx).num = match(HEX_NUMBER);
				((BasednumberContext)_localctx).result = Long.parseLong((((BasednumberContext)_localctx).num!=null?((BasednumberContext)_localctx).num.getText():null).substring(2),16);
				}
				break;
			case BIN_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				((BasednumberContext)_localctx).num = match(BIN_NUMBER);
				((BasednumberContext)_localctx).result = Long.parseLong((((BasednumberContext)_localctx).num!=null?((BasednumberContext)_localctx).num.getText():null).substring(2),2);
				}
				break;
			case INT_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				((BasednumberContext)_localctx).num = match(INT_NUMBER);
				((BasednumberContext)_localctx).result = Long.parseLong((((BasednumberContext)_localctx).num!=null?((BasednumberContext)_localctx).num.getText():null),10);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return root_sempred((RootContext)_localctx, predIndex);
		case 1:
			return orl_sempred((OrlContext)_localctx, predIndex);
		case 2:
			return andl_sempred((AndlContext)_localctx, predIndex);
		case 3:
			return orb_sempred((OrbContext)_localctx, predIndex);
		case 4:
			return xorb_sempred((XorbContext)_localctx, predIndex);
		case 5:
			return andb_sempred((AndbContext)_localctx, predIndex);
		case 6:
			return compare_sempred((CompareContext)_localctx, predIndex);
		case 7:
			return bitwise_sempred((BitwiseContext)_localctx, predIndex);
		case 8:
			return addsub_sempred((AddsubContext)_localctx, predIndex);
		case 9:
			return muldivrem_sempred((MuldivremContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean root_sempred(RootContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean orl_sempred(OrlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andl_sempred(AndlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean orb_sempred(OrbContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean xorb_sempred(XorbContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andb_sempred(AndbContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean compare_sempred(CompareContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bitwise_sempred(BitwiseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addsub_sempred(AddsubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean muldivrem_sempred(MuldivremContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00f5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\65"+
		"\n\3\f\3\16\38\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4\f\4\16"+
		"\4F\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7r\n\7\f\7\16\7u\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008f\n\b\f\b\16\b\u0092\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b5"+
		"\n\n\f\n\16\n\u00b8\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00cd\n\13\f\13"+
		"\16\13\u00d0\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00e1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00eb\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f3\n\16\3\16\2\f\2\4\6\b\n\f\16\20"+
		"\22\24\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u00ff\2\34\3\2\2\2\4"+
		"+\3\2\2\2\69\3\2\2\2\bG\3\2\2\2\nU\3\2\2\2\fc\3\2\2\2\16v\3\2\2\2\20\u0093"+
		"\3\2\2\2\22\u00a6\3\2\2\2\24\u00b9\3\2\2\2\26\u00e0\3\2\2\2\30\u00ea\3"+
		"\2\2\2\32\u00f2\3\2\2\2\34\35\b\2\1\2\35\36\b\2\1\2\36\37\5\4\3\2\37 "+
		"\b\2\1\2 (\3\2\2\2!\"\f\3\2\2\"#\7\35\2\2#$\5\4\3\2$%\b\2\1\2%\'\3\2\2"+
		"\2&!\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*(\3\2\2\2+,\b\3"+
		"\1\2,-\5\6\4\2-.\b\3\1\2.\66\3\2\2\2/\60\f\3\2\2\60\61\7\34\2\2\61\62"+
		"\5\6\4\2\62\63\b\3\1\2\63\65\3\2\2\2\64/\3\2\2\2\658\3\2\2\2\66\64\3\2"+
		"\2\2\66\67\3\2\2\2\67\5\3\2\2\28\66\3\2\2\29:\b\4\1\2:;\5\b\5\2;<\b\4"+
		"\1\2<D\3\2\2\2=>\f\3\2\2>?\7\33\2\2?@\5\b\5\2@A\b\4\1\2AC\3\2\2\2B=\3"+
		"\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FD\3\2\2\2GH\b\5\1\2HI"+
		"\5\n\6\2IJ\b\5\1\2JR\3\2\2\2KL\f\3\2\2LM\7\31\2\2MN\5\n\6\2NO\b\5\1\2"+
		"OQ\3\2\2\2PK\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2TR\3\2\2"+
		"\2UV\b\6\1\2VW\5\f\7\2WX\b\6\1\2X`\3\2\2\2YZ\f\3\2\2Z[\7\32\2\2[\\\5\f"+
		"\7\2\\]\b\6\1\2]_\3\2\2\2^Y\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\13"+
		"\3\2\2\2b`\3\2\2\2cd\b\7\1\2de\5\16\b\2ef\b\7\1\2fs\3\2\2\2gh\f\4\2\2"+
		"hi\7\30\2\2ij\5\16\b\2jk\b\7\1\2kr\3\2\2\2lm\f\3\2\2mn\7\27\2\2no\5\16"+
		"\b\2op\b\7\1\2pr\3\2\2\2qg\3\2\2\2ql\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2"+
		"\2\2t\r\3\2\2\2us\3\2\2\2vw\b\b\1\2wx\5\20\t\2xy\b\b\1\2y\u0090\3\2\2"+
		"\2z{\f\6\2\2{|\7\23\2\2|}\5\20\t\2}~\b\b\1\2~\u008f\3\2\2\2\177\u0080"+
		"\f\5\2\2\u0080\u0081\7\24\2\2\u0081\u0082\5\20\t\2\u0082\u0083\b\b\1\2"+
		"\u0083\u008f\3\2\2\2\u0084\u0085\f\4\2\2\u0085\u0086\7\25\2\2\u0086\u0087"+
		"\5\20\t\2\u0087\u0088\b\b\1\2\u0088\u008f\3\2\2\2\u0089\u008a\f\3\2\2"+
		"\u008a\u008b\7\26\2\2\u008b\u008c\5\20\t\2\u008c\u008d\b\b\1\2\u008d\u008f"+
		"\3\2\2\2\u008ez\3\2\2\2\u008e\177\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u0089"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\17\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\b\t\1\2\u0094\u0095\5\22\n"+
		"\2\u0095\u0096\b\t\1\2\u0096\u00a3\3\2\2\2\u0097\u0098\f\4\2\2\u0098\u0099"+
		"\7\21\2\2\u0099\u009a\5\22\n\2\u009a\u009b\b\t\1\2\u009b\u00a2\3\2\2\2"+
		"\u009c\u009d\f\3\2\2\u009d\u009e\7\22\2\2\u009e\u009f\5\22\n\2\u009f\u00a0"+
		"\b\t\1\2\u00a0\u00a2\3\2\2\2\u00a1\u0097\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\21\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\b\n\1\2\u00a7\u00a8\5\24\13\2\u00a8"+
		"\u00a9\b\n\1\2\u00a9\u00b6\3\2\2\2\u00aa\u00ab\f\4\2\2\u00ab\u00ac\7\17"+
		"\2\2\u00ac\u00ad\5\24\13\2\u00ad\u00ae\b\n\1\2\u00ae\u00b5\3\2\2\2\u00af"+
		"\u00b0\f\3\2\2\u00b0\u00b1\7\20\2\2\u00b1\u00b2\5\24\13\2\u00b2\u00b3"+
		"\b\n\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\23\3\2\2"+
		"\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\b\13\1\2\u00ba\u00bb\5\26\f\2\u00bb"+
		"\u00bc\b\13\1\2\u00bc\u00ce\3\2\2\2\u00bd\u00be\f\5\2\2\u00be\u00bf\7"+
		"\f\2\2\u00bf\u00c0\5\26\f\2\u00c0\u00c1\b\13\1\2\u00c1\u00cd\3\2\2\2\u00c2"+
		"\u00c3\f\4\2\2\u00c3\u00c4\7\r\2\2\u00c4\u00c5\5\26\f\2\u00c5\u00c6\b"+
		"\13\1\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8\f\3\2\2\u00c8\u00c9\7\16\2\2\u00c9"+
		"\u00ca\5\26\f\2\u00ca\u00cb\b\13\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00bd\3"+
		"\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\25\3\2\2\2\u00d0\u00ce\3\2\2"+
		"\2\u00d1\u00d2\5\30\r\2\u00d2\u00d3\b\f\1\2\u00d3\u00e1\3\2\2\2\u00d4"+
		"\u00d5\7\20\2\2\u00d5\u00d6\5\30\r\2\u00d6\u00d7\b\f\1\2\u00d7\u00e1\3"+
		"\2\2\2\u00d8\u00d9\7\13\2\2\u00d9\u00da\5\30\r\2\u00da\u00db\b\f\1\2\u00db"+
		"\u00e1\3\2\2\2\u00dc\u00dd\7\n\2\2\u00dd\u00de\5\30\r\2\u00de\u00df\b"+
		"\f\1\2\u00df\u00e1\3\2\2\2\u00e0\u00d1\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0"+
		"\u00d8\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1\27\3\2\2\2\u00e2\u00e3\5\32\16"+
		"\2\u00e3\u00e4\b\r\1\2\u00e4\u00eb\3\2\2\2\u00e5\u00e6\7\b\2\2\u00e6\u00e7"+
		"\5\2\2\2\u00e7\u00e8\7\t\2\2\u00e8\u00e9\b\r\1\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e2\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb\31\3\2\2\2\u00ec\u00ed\7\3\2"+
		"\2\u00ed\u00f3\b\16\1\2\u00ee\u00ef\7\5\2\2\u00ef\u00f3\b\16\1\2\u00f0"+
		"\u00f1\7\4\2\2\u00f1\u00f3\b\16\1\2\u00f2\u00ec\3\2\2\2\u00f2\u00ee\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\33\3\2\2\2\24(\66DR`qs\u008e\u0090\u00a1"+
		"\u00a3\u00b4\u00b6\u00cc\u00ce\u00e0\u00ea\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}