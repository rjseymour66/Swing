package firstswingdemo;

import javax.swing.*;

public class FirstSwingDemo {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public static void main(String[] args) {
        var myWindow = new JFrame();
        myWindow.setSize(WIDTH, HEIGHT);
        var myLabel = new JLabel("I love you!");
        myWindow.getContentPane().add(myLabel);
        var myListener = new WindowDestroyer();
        myWindow.addWindowListener(myListener);
        myWindow.setVisible(true);
    }
}
