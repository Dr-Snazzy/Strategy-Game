import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

public class Options extends JPanel implements ActionListener {

    private Image image;

    private highlightArea highlighted;

    private enum highlightArea {
        RETURN(408, 29),
        NIL(20000, 20000);
        public int x, y;

        highlightArea(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public Options() {
        ImageIcon ii = new ImageIcon("res/options.png");
        image = ii.getImage();

        highlighted = highlightArea.NIL;
        addMouseListener(new MouseHandler());
        addMouseMotionListener(new MouseHandler());
        setFocusable(true);/* setFocusable and setDoubleBuffered are both necessary */
        setDoubleBuffered(true);
        setVisible(true);
        setBackground(Color.WHITE);
        Timer timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        draw(g, this);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void draw(Graphics graphics, ImageObserver imageObserver) {
        graphics.drawImage(image, 0, 0, imageObserver);
        graphics.setColor(Color.yellow);
        graphics.drawRect(highlighted.x, highlighted.y, 56, 100);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        repaint();
    }

    private class MouseHandler implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            if (highlighted == highlightArea.RETURN) {
                //StartMenu
                MainClass.setFrame(new StartMenu());
            }
        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {
        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {
        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {
        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {
        }

        @Override
        public void mouseDragged(MouseEvent mouseEvent) {
        }

        @Override
        public void mouseMoved(MouseEvent mouseEvent) {
            if (mouseEvent.getX() > 409 && mouseEvent.getX() < 465) {
                if (mouseEvent.getY() > 29 && mouseEvent.getY() < 129) {
                    highlighted = highlightArea.RETURN;
                }
            } else {
                highlighted = highlightArea.NIL;
            }
        }
    }
}