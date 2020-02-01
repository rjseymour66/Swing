package buttondemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo extends JFrame implements ActionListener {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public ButtonDemo() {
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer());
        setTitle("Button Demo");
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);

        contentPane.setLayout(new FlowLayout());

        JButton stopButton = new JButton("Red");
        stopButton.setActionCommand("Stop");
        stopButton.addActionListener(this);
        contentPane.add(stopButton);

        JButton goButton = new JButton("Green");
        goButton.setActionCommand("Go");
        goButton.addActionListener(this);
        contentPane.add(goButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Container contentPane = getContentPane();
        if (e.getActionCommand().equals("Stop"))
            contentPane.setBackground(Color.RED);
        else if (e.getActionCommand().equals("Go"))
            contentPane.setBackground(Color.GREEN);
        else
            System.out.println("Error in button interface.");
    }

    /**
     * Creates and displays a window of the class buttondemo
     * @param args
     */
    public static void main(String[] args) {

        ButtonDemo buttonGUI = new ButtonDemo();
        buttonGUI.setVisible(true);
    }
}
