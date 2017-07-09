package bitbox.commons.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by fusiled on 09/07/17.
 * @author fusiled <fusiled@gmail.com>
 *     Just to JTextFields in a JPanel. Its purpose is to be used by the EditableBaseLogicGUI
 */
public final class EditableLabeledField extends JPanel {
    private final JTextField field;
    private final JTextField label;

    public EditableLabeledField(String labelText) {
        this.field = new JTextField();
        this.label = new JTextField(labelText);
        //this command allows to fetch the Document instance to add listeners easily.
        this.field.getDocument().putProperty("parentField", this.field);
        SwingUtilities.invokeLater(() -> {
            this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            this.setMaximumSize(new Dimension(10000, 30));
            this.add(this.label);
            this.add(this.field);
        });
    }

    public JTextField getJTextField() {
        return this.field;
    }

    public JTextField getLabelField() {
        return this.label;
    }
}
