package bitbox.bitpainter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by fusiled on 29/06/17.
 * Wrapper for the logic which produces the image (the BitPainterLogicInterface)
 *
 * @author fusiled <fusiled@gmail.com>
 */
public class PaintBoard extends JPanel {

    private final BitPainterLogicInterface painterLogic;
    private BufferedImage bImg;


    public PaintBoard() {

        this.painterLogic = new PainterLogic();
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(this.bImg, 0, 0, this);
    }

    public void updateFigure(String definitionString) {
        try {
            this.bImg = this.painterLogic.parseAndGetImage(definitionString);
            this.repaint();
        } catch (MapIsNullException e) {
            return;
        }
    }

    public BufferedImage getImage() {
        return this.bImg;
    }
}
