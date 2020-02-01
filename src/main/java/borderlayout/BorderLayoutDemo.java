package borderlayout;

import javax.swing.*;
import java.awt.*;

/**
 * Simple demonstration of the use of a layout manager to arrange labels.
 */

public class BorderLayoutDemo extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public BorderLayoutDemo() {
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer());
        setTitle("Layout Demonstration");
        Container content = getContentPane();

        content.setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("First label here.");
        content.add(label1, "North");

        JLabel label2 = new JLabel("Second label there");
        content.add(label2, "South");

        JLabel label3 = new JLabel("Third label anywhere");
        content.add(label3, "Center");

        JLabel label4 = new JLabel("Fourth label everywhere");
        content.add(label4, "East");

        JLabel label5 = new JLabel("Fifth label over there");
        content.add(label5, "West");

    }
    /**
     * Creates and displays a window of the class BorderLayoutDemo
     */
    public static void main(String[] args) {
        var gui = new BorderLayoutDemo();
        gui.setVisible(true);
    }
}
