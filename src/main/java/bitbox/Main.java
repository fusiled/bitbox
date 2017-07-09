package bitbox;

import bitbox.baseconverter.BaseConverter;
import bitbox.bitcombiner.BitCombiner;
import bitbox.bitpainter.BitPainter;

import javax.swing.*;
import java.awt.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final int GRID_SIZE = 3;

    public static void main(String[] args) {
        Logger log = Logger.getGlobal();
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        log.addHandler(handler);
        log.setLevel(Level.ALL);
        JFrame fra = new JFrame("bitbox");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        BaseConverter baseConverter = new BaseConverter();
        BitCombiner bitCombiner = new BitCombiner();
        BitPainter bitPainter = new BitPainter();
        SwingUtilities.invokeLater(() -> {
            fra.setSize(new Dimension(500, screenSize.height));
            fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fra.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
            fra.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            fra.add(baseConverter);
            //fra.add(bitCombiner);
            //fra.add(bitPainter);
            fra.setVisible(true);
            log.fine("Created GUI");
        });
    }
}
