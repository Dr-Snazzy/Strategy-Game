import javax.swing.*;
import java.awt.*;
import java.awt.Image;

public class Board extends JPanel{

    Image background;

    public Board() {
        ImageIcon ii = new ImageIcon("res/background.png");
        background = ii.getImage();
    }

    public void paint(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
    }
}