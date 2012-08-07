import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

public class StartMenu extends JPanel implements ActionListener {
    
    private Image image;
    
    private highlightArea highlighted;
    
    private enum highlightArea {
    
        TOP(220, 20),
        MID(222, 108),
        BOT(225, 193),
        NIL(220, 300);
    
        public int y, x;
    
        highlightArea(int x, int y) {
            this.y = y;
            this.x = x;
    
        }
    }
    
    public StartMenu() {
        
        image = new ImageIcon("res/menuBackground.jpg").getImage();
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
        graphics.drawRect(highlighted.x, highlighted.y, 170, 70);
    }
    
    @Override    
    public void actionPerformed(ActionEvent actionEvent) {
        repaint();
    }
    
    private class MouseHandler implements MouseListener, MouseMotionListener {
        
        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            
            if (highlighted == highlightArea.TOP) {

            }
            
            else if (highlighted == highlightArea.MID) {
                //Options
                
            } else if (highlighted == highlightArea.BOT) {
                //quit
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

            if (mouseEvent.getX() > 220 && mouseEvent.getX() < 390) {

                if (mouseEvent.getY() > 20 && mouseEvent.getY() < 95) {
                    highlighted = highlightArea.TOP;
                } else if (mouseEvent.getY() > 108 && mouseEvent.getY() < 183) {
                    highlighted = highlightArea.MID;
                } else if (mouseEvent.getY() > 193 && mouseEvent.getY() < 268) {
                    highlighted = highlightArea.BOT;
                } else {
                    highlighted = highlightArea.NIL;
                }
            } else {
                highlighted = highlightArea.NIL;
            }
        }
    }
}