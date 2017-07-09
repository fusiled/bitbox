package bitbox.baseconverter;

/**
 * Created by fusiled on 02/07/17.
 * @author fusiled <fusiled@gmail.com>
 *     Interface for the BaseLogic, which is the class that produces a number representation in a specified base
 */
public interface BaseLogicInterface {


    int getBase();

    Long getValue();

    void setValue(Long value);
}
