package bitbox.commons.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by fusiled on 18/04/17.
 * @author fusiled <fusiled@gmail.com>
 *  Just a Panel with a title assigned. A primary layout is set.
 *  Some style is created with the titled border
 */
public class TitledPanel extends JPanel {

    public TitledPanel(String title)
    {
        SwingUtilities.invokeLater(()->{
            this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
            this.setBorder(BorderFactory.createTitledBorder(title));
        });
    }
}
