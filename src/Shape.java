import javax.swing.*;
import java.awt.*;


public class Shape extends JPanel {
    
    int x = Integer.parseInt(JOptionPane.showInputDialog("X Position : "));
    int y = Integer.parseInt(JOptionPane.showInputDialog("Y Position : "));
    int width = Integer.parseInt(JOptionPane.showInputDialog("Width : "));
    int height = Integer.parseInt(JOptionPane.showInputDialog("Height : "));

    Shape(){
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.drawRect(x, y, width, height);
    }


}
