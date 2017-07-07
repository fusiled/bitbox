package bitbox.bitpainter;

import bitbox.drawgrammar.DrawGrammarLexer;
import bitbox.drawgrammar.DrawGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RasterFormatException;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;

/**
 * Created by fusiled on 07/07/17.
 * Logic for the BitPainterLogicInterface. Parse the passed string and draw the asociated image
 * @author fusiled <fusiled@gmail.com>
 */
public class PainterLogic implements BitPainterLogicInterface {


    private static final int PADDING=10;
    private static final int SQUARE_FACTOR_X=4;
    private static final int SQUARE_FACTOR_Y=5;
    private static final int BUFFERED_IMAGE_PADDING = PADDING*2;
    private static final int DRAW_BOARD_Y=200;
    private static final int BUFFERED_IMAGE_MAX_X=2000;
    private static final int BUFFERED_IMAGE_MAX_Y=DRAW_BOARD_Y;


    public PainterLogic()
    {
        super();
    }

    @Override
    public SortedMap<Integer, String> parseString(String fieldString) {
        CharStream is = CharStreams.fromString(fieldString);
        DrawGrammarLexer lex = new DrawGrammarLexer(is);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        DrawGrammarParser parser = new DrawGrammarParser(tokens);
        final SortedMap<Integer, String> resultMap;
        try {
            resultMap = parser.root().map;
        }
        catch (RecognitionException | NullPointerException | StringIndexOutOfBoundsException | RasterFormatException re){
            //Something wrong with the parsing do not update.
            return null;
        }
        return resultMap;
    }

    public BufferedImage getImage(SortedMap<Integer,String> map) throws MapIsNullException{
        if(map==null){
            throw new MapIsNullException();
        }
        BufferedImage bImg = new BufferedImage(BUFFERED_IMAGE_MAX_X, BUFFERED_IMAGE_MAX_Y, BufferedImage.TYPE_INT_ARGB);
        Graphics2D cg = (Graphics2D) bImg.getGraphics();
        cg.setFont(new Font(Font.MONOSPACED,Font.PLAIN,10));
        int min=map.firstKey();
        int max=map.lastKey();
        int fontSize=cg.getFont().getSize()/2;
        cg.fillRect(0,0,BUFFERED_IMAGE_PADDING+(max-min+1)*SQUARE_FACTOR_X*fontSize,DRAW_BOARD_Y);
        cg.setPaint(Color.BLACK);
        Set<String> descSet=new HashSet();
        for(int i=0; i<=(max-min); i++)
        {
            int num_bit=i+min;
            String numString=Integer.toString(num_bit);
            if(!map.containsKey(num_bit)) {
                cg.setPaint(Color.lightGray);
                cg.fillRect(PADDING+i*SQUARE_FACTOR_X*fontSize,PADDING,SQUARE_FACTOR_X*fontSize,SQUARE_FACTOR_Y*fontSize);
                cg.setPaint(Color.BLACK);
            }
            else {
                String description= map.get(num_bit);
                if(description!=null && description.length()>0 && !descSet.contains(description)) {
                    cg.drawString(description,PADDING + i * SQUARE_FACTOR_X * fontSize, 30 + SQUARE_FACTOR_Y * fontSize + descSet.size() * (2*fontSize));
                    descSet.add(description);
                }
                if(description.length()>0) {
                    cg.drawLine(
                            PADDING + i * SQUARE_FACTOR_X * fontSize+fontSize,
                            30 + SQUARE_FACTOR_Y * fontSize + (descSet.size() - 1) * (fontSize + fontSize / 2)- fontSize*2,
                            PADDING + i * SQUARE_FACTOR_X * fontSize+fontSize,
                            PADDING+SQUARE_FACTOR_Y * fontSize
                    );
                }
            }
            cg.drawRect(PADDING + i * SQUARE_FACTOR_X * fontSize, PADDING, SQUARE_FACTOR_X * fontSize, SQUARE_FACTOR_Y * fontSize);
            cg.drawString(numString,PADDING+fontSize+i*SQUARE_FACTOR_X*fontSize, PADDING+2*fontSize);
        }
        return bImg.getSubimage(0,0,BUFFERED_IMAGE_PADDING+(max-min+1)*SQUARE_FACTOR_X*fontSize,DRAW_BOARD_Y);
    }

    @Override
    public BufferedImage parseAndGetImage(String fieldString) throws MapIsNullException {
        return this.getImage(this.parseString(fieldString));
    }

}
