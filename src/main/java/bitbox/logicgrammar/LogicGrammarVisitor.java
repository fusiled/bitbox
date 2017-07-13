// Generated from /home/fusiled/workspace/bitbox/src/main/java/bitbox/logicgrammar/LogicGrammar.g4 by ANTLR 4.7
package bitbox.logicgrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogicGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogicGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(LogicGrammarParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#orl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrl(LogicGrammarParser.OrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#andl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndl(LogicGrammarParser.AndlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#orb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrb(LogicGrammarParser.OrbContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#xorb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorb(LogicGrammarParser.XorbContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#andb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndb(LogicGrammarParser.AndbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareLess}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareLess(LogicGrammarParser.CompareLessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareGeq}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareGeq(LogicGrammarParser.CompareGeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareGreat}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareGreat(LogicGrammarParser.CompareGreatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareLeq}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareLeq(LogicGrammarParser.CompareLeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareSimple}
	 * labeled alternative in {@link LogicGrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareSimple(LogicGrammarParser.CompareSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise(LogicGrammarParser.BitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#addsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(LogicGrammarParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#muldivrem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldivrem(LogicGrammarParser.MuldivremContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(LogicGrammarParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(LogicGrammarParser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicGrammarParser#basednumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasednumber(LogicGrammarParser.BasednumberContext ctx);
}