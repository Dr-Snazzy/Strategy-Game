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
        MainClass.frame.setResizable(false);
    }

    public static void main(String[] args){
        frame.add(new StartMenu());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 320);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBackground(Color.WHITE);
    }
}
