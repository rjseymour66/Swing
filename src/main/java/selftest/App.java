package selftest;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public App() {
        setSize(WIDTH, HEIGHT);
    }

    public static void main(String[] args) {

        /*
        var myWindow = new JFrame();
        myWindow.setSize(WIDTH, HEIGHT);
        var myLabel = new JLabel("This is my test window");
        myWindow.getContentPane().add(myLabel);
        myWindow.setVisible(true);
        */

        double d = 7.77;
        String s = Double.toString(d);

        String str = "3.14159";
        double dub = Double.parseDouble(str);

        System.out.println("s::" + s);
        System.out.println("double:: " + dub);
    }

    //Container contentPane = w.getContentPane();

    // create a text field called anme that starts out with the text "Your name here"
    // and has room for 30 more visible characters.

    /*
    JPanel aPanel = new JPanel();
    JTextField name = new JTextField("Your name here", 30);
    aPanel.add(name);
    */

}
