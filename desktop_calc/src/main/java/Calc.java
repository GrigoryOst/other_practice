import javax.swing.*;
import java.awt.*;

public class Calc {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalculatorFrame frame = new CalculatorFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        });
    }
}
