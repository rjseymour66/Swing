package secondwindow;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        var win1 = new SecondWindow();
        win1.setVisible(true);

        var win2 = new SecondWindow(Color.PINK);
        win2.setVisible(true);
    }
}
