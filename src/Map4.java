import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;
import java.awt.*;

public class Map4 extends JPanel implements ActionListener{

    Graphics g;
    JButton button;
    boolean answer_show = false;

    Map4(){
        this.setPreferredSize(new Dimension(1000, 1000));
        button = new JButton("Answer");
        button.setFocusable(false);
        button.addActionListener(this);
        button.setBounds(0, 450, 20, 20);
        button.setBackground(Color.gray);
        this.add(button);

        


    }

    public void paint(Graphics g){
        this.g = g;
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.WHITE);
        g2d.fillRect(0, 0, 1000, 1000);

        if(this.answer_show == true){
            
            g2d.setPaint(Color.RED);
            g2d.fillOval(200, 20, 20, 30);

            g2d.setPaint(Color.GREEN);
            g2d.fillOval(400, 40, 80, 90);


            g2d.setPaint(Color.GREEN);
            g2d.fillOval(200, 30, 100, 80);

            g2d.setPaint(Color.GRAY);
            g2d.fillOval(125, 35, 40, 50);

            g2d.setPaint(Color.green);
            g2d.fillOval(20, 200, 200, 150);
            
            g2d.setPaint(Color.RED);
            g2d.fillOval(85, 85, 120, 70);

            g2d.setPaint(Color.pink);
            g2d.fillOval(50, 250, 50, 50);

            
        }
        else{
            g2d.setPaint(Color.BLACK);
            g2d.drawOval(200, 20, 20, 30);
            g2d.drawOval(400, 40, 80, 90);
            g2d.drawOval(50, 250, 50, 50);
            g2d.drawOval(200, 30, 100, 80);
            g2d.drawOval(125, 35, 40, 50);
            g2d.drawOval(20, 200, 200, 150);
            g2d.drawOval(85, 85, 120, 70);
            
        }

        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            this.answer_show = !this.answer_show;
            repaint();
            
        }
    }

    
}
