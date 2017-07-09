package bitbox.baseconverter;

import bitbox.commons.gui.EditableLabeledField;

import javax.swing.*;
import java.util.logging.Logger;

/**
 * Created by fusiled on 09/07/17.
 * @author fusiled <fusiled@gmail.com>
 *     This is the brother of BaseLogicGUI. It's very similar, but insted of a label there's aJTextField. You can alter this
 *     field to change the base.
 */
public class EditableBaseLogicGUI implements BaseLogicGUIInterface {

    private static final Logger LOGGER = Logger.getGlobal();
    private final EditableLabeledField field;
    private BaseLogic baseLogic;


    EditableBaseLogicGUI() {
        this.field = new EditableLabeledField("2");
        this.field.getLabelField().getDocument().putProperty("parentEditable", this);
        this.baseLogic = new BaseLogic(2);
    }

    public int getBase() {
        return baseLogic.getBase();
    }

    void setBase(int base) {
        System.out.println("updating base of " + this + " to " + base);
        long oldValue = this.baseLogic.getValue();
        this.baseLogic = new BaseLogic(base);
        this.setValue(oldValue);
    }

    public Long getValue() {
        if (baseLogic.getBase() == 0) {
            return 0L;
        }
        try {
            long new_value = Long.parseLong(this.getJTextField().getText(), this.getBase());
            this.baseLogic.setValue(new_value);
        } catch (NumberFormatException nfe) {
            LOGGER.fine("Cannot parse a new value in EditableBaseLogicGUI "+this);
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

    JTextField getLabelField() {
        return this.field.getLabelField();
    }

}
