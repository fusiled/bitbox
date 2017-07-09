package bitbox.baseconverter;

import javax.swing.*;

/**
 * Created by fusiled on 02/07/17.
 * @author fusiled <fusiled@gmail.com>
 *     Interface for the GUI elements which wraps BaseLogic functionalities.
 */
public interface BaseLogicGUIInterface extends BaseLogicInterface {


    JTextField getJTextField();

    JPanel getPanel();
}
