package bitbox.bitpainter;

import java.awt.image.BufferedImage;
import java.util.SortedMap;

/**
 * Created by fusiled on 04/07/17.
 */
public interface BitPainterLogicInterface {


    SortedMap<Integer,String> parseString(String fieldString);

    BufferedImage getImage(SortedMap<Integer,String> resultMap) throws MapIsNullException;

    BufferedImage parseAndGetImage(String fieldString) throws MapIsNullException;
}
