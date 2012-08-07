import javax.swing.*;
import java.awt.*;
import java.awt.Image;

public class Board extends JPanel{

    Image c;

    public Board() {
        ImageIcon ii = new ImageIcon("res/background.png");
        c = ii.getImage();
    }

    public void paint(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(c, 0, 0, null);
    }
}