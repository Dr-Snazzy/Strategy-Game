import javax.swing.*;
import java.awt.*;
import java.awt.Image;

public class Board extends JPanel{

    public Board() {

        add(new StartMenu());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 320);
        setLocationRelativeTo(null);
        setTitle("Tactics");
        setVisible(true);
        setResizable(false);
    }

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