package bitbox.commons.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by fusiled on 18/04/17.
 * @author fusiled <fusiled@gmail.com>
 */
public final class LabeledField extends JPanel {

    private final JTextField field;
    private final String name;

    public LabeledField(String name)
    {
        this.name = name;
        this.field = new JTextField();
        //this command allows to fetch the Document instance to add listeners easily.
        this.field.getDocument().putProperty("parentField", this.field);
        SwingUtilities.invokeLater(()->{
            this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
            this.setMaximumSize(new Dimension(10000,30));
            this.add(new JLabel(name), Component.CENTER_ALIGNMENT);
            this.add(this.field);
        });
    }


    public JTextField getJTextField()
    {
        return this.field;
    }

    public String getName() { return this.name;}
}
