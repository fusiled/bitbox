package bitbox.commons.gui;

import bitbox.bitcombiner.OperationEnum;

import javax.swing.*;
import java.awt.*;

/**
 * Created by fusiled on 28/06/17.
 * @author fusiled <fusiled@gmail.com>
 *     Just a panel which keeps a TextField and a combobox
 *     Combbox shows elements in OperationEnum
 */
public final class OperationField extends JPanel {

    private final JTextField field;
    private final JComboBox<OperationEnum> chooseBox;

    public OperationField()
    {
        this.field = new JTextField();
        this.chooseBox = new JComboBox<>(OperationEnum.values());
        this.field.getDocument().putProperty("parentField", this.field);
        SwingUtilities.invokeLater(()->{
            this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
            this.setMaximumSize(new Dimension(10000,30));
            this.add(this.field);
            this.add(this.chooseBox);
        });
    }

    public String getOperator()
    {
        return this.chooseBox.getSelectedItem().toString();
    }

    public JTextField getJTextField()
    {
        return this.field;
    }

    public String getText()
    {
       return this.field.getText();
    }

    public JComboBox<OperationEnum> getChooseBox() {
        return this.chooseBox;
    }
}

