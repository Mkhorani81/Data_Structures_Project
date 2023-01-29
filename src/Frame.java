import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.*;

public class Frame extends JFrame implements ActionListener {
    JMenuBar menubar;//define menubar
    JMenu fileMenu;//define filemenu 
    JMenuItem Shape;//define item 
    JMenuItem DragShape;
    JMenuItem Map1;
    JMenuItem Map2;
    JMenuItem Map3;
    JMenuItem Map4;
    JMenuItem Map5;
    JMenuItem exit;

    Frame(){

        this.setSize(1000, 1000);//get size to frame
        this.setTitle("Map Coloring");//title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        menubar = new JMenuBar();//create menubar
        fileMenu = new JMenu("File");//create filemenu

        exit = new JMenuItem("Exit");//create items
        Shape = new JMenuItem("New Shape");
        DragShape = new JMenuItem("Drag Shape");
        Map1 = new JMenuItem("Map 1");
        Map2 = new JMenuItem("Map 2");
        Map3 = new JMenuItem("Map 3");
        Map4 = new JMenuItem("Map 4");
        Map5 = new JMenuItem("Map 5");
        
        exit.addActionListener(this);//get action listener
        Shape.addActionListener(this);
        DragShape.addActionListener(this);
        Map1.addActionListener(this);
        Map2.addActionListener(this);
        Map3.addActionListener(this);
        Map4.addActionListener(this);
        Map5.addActionListener(this);

        menubar.add(fileMenu);//adding
        fileMenu.add(Shape);
        fileMenu.add(DragShape);
        fileMenu.add(Map1);
        fileMenu.add(Map2);
        fileMenu.add(Map3);
        fileMenu.add(Map4);
        fileMenu.add(Map5);
        fileMenu.add(exit);


        this.setJMenuBar(menubar);
        this.setVisible(true);//set visible


    }

    @Override
    public void actionPerformed(ActionEvent e) {//action performed
        
        if(e.getSource() == Shape){
           Shape shape = new Shape();
           this.add(shape);
            
        }

        if(e.getSource() == DragShape){
           DragShape dragshape = new DragShape();
           this.add(dragshape);
            
        }

        if(e.getSource() == Map1){
            Map1 showmap = new Map1();
            this.add(showmap);
        }

        if(e.getSource() == Map2){
            Map2 showmap = new Map2();
            this.add(showmap);
        }

        if(e.getSource() == Map3){
            Map3 showmap = new Map3();
            this.add(showmap);
        }

        if(e.getSource() == Map4){
            Map4 showmap = new Map4();
            this.add(showmap);
        }
        if(e.getSource() == Map5){
            Map5 showmap = new Map5();
            this.add(showmap);
        }

        if(e.getSource() == exit){
            System.exit(0);
        }
        
    }
}
