import javax.swing.*;

public class Main extends JFrame {


    public Main() {

        add(new StartMenu());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 320);
        setLocationRelativeTo(null);
        setTitle("Tactics");
        setVisible(true);
        setResizable(false);
    }
    
    

    public static void main(String[] args) {
        new Main();
    }
}


