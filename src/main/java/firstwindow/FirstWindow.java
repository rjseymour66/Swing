package firstwindow;

import javax.swing.*;

/**
 * A simple window class.
 */

public class FirstWindow extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public FirstWindow(){
        super();
        setSize(WIDTH, HEIGHT);
        JLabel myLabel = new JLabel
                ("Please don't click that button!");
        getContentPane().add(myLabel);
        var listener = new WindowDestroyer();
        addWindowListener(listener);
    }
}
