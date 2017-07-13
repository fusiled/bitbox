package bitbox.bitcombiner;

import bitbox.commons.gui.LabeledField;
import bitbox.commons.gui.OperationField;
import bitbox.commons.gui.TitledPanel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.logging.Logger;

/**
 * Created by fusiled on 18/04/17.
 *
 * @author fusiled <fusiled@gmail.com>
 *         <p>
 *         Panel integer operation facility. It allows to produce the result of a serie of integer operations.
 *         You can write a piece of expression in a field and concatenate it with an operator
 *         Buttons add and remove fields.
 */
public final class BitCombiner extends TitledPanel {


    //Title of our frame
    private final static String BIT_COMBINER_TITLE = "Bit Combiner";
    private static final Logger LOGGER = Logger.getGlobal();
    //Panel where all the lines are kept
    private final JPanel panelField;
    //all the lines
    private final Deque<OperationField> fields;
    //the field of the result
    private final LabeledField result;

    public BitCombiner() {
        super(BIT_COMBINER_TITLE);
        //override layout
        //create the button to add lines
        JButton addLineButton = new JButton("+");
        addLineButton.addActionListener(new AddLineListener());
        //create the button to remove lines
        JButton removeLineButton = new JButton("-");
        removeLineButton.addActionListener(new RemoveLineListener());

        //create queue to keep new lines
        this.fields = new ArrayDeque<>();
        //Create result field
        this.result = new LabeledField("Res:");
        //Create panel to keep lines
        panelField = new JPanel();
        //add al the elements to the panel
        SwingUtilities.invokeLater(() -> {
            this.setLayout(new BorderLayout());
            this.result.getJTextField().setEditable(false);
            removeLineButton.setBackground(Color.RED);
            addLineButton.setBackground(Color.GREEN);
            this.result.getJTextField().setBackground(Color.WHITE);
            panelField.setLayout(new BoxLayout(panelField, BoxLayout.Y_AXIS));
            this.fields.add(instantiateOperationField());
            for (OperationField field : fields) {
                panelField.add(field);
            }
            this.add(panelField, BorderLayout.CENTER);
            this.add(result, BorderLayout.SOUTH);
            //add buttons to the panel
            this.add(addLineButton, BorderLayout.EAST);
            this.add(removeLineButton, BorderLayout.WEST);
            LOGGER.fine("BitCombiner panel instantiated successfully");
        });
    }

    //set the result field. Used by listeners
    private void setResult(Long result) {
        SwingUtilities.invokeLater(() -> this.result.getJTextField().setText(result.toString()));
    }

    //Helper. It generates a new line and set all the related stuff (listeners)
    private OperationField instantiateOperationField() {
        OperationField newField = new OperationField();
        newField.setMinimumSize(new Dimension(30, -1));
        newField.getJTextField().getDocument().addDocumentListener(new FieldListener());
        newField.getChooseBox().addActionListener(actionEvent -> updateResultField());
        return newField;
    }

    //called when the update of the result field is neeed -> a line is changed or removed
    //a grammar is used to compute the result.
    private void updateResultField() {
        //Build the expression in stringbuilder concatenating expressions with the related operator
        //The last operation is ignored
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<OperationField> fieldIterator = fields.descendingIterator();
        //Iterate over the fields
        while (fieldIterator.hasNext()) {
            OperationField field = fieldIterator.next();
            String fieldText = field.getText();
            //ignore empty fields
            if (fieldText == null || fieldText.equals("")) {
                stringBuilder.append(0);
                continue;
            }
            stringBuilder.append("(");
            stringBuilder.append(fieldText);
            stringBuilder.append(")");
            if (fieldIterator.hasNext()) {
                stringBuilder.append(field.getOperator());
            }
        }

        try {
            final long final_result = CombinerLogicInterface.getResult(stringBuilder.toString());
            SwingUtilities.invokeLater(() -> setResult(final_result));
        } catch (LogicGrammarParsingException e) {
            LOGGER.fine("LogicGrammarParsingException. Result won't be updated");
        }
    }

    //Listener used to add lines
    class AddLineListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            //Create a new line and push it in the stack. Also
            //redraw the panel.
            OperationField newField = instantiateOperationField();
            fields.push(newField);
            SwingUtilities.invokeLater(() -> {
                panelField.add(newField);
                panelField.revalidate();
                panelField.updateUI();
                newField.getJTextField().requestFocusInWindow();
                LOGGER.fine("Added a new OperationField. Now the field stack has size " + fields.size());
            });
        }
    }

    //remove a line from fields.
    class RemoveLineListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (fields.size() == 0) {
                return;
            }
            OperationField removing_field = fields.pop();
            SwingUtilities.invokeLater(() -> {
                panelField.remove(removing_field);
                if (!fields.isEmpty()) {
                    updateResultField();
                }
                panelField.revalidate();
                panelField.updateUI();
                if (!fields.isEmpty()) {
                    fields.peek().getJTextField().requestFocusInWindow();
                }
            });
        }
    }

    //Detect if a field that have this listener has been modified
    //If if was modified, then updateresult
    class FieldListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent documentEvent) {
            updateResultField();
        }
        @Override
        public void removeUpdate(DocumentEvent documentEvent) {
            updateResultField();
            if (documentEvent.getLength() == 0) {
                SwingUtilities.invokeLater(() -> ((JTextField) documentEvent.getDocument().getProperty("parentField")).setText("0"));
            }
        }

        @Override
        public void changedUpdate(DocumentEvent documentEvent) {
            //DO NOTHING
        }

    }
}
