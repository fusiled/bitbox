package bitbox.bitpainter;

import bitbox.commons.gui.LabeledField;
import bitbox.commons.gui.TitledPanel;
import bitbox.drawgrammar.DrawGrammarLexer;
import bitbox.drawgrammar.DrawGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RasterFormatException;
import java.io.File;
import java.io.IOException;
import java.util.SortedMap;

/**
 * Created by fusiled on 29/06/17.
 * @author fusiled <fusiled@gmail.com>
 *     Draw an image of the input string. Input string is a list of bits and string.
 */
public final class BitPainter extends TitledPanel {

    private final static String BIT_DRAWER_TITLE = "Bit Drawer";
    private static final String DEFAULT_DEFINITION_TEXT = "[1]\"this\",[2..4]\"is\",[6,8]\"example\",[7]\"an\"";
    private final PaintBoard board;
    private final LabeledField definition;

    public BitPainter() {
        super(BIT_DRAWER_TITLE);
        JPanel definitionPanel=new JPanel();
        this.board = new PaintBoard();
        this.definition = new LabeledField("Input");
        this.definition.getJTextField().getDocument().addDocumentListener(new FieldListener());
        JButton saveButton = new JButton(UIManager.getIcon("FileView.floppyDriveIcon"));
        saveButton.addActionListener(actionEvent -> {
            BufferedImage bImg=board.getImage();
            JFileChooser c = new JFileChooser();
            // Demonstrate "Save" dialog:
            int rVal = c.showSaveDialog(BitPainter.this);
            if (rVal == JFileChooser.APPROVE_OPTION) {
                String outputDestination=c.getSelectedFile().getAbsolutePath();
                outputDestination= outputDestination.endsWith(".png") ? outputDestination : outputDestination+".png";
                File outputFile = new File(outputDestination);
                try {
                    ImageIO.write(bImg, "png", outputFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        SwingUtilities.invokeLater(()->{
            this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
            definitionPanel.setMaximumSize(new Dimension(100000,13));
            definitionPanel.setLayout(new BorderLayout());
            definitionPanel.add(this.definition,BorderLayout.CENTER);
            this.definition.getJTextField().setText(DEFAULT_DEFINITION_TEXT);
            definitionPanel.add(saveButton,BorderLayout.EAST);
            this.add(definitionPanel);
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
