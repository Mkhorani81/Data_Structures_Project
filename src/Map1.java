import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;
import java.awt.*;

public class Map1 extends JPanel implements ActionListener{

    Graphics g;
    JButton button;
    boolean answer_show = false;

    Map1(){
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
            
            g2d.setPaint(Color.BLUE);
            g2d.fillRect(10, 10, 100, 80);

            g2d.setPaint(Color.YELLOW);
            g2d.fillRect(450, 500, 80, 90);

            g2d.setPaint(Color.YELLOW);
            g2d.fillRect(500, 200, 50, 50);

            g2d.setPaint(Color.YELLOW);
            g2d.fillRect(30, 30, 100, 80);

            g2d.setPaint(Color.ORANGE);
            g2d.fillRect(250, 35, 40, 50);

            g2d.setPaint(Color.green);
            g2d.fillRect(200, 20, 200, 150);

            g2d.setPaint(Color.yellow);
            g2d.fillRect(450, 95, 120, 70);

            g2d.setPaint(Color.gray);
            g2d.fillRect(190, 100, 160, 130);

            g2d.setPaint(Color.MAGENTA);
            g2d.fillRect(500, 50, 50, 30);
            
            g2d.setPaint(Color.darkGray);
            g2d.fillRect(350, 190, 80, 100);
        }
        else{
            g2d.setPaint(Color.BLACK);
            g2d.drawRect(10, 10, 100, 80);
            g2d.drawRect(450, 500, 80, 90);
            g2d.drawRect(500, 200, 50, 50);
            g2d.drawRect(30, 30, 100, 80);
            g2d.drawRect(250, 35, 40, 50);
            g2d.drawRect(200, 20, 200, 150);
            g2d.drawRect(450, 95, 120, 70);
            g2d.drawRect(190, 100, 160, 130);
            g2d.drawRect(500, 50, 50, 30);
            g2d.drawRect(350, 190, 80, 100);
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
