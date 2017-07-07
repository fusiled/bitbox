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
            this.board.updateFigure(this.definition.getJTextField().getText());
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
