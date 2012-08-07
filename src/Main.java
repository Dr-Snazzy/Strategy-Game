import javax.swing.*;

public class Main extends JFrame {



    public Main() {

        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 320);
        setLocationRelativeTo(null);
        setTitle("Tactics");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}


