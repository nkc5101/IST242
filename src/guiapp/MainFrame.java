package guiapp;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
    MainFrame(){    
super("Paint Program");
    MainPanel mPanel = new MainPanel();
    getContentPane().add(mPanel);
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}
}
