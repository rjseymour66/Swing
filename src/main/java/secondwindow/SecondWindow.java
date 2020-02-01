package secondwindow;

import javax.swing.*;
import java.awt.*;

public class SecondWindow extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public SecondWindow() {
        super();
        setSize(WIDTH, HEIGHT);
        Container contentPane = getContentPane();
        JLabel label = new JLabel("Now available in color!");
        contentPane.add(label);

        setTitle("Second Window");
        contentPane.setBackground(Color.BLUE);

        addWindowListener(new WindowDestroyer());
    }
    public SecondWindow(Color customColor) {
        super();
        setSize(WIDTH, HEIGHT);
        Container contentPane = getContentPane();
        JLabel label = new JLabel("Now available in color!");
        contentPane.add(label);

        setTitle("Second Window");
        contentPane.setBackground(customColor);

        addWindowListener(new WindowDestroyer());
    }
}
