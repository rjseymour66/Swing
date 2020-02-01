package memosaver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoSaver extends JFrame implements ActionListener {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 300;
    public static final int LINES = 10;
    public static final int CHAR_PER_LINE = 40;

    private JTextArea theText;
    private String memo1 = "No Memo 1.";
    private String memo2 = "No Memo 2.";

    public MemoSaver() {
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer());
        setTitle("Memo Saver");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        var buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setLayout(new FlowLayout());

        var memo1Button = new JButton("Save Memo 1");
        memo1Button.addActionListener(this);
        buttonPanel.add(memo1Button);

        var memo2Button = new JButton("Save Memo 2");
        memo2Button.addActionListener(this);
        buttonPanel.add(memo2Button);

        var clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        var get1Button = new JButton("Get Memo 1");
        get1Button.addActionListener(this);
        buttonPanel.add(get1Button);

        var get2Button = new JButton("Get Memo 2");
        get2Button.addActionListener(this);
        buttonPanel.add(get2Button);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        var textPanel = new JPanel();
        textPanel.setBackground(Color.GRAY);

        theText = new JTextArea(LINES, CHAR_PER_LINE);
        theText.setBackground(Color.WHITE);
        theText.setLineWrap(true);
        textPanel.add(theText);
        contentPane.add(textPanel, BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("Save Memo 1"))
            memo1 = theText.getText();
        else if (actionCommand.equals("Save Memo 2"))
            memo2 = theText.getText();
        else if (actionCommand.equals("Clear"))
            theText.setText("");
        else if (actionCommand.equals("Get Memo 1"))
            theText.setText(memo1);
        else if (actionCommand.equals("Get Memo 2"))
            theText.setText(memo2);
        else
            theText.setText("Error in memo interface");
    }

    public static void main(String[] args) {
        MemoSaver guiMemo = new MemoSaver();
        guiMemo.setVisible(true);
    }
}
