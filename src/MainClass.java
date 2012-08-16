import javax.swing.*;
import java.awt.*;

public class MainClass{
                         
    static JFrame frame = new JFrame("Tactics");
    
    static void setFrame(JPanel newPanel){
        MainClass.frame.dispose();
        MainClass.frame = new JFrame("Tactics");
        MainClass.frame.add(newPanel);
        MainClass.frame.setVisible(true);
        MainClass.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainClass.frame.setSize(480, 320);
    }

    public static void main(String[] args){
        frame.add(new StartMenu());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 320);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBackground(Color.WHITE);

       // Get the size of the screen
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

// Determine the new location of the window
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

// Move the window
        frame.setLocation(x, y);
    }
}
