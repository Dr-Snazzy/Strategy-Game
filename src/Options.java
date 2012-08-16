import javax.swing.*;
import java.awt.*;

public class Options extends JPanel {
    Image optionsBackground;

    public Options() {
        ImageIcon ii = new ImageIcon("res/options.png");
        optionsBackground = ii.getImage();

    }
    StartMenu.p {
        graphics.drawImage(optionsBackground, 0, 0, null);
    }
}
