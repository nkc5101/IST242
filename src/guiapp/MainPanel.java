package guiapp;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
    MainPanel() {
        JButton blueButton = new JButton("Blue");
        add(blueButton);

        JButton redButton = new JButton("Red");
        add(redButton);

        JButton johnIdeButton = new JButton("John Ide");
        add(johnIdeButton);
        
        JButton nateCoxButton = new JButton("Nate Cox");
        add(nateCoxButton);
            
        JButton weijunXuButton = new JButton("Weijun Xu");
        add(weijunXuButton);
    }
}
