// Generated from /home/fusiled/workspace/bitbox/src/main/java/bitbox/drawgrammar/DrawGrammar.g4 by ANTLR 4.7
package bitbox.drawgrammar;

import java.util.Set;
import java.util.HashSet;
import java.util.SortedMap;
import java.util.TreeMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawGrammarParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(DrawGrammarParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawGrammarParser#rangeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeList(DrawGrammarParser.RangeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawGrammarParser#rangeElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeElem(DrawGrammarParser.RangeElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawGrammarParser#bitRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitRange(DrawGrammarParser.BitRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawGrammarParser#number_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_list(DrawGrammarParser.Number_listContext ctx);
}