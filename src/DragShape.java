import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.*;

import java.awt.*;
import java.awt.geom.*;


public class DragShape extends JPanel implements MouseListener, MouseMotionListener {

    Graphics2D g2;
    Rectangle2D square;
    Color colour;

    double x1, y1, x2, y2, width, height;
    double offsetX, offsetY;

    boolean dragging = false;

    public DragShape(){

        x1 = Double.parseDouble(JOptionPane.showInputDialog("X Position"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("X Position"));
        width = Double.parseDouble(JOptionPane.showInputDialog("Width"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Height"));
        x2 = x1 + width;
        y2 = y1 + height;

    square = new Rectangle2D.Double(x1, y1, width, height);
    colour = Color.BLUE;

    setFocusable(true);
    addMouseListener(this);
    addMouseMotionListener(this);
    this.requestFocus();
    }

    public void paintComponent(Graphics g)
    {

        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.draw(square);
        g2.setColor(colour);
        g2.draw(square);

    }

    @Override
    public void mouseDragged(MouseEvent ev) 
    {
        System.out.println(ev.getX());
        if (dragging)
        {
            double mx = ev.getX();
            double my = ev.getY();

            x1 = mx - offsetX;
            y1 = my - offsetY;
            x2 = x1 + width;
            y2 = y1 + height;
            square = new Rectangle2D.Double(x1, y1, width, height);
            repaint();  
        }

}

    @Override
    public void mousePressed(MouseEvent ev) 
    {
       

            dragging = true;
            


    }

    @Override
    public void mouseReleased(MouseEvent arg0) 
    {
        dragging = false;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
        }
}
