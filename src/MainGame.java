import javax.swing.*;

public class MainGame extends JFrame {

    public MainGame(){
        
        add(new Board());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 320);
        setLocationRelativeTo(null);
        setTitle("Tactics");
        setVisible(true);
        setResizable(false);
    }
}
