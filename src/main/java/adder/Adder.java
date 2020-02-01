package adder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adder extends JFrame implements ActionListener {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    private JTextField inOutField;
    private double sum = 0;

    public Adder() {
        setTitle("Adding Machine");
        addWindowFocusListener(new WindowDestroyer());
        setSize(WIDTH, HEIGHT);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setLayout(new FlowLayout());

        JButton addButton = new JButton("Add");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.BLUE);
        textPanel.setLayout(new FlowLayout());

        inOutField = new JTextField("Numbers go here.", 30);
        inOutField.setBackground(Color.WHITE);
        textPanel.add(inOutField );
        contentPane.add(textPanel, BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            sum = sum + stringToDouble(inOutField.getText());
            inOutField.setText(Double.toString(sum));
        } else if (e.getActionCommand().equals("Reset")){
            sum = 0;
            inOutField.setText("0.0");
        } else if (e.getActionCommand().equals("Clear")) {
            inOutField.setText("");
        } else
            inOutField.setText("Error in adder code.");
    }
    private static double stringToDouble(String stringObject) {
        return Double.parseDouble(stringObject.trim());
    }

    public static void main(String[] args) {
        Adder guiAdder1 = new Adder();
        guiAdder1.setVisible(true);

        Adder guiAdder2 = new Adder();
        guiAdder2.setVisible(true);
    }
}
