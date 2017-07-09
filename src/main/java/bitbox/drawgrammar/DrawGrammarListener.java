// Generated from /home/fusiled/workspace/bitbox/src/main/java/bitbox/drawgrammar/DrawGrammar.g4 by ANTLR 4.7
package bitbox.drawgrammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawGrammarParser}.
 */
public interface DrawGrammarListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link DrawGrammarParser#root}.
     *
     * @param ctx the parse tree
     */
    void enterRoot(DrawGrammarParser.RootContext ctx);

    /**
     * Exit a parse tree produced by {@link DrawGrammarParser#root}.
     *
     * @param ctx the parse tree
     */
    void exitRoot(DrawGrammarParser.RootContext ctx);

    /**
     * Enter a parse tree produced by {@link DrawGrammarParser#rangeList}.
     *
     * @param ctx the parse tree
     */
    void enterRangeList(DrawGrammarParser.RangeListContext ctx);

    /**
     * Exit a parse tree produced by {@link DrawGrammarParser#rangeList}.
     *
     * @param ctx the parse tree
     */
    void exitRangeList(DrawGrammarParser.RangeListContext ctx);

    /**
     * Enter a parse tree produced by {@link DrawGrammarParser#rangeElem}.
     *
     * @param ctx the parse tree
     */
    void enterRangeElem(DrawGrammarParser.RangeElemContext ctx);

    /**
     * Exit a parse tree produced by {@link DrawGrammarParser#rangeElem}.
     *
     * @param ctx the parse tree
     */
    void exitRangeElem(DrawGrammarParser.RangeElemContext ctx);

    /**
     * Enter a parse tree produced by {@link DrawGrammarParser#bitRange}.
     *
     * @param ctx the parse tree
     */
    void enterBitRange(DrawGrammarParser.BitRangeContext ctx);

    /**
     * Exit a parse tree produced by {@link DrawGrammarParser#bitRange}.
     *
     * @param ctx the parse tree
     */
    void exitBitRange(DrawGrammarParser.BitRangeContext ctx);

    /**
     * Enter a parse tree produced by {@link DrawGrammarParser#number_list}.
     *
     * @param ctx the parse tree
     */
    void enterNumber_list(DrawGrammarParser.Number_listContext ctx);

    /**
     * Exit a parse tree produced by {@link DrawGrammarParser#number_list}.
     *
     * @param ctx the parse tree
     */
    void exitNumber_list(DrawGrammarParser.Number_listContext ctx);
}