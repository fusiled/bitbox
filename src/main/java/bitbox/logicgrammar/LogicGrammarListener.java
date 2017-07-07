// Generated from /home/fusiled/workspace/bitbox/src/main/java/bitbox/logicgrammar/LogicGrammar.g4 by ANTLR 4.7
package bitbox.logicgrammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicGrammarParser}.
 */
public interface LogicGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(LogicGrammarParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(LogicGrammarParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#orl}.
	 * @param ctx the parse tree
	 */
	void enterOrl(LogicGrammarParser.OrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#orl}.
	 * @param ctx the parse tree
	 */
	void exitOrl(LogicGrammarParser.OrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#andl}.
	 * @param ctx the parse tree
	 */
	void enterAndl(LogicGrammarParser.AndlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#andl}.
	 * @param ctx the parse tree
	 */
	void exitAndl(LogicGrammarParser.AndlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#orb}.
	 * @param ctx the parse tree
	 */
	void enterOrb(LogicGrammarParser.OrbContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#orb}.
	 * @param ctx the parse tree
	 */
	void exitOrb(LogicGrammarParser.OrbContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#xorb}.
	 * @param ctx the parse tree
	 */
	void enterXorb(LogicGrammarParser.XorbContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#xorb}.
	 * @param ctx the parse tree
	 */
	void exitXorb(LogicGrammarParser.XorbContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#andb}.
	 * @param ctx the parse tree
	 */
	void enterAndb(LogicGrammarParser.AndbContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#andb}.
	 * @param ctx the parse tree
	 */
	void exitAndb(LogicGrammarParser.AndbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareLess}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompareLess(LogicGrammarParser.CompareLessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareLess}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompareLess(LogicGrammarParser.CompareLessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareGeq}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompareGeq(LogicGrammarParser.CompareGeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareGeq}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompareGeq(LogicGrammarParser.CompareGeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareGreat}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompareGreat(LogicGrammarParser.CompareGreatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareGreat}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompareGreat(LogicGrammarParser.CompareGreatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareLeq}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompareLeq(LogicGrammarParser.CompareLeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareLeq}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompareLeq(LogicGrammarParser.CompareLeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareSimple}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompareSimple(LogicGrammarParser.CompareSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareSimple}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompareSimple(LogicGrammarParser.CompareSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(LogicGrammarParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(LogicGrammarParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#addsub}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(LogicGrammarParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#addsub}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(LogicGrammarParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#muldivrem}.
	 * @param ctx the parse tree
	 */
	void enterMuldivrem(LogicGrammarParser.MuldivremContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#muldivrem}.
	 * @param ctx the parse tree
	 */
	void exitMuldivrem(LogicGrammarParser.MuldivremContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#neg}.
	 * @param ctx the parse tree
	 */
	void enterNeg(LogicGrammarParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#neg}.
	 * @param ctx the parse tree
	 */
	void exitNeg(LogicGrammarParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicGrammarParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(LogicGrammarParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicGrammarParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(LogicGrammarParser.BaseContext ctx);
}