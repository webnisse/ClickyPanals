import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Bakgrund extends JPanel implements MouseListener {

    //attrib
    //costr
    final int SIZE = 400;
    private boolean firstcolor = false;
    private boolean LR = false;
    public Bakgrund(){

        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(SIZE,SIZE));
        this.addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (LR) {
            g.drawOval(20, 20, 350, 350);
        } else {
            g.drawLine(0, 0, SIZE, SIZE);
            g.drawLine(0, SIZE, SIZE, 0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("YOU HAVE CLICKED!");
        if (!firstcolor){
            this.setBackground(Color.MAGENTA);
        }else {
            this.setBackground(Color.BLUE);
        }
        firstcolor=!firstcolor;
        if (e.getButton() == MouseEvent.BUTTON1) {
            LR = false;
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
            LR = true;
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //method

    //getset

}
