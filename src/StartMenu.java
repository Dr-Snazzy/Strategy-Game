import javax.swing.*;
import java.awt.*;

public class StartMenu extends JComponent{


    Image menuBackground;

    public StartMenu() {
        ImageIcon ii = new ImageIcon("res/menuBackground.jpg");
        menuBackground = ii.getImage();
    }

    public void paint(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(menuBackground, 0, 0, null);
    }



}
