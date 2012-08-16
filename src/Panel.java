import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    Image fieldBackground;

    public Panel() {
        ImageIcon ii = new ImageIcon("res/Background.jpg");
        fieldBackground = ii.getImage();
    }
    public void paint(Graphics graphics) {
        graphics.drawImage(fieldBackground, 0, 0, null);
    }
}
