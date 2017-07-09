package bitbox.baseconverter;

import bitbox.commons.gui.LabeledField;

import javax.swing.*;
import java.util.logging.Logger;

/**
 * Created by fusiled on 29/06/17.
 *
 * @author fusiled <fusiled@gmail.com>
 *         Mege BaseLogic and Labeled field to expose BaseLogic with the GUI.
 */
public class BaseLogicGUI implements BaseLogicGUIInterface {

    private final LabeledField field;
    private final BaseLogic baseLogic;

    private static final Logger LOGGER = Logger.getGlobal();

    BaseLogicGUI(String name, int base) {
        this.field = new LabeledField(name);
        this.baseLogic = new BaseLogic(base);
        this.field.getJTextField().setText(Long.toString(this.baseLogic.getValue()));
    }

    public int getBase() {
        return baseLogic.getBase();
    }


    public Long getValue() {
        try {
            long new_value = Long.parseLong(this.getJTextField().getText(), this.getBase());
            this.baseLogic.setValue(new_value);
        } catch (NumberFormatException nfe) {
            LOGGER.fine("Cannot parse value from the field in BaseLogicGUI "+this);
        }
        return this.baseLogic.getValue();
    }

    public void setValue(Long value) {
        this.baseLogic.setValue(value);
        //keep coherent. update the textfield
        this.field.getJTextField().setText(this.baseLogic.getStringValueConverted());
    }

    public JTextField getJTextField() {
        return this.field.getJTextField();
    }

    public JPanel getPanel() {
        return this.field;
    }
}
