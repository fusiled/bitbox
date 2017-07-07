package bitbox.bitpainter;

import bitbox.commons.gui.LabeledField;
import bitbox.commons.gui.TitledPanel;
import bitbox.drawgrammar.DrawGrammarLexer;
import bitbox.drawgrammar.DrawGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.image.RasterFormatException;
import java.util.SortedMap;

/**
 * Created by fusiled on 29/06/17.
 * @author fusiled <fusiled@gmail.com>
 *     Draw an image of the input string. Input string is a list of bits and string.
 */
public final class BitPainter extends TitledPanel {

    private final static String BIT_DRAWER_TITLE = "Bit Drawer";
    private final PaintBoard board;
    private final LabeledField definition;

    public BitPainter() {
        super(BIT_DRAWER_TITLE);
        this.board = new PaintBoard();
        this.definition = new LabeledField("Input");
        this.definition.getJTextField().getDocument().addDocumentListener(new FieldListener());
        SwingUtilities.invokeLater(()->{
            this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
            this.add(this.definition);
            this.add(this.board);
        });
    }

    private void drawFigure() {
        //Parse the string and build the image calling board.updateFigure method
        String equationString = this.definition.getJTextField().getText();
        CharStream is = CharStreams.fromString(equationString);
        DrawGrammarLexer lex = new DrawGrammarLexer(is);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        DrawGrammarParser parser = new DrawGrammarParser(tokens);
        SortedMap<Integer, String> resultMap;
        try {
            resultMap = parser.root().map;
        }
        catch (RecognitionException | NullPointerException | StringIndexOutOfBoundsException | RasterFormatException re){
            //Something wrong with the parsing do not update.
            return;
        }
        if(resultMap!=null && resultMap.size()>0) {
            this.board.updateFigure(resultMap);
        }
    }



    //FieldListener for the LabeledField called definition. Update the image avery time the text changes
    class FieldListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent documentEvent) {
            drawFigure();
        }

        @Override
        public void removeUpdate(DocumentEvent documentEvent) { drawFigure(); }

        @Override
        public void changedUpdate(DocumentEvent documentEvent) { drawFigure(); }

    }
}
