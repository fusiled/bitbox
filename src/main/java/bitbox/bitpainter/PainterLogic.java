package bitbox.bitpainter;

import bitbox.commons.gui.IntPair;
import bitbox.commons.gui.Palette;
import bitbox.drawgrammar.DrawGrammarLexer;
import bitbox.drawgrammar.DrawGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RasterFormatException;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

/**
 * Created by fusiled on 07/07/17.
 * Logic for the BitPainterLogicInterface. Parse the passed string and draw the asociated image
 *
 * @author fusiled <fusiled@gmail.com>
 */
public class PainterLogic implements BitPainterLogicInterface {


    private static final int PADDING = 10;
    private static final int SQUARE_FACTOR_X = 4;
    private static final int SQUARE_FACTOR_Y = 5;
    private static final int BUFFERED_IMAGE_PADDING = PADDING * 2;
    private static final int DRAW_BOARD_Y = 200;
    private static final int BUFFERED_IMAGE_MAX_X = 3000;
    private static final int BUFFERED_IMAGE_MAX_Y = DRAW_BOARD_Y;

    private Palette palette;


    public PainterLogic() {
        super();
    }

    @Override
    public SortedMap<Integer, String> parseString(String fieldString) {
        CharStream is = CharStreams.fromString(fieldString);
        DrawGrammarLexer lex = new DrawGrammarLexer(is);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        DrawGrammarParser parser = new DrawGrammarParser(tokens);
        palette = Palette.makeDefaultPalette("DarkSpectrum");
        final SortedMap<Integer, String> resultMap;
        try {
            resultMap = parser.root().map;
        } catch (RecognitionException | NullPointerException | StringIndexOutOfBoundsException | RasterFormatException re) {
            //Something wrong with the parsing do not update.
            return null;
        }
        return resultMap;
    }

    public BufferedImage getImage(SortedMap<Integer, String> map) throws MapIsNullException {
        if (map == null) {
            throw new MapIsNullException();
        }
        BufferedImage bImg = new BufferedImage(BUFFERED_IMAGE_MAX_X, BUFFERED_IMAGE_MAX_Y, BufferedImage.TYPE_INT_ARGB);
        Graphics2D cg = (Graphics2D) bImg.getGraphics();
        cg.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        cg.setBackground(Color.WHITE);
        //cg.setStroke(new BasicStroke(2));
        cg.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        int min = map.firstKey();
        int max = map.lastKey();
        int fontSize = cg.getFont().getSize() / 2;
        cg.fillRect(0, 0, BUFFERED_IMAGE_MAX_X, BUFFERED_IMAGE_MAX_Y);
        cg.setPaint(Color.BLACK);
        Map<String, IntPair> descPosMap = new HashMap();
        Map<String, Color> descColMap = new HashMap();
        for (int i = max - min; i >= 0; i--) {
            int num_bit = i + min;
            String numString = Integer.toString(num_bit);
            if (!map.containsKey(num_bit)) {
                cg.setPaint(Color.lightGray);
                cg.fillRect(PADDING + i * SQUARE_FACTOR_X * fontSize, PADDING, SQUARE_FACTOR_X * fontSize, SQUARE_FACTOR_Y * fontSize);
                cg.setPaint(Color.BLACK);
            } else {
                String description = map.get(num_bit);
                IntPair stringPosition;
                int descriptionExists = 0;
                if (description.length() > 0) {
                    if (!descPosMap.keySet().contains(description)) {
                        stringPosition = new IntPair(PADDING + i * SQUARE_FACTOR_X * fontSize, 30 + SQUARE_FACTOR_Y * fontSize + descPosMap.size() * 3 * fontSize);
                        descPosMap.put(description, stringPosition);
                        cg.setColor(Color.WHITE);
                        cg.fillRect(stringPosition.getX(), stringPosition.getY() - fontSize, description.length() * fontSize, 2 * fontSize);
                        Color descColor = palette.getColor((double) i / (max - min));
                        descColMap.put(description, descColor);
                        cg.setColor(descColor);
                        cg.drawString(description, stringPosition.getX(), stringPosition.getY() + fontSize);
                    } else {
                        descriptionExists = 1;
                        stringPosition = descPosMap.get(description);
                        cg.setColor(descColMap.get(description));
                        cg.drawLine(
                                stringPosition.getX() + fontSize,
                                stringPosition.getY() - fontSize * 2,
                                PADDING + i * SQUARE_FACTOR_X * fontSize + fontSize,
                                stringPosition.getY() - fontSize * 2
                        );
                    }
                    cg.drawLine(
                            PADDING + i * SQUARE_FACTOR_X * fontSize + fontSize,
                            stringPosition.getY() - fontSize * (1 + descriptionExists),
                            PADDING + i * SQUARE_FACTOR_X * fontSize + fontSize,
                            PADDING + SQUARE_FACTOR_Y * fontSize
                    );
                }
            }
            cg.drawRect(PADDING + i * SQUARE_FACTOR_X * fontSize, PADDING, SQUARE_FACTOR_X * fontSize, SQUARE_FACTOR_Y * fontSize);
            cg.drawString(numString, PADDING + fontSize + i * SQUARE_FACTOR_X * fontSize, PADDING + 3 * fontSize);
            cg.setColor(Color.BLACK);
        }
        BufferedImage returned_bImg = bImg.getSubimage(
                0,
                0,
                2 * BUFFERED_IMAGE_PADDING + (max - min + 1) * SQUARE_FACTOR_X * fontSize + map.get(map.lastKey()).length() * fontSize,
                DRAW_BOARD_Y);

        return returned_bImg;
    }

    @Override
    public BufferedImage parseAndGetImage(String fieldString) throws MapIsNullException {
        return this.getImage(this.parseString(fieldString));
    }

}
