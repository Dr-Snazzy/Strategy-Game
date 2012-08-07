import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Main extends JFrame {


    public Main() {

        JPanel mousepanel = new JPanel();
       
        JLabel pic = new JLabel(new ImageIcon("res/menuBackground.jpg"));
        
        mousepanel.add(pic, BorderLayout.CENTER);
        
        

        add(mousepanel, BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 320);
        setLocationRelativeTo(null);
        setTitle("Tactics");
        setVisible(true);
        setResizable(false);

        Handlerclass handler = new Handlerclass();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);
    }

    private class Handlerclass implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent event){

            new MainGame();
        }

        public void mousePressed(MouseEvent mouseEvent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        public void mouseReleased(MouseEvent mouseEvent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        public void mouseEntered(MouseEvent mouseEvent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        public void mouseExited(MouseEvent mouseEvent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        public void mouseDragged(MouseEvent mouseEvent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        public void mouseMoved(MouseEvent mouseEvent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }
    
    

    public static void main(String[] args) {
        new Main();
    }
}


