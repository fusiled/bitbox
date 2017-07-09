package bitbox.baseconverter;

import bitbox.commons.gui.TitledPanel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Logger;

/**
 * Created by fusiled on 18/04/17.
 *
 * @author fusiled <fusiled@gmail.com>
 *
 *         Just write in a number in a base and see how other bases change. BaseLogicGUI and EditableBaseLogiGUI references
 *         are stored into fields queue. The FieldListener allows to update every element contained in the fields queue.
 *         Be careful! when you update the text of a field you must remove the FieldListener and then re-add it, otherwis
 *         there will be a continuous call to it (and the program will stuck).
 */
public class BaseConverter extends TitledPanel {

    private static final String BASE_CONVERTER_TITLE = "Base Converter";
    private static final Logger LOGGER = Logger.getGlobal();

    private static final int EDITABLE_BASE_FIELD_NUM = 3;
    private final Deque<BaseLogicGUIInterface> fields;

    private final FieldListener baseConverterFieldListener;

    public BaseConverter() {
        super(BASE_CONVERTER_TITLE);
        this.fields = new ArrayDeque<>();
        //Instantiate fields
        BaseLogicGUIInterface hexField = new BaseLogicGUI("hex", 16);
        BaseLogicGUIInterface decField = new BaseLogicGUI("dec", 10);
        BaseLogicGUIInterface binField = new BaseLogicGUI("bin", 2);
        this.baseConverterFieldListener = new FieldListener();
        this.fields.add(decField);
        this.fields.add(hexField);
        this.fields.add(binField);
        SwingUtilities.invokeLater(() -> {
            for(BaseLogicGUIInterface field : fields) {
                this.add(field.getPanel(), Component.RIGHT_ALIGNMENT);
                field.getJTextField().getDocument().addDocumentListener(this.baseConverterFieldListener);
            }
            for(int i=0; i<EDITABLE_BASE_FIELD_NUM; i++)
            {
                BaseLogicGUIInterface editableField = instantiateEditableLabeledField();
                this.fields.add(editableField);
                this.add(editableField.getPanel());
            }
            LOGGER.fine("BaseConverter GUI created");
        });
        //buttons to add fields
    }

    /**
     * Helper  function to build an EditableBaseGUI instance ready to be used
     * @return an EditableBaseGUI instance
     */
    private BaseLogicGUIInterface instantiateEditableLabeledField() {
        EditableBaseLogicGUI newField = new EditableBaseLogicGUI();
        newField.getJTextField().setMinimumSize(new Dimension(30, -1));
        newField.getJTextField().getDocument().addDocumentListener(this.baseConverterFieldListener);
        this.fields.add(newField);
        //this is used to detect update of the labelField
        newField.getLabelField().getDocument().addDocumentListener(new LabelListener());
        LOGGER.finest("Returning a new EditableBaseLogicGUI "+newField );
        return newField;
    }

    /**
     * When you want to update the passed editableField with its value without altering the other fields
     */
    private void updateSingleField(EditableBaseLogicGUI editableField) {
        try {
            editableField.setBase(Integer.parseInt(editableField.getLabelField().getText()));
            editableField.getJTextField().getDocument().removeDocumentListener(this.baseConverterFieldListener);
            editableField.setValue(editableField.getValue());
            editableField.getJTextField().getDocument().addDocumentListener(this.baseConverterFieldListener);
            LOGGER.fine("Updated value of single field of "+editableField);
        } catch (NumberFormatException nfe) {
            editableField.getJTextField().getDocument().removeDocumentListener(this.baseConverterFieldListener);
            editableField.setValue(0L);
            editableField.getJTextField().setText("");
            editableField.getJTextField().getDocument().addDocumentListener(this.baseConverterFieldListener);
            LOGGER.fine("Reset value of "+editableField+" to zero due to NumberFormatException of label field");
        }
    }

    /**
     * Class to manage the updates of all the fields.
     */
    class FieldListener implements DocumentListener {

        //If a field changes, then update the others.
        @Override
        public void insertUpdate(DocumentEvent documentEvent) {
            updateFields(documentEvent);
        }

        /**
         * In this case just set the text to zero
         */
        @Override
        public void removeUpdate(DocumentEvent documentEvent) {
            updateFields(documentEvent);
            if (documentEvent.getLength() == 0) {
                documentEvent.getDocument().removeDocumentListener(baseConverterFieldListener);
                ((JTextField) documentEvent.getDocument().getProperty("parentField")).setText("");
                documentEvent.getDocument().addDocumentListener(baseConverterFieldListener);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent documentEvent) {
            //DO NOTHING. The other two methods are enough.
        }

        /**
         * Update the fields in thefields queue. At first iterate to fetch the value used by the updated and to remove
         * the FieldListener baseConverterFieldListener, the update the values, then re-inster the FieldListener
         */
        void updateFields(final DocumentEvent documentEvent) {
            LOGGER.finest("Call to field update");
            Runnable doAssist = () -> {
                JTextField field = (JTextField) documentEvent.getDocument().getProperty("parentField");
                if (field.getText().equals("")) {
                    for (BaseLogicGUIInterface lField : fields) {
                        lField.getJTextField().getDocument().removeDocumentListener(baseConverterFieldListener);
                        lField.getJTextField().setText("");
                        lField.getJTextField().getDocument().addDocumentListener(baseConverterFieldListener);
                    }
                } else {
                    Long newValue = 0L;
                    for (BaseLogicGUIInterface lField : fields) {
                        if (lField.getJTextField() == field) {
                            newValue = lField.getValue();
                        }
                        lField.getJTextField().getDocument().removeDocumentListener(baseConverterFieldListener);
                    }
                    for (BaseLogicGUIInterface lField : fields) {
                        if (lField.getJTextField() != field) {
                            lField.setValue(newValue);
                        }
                    }
                    for (BaseLogicGUIInterface lField : fields) {
                        lField.getJTextField().getDocument().addDocumentListener(baseConverterFieldListener);
                    }
                }
            };

            SwingUtilities.invokeLater(doAssist);
        }

    }

    /**
     * Used when there's a modification in the label field of EditableBaseLogicGUI instances.
     */
    class LabelListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent documentEvent) {
            updateSingleField((EditableBaseLogicGUI) documentEvent.getDocument().getProperty("parentEditable"));
        }

        @Override
        public void removeUpdate(DocumentEvent documentEvent) {
            updateSingleField((EditableBaseLogicGUI) documentEvent.getDocument().getProperty("parentEditable"));
        }

        @Override
        public void changedUpdate(DocumentEvent documentEvent) {
            //noting
        }
    }

}
