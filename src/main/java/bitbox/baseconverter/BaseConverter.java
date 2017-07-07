package bitbox.baseconverter;

import bitbox.commons.gui.TitledPanel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by fusiled on 18/04/17.
 * @author fusiled <fusiled@gmail.com>
 *     Just write in a number in a base and see how other bases change
 */
public class BaseConverter extends TitledPanel {

    private final List<BaseLogicGUIInterface> fields;

    private static final String BASE_CONVERTER_TITLE = "Base Converter";

    public BaseConverter()
    {
        super(BASE_CONVERTER_TITLE);
        this.fields = new LinkedList<>();
        BaseLogicGUIInterface decField = new BaseLogicGUI("dec",10);
        this.fields.add(decField);
        BaseLogicGUIInterface hexField = new BaseLogicGUI("hex",16);
        this.fields.add(hexField);
        BaseLogicGUIInterface binField = new BaseLogicGUI("bin",2);
        this.fields.add(binField);
        FieldListener fl = new FieldListener();
        JPanel panel = this; //trick to use the lambda
        SwingUtilities.invokeLater(() -> {
            for (BaseLogicGUIInterface field : fields)
            {
                panel.add(field.getPanel(), Component.RIGHT_ALIGNMENT);
                field.getJTextField().getDocument().addDocumentListener(fl);
            }
        });
    }

    class FieldListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent documentEvent) {
            updateFields(documentEvent,this);
        }

        @Override
        public void removeUpdate(DocumentEvent documentEvent) {
            updateFields(documentEvent,this);
            if(documentEvent.getLength()==0)
            {
                ((JTextField) documentEvent.getDocument().getProperty("parentField")).setText("0");
            }
        }

        @Override
        public void changedUpdate(DocumentEvent documentEvent) {
            //updateFields(documentEvent, this);
        }

        void updateFields(final DocumentEvent documentEvent, final FieldListener fl)
        {
            Runnable doAssist = () -> {
                JTextField field = (JTextField) documentEvent.getDocument().getProperty("parentField");
                Long newValue = 0L;
                for(BaseLogicGUIInterface lField: fields)
                {
                    if(lField.getJTextField()==field)
                    {
                        newValue = lField.getValue();
                    }
                    else
                    {
                        lField.getJTextField().getDocument().removeDocumentListener(fl);
                    }
                }
                for(BaseLogicGUIInterface lField: fields) {
                    if (lField.getJTextField() != field) {
                        lField.setValue(newValue);
                        lField.getJTextField().getDocument().addDocumentListener(fl);
                    }
                }
            };

            SwingUtilities.invokeLater(doAssist);
        }

    }

}
