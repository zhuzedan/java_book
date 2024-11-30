import javax.swing.*;
import java.awt.*;

public class Calculator9_3 extends JFrame {
    public Calculator9_3() {
        this.setTitle("计算器");
        this.setLayout(new GridLayout(4, 4, 5, 5));
        String[] num = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/"};
        for (int i = 0; i < 16; i++) {
            this.add(new JButton(num[i]));
        }
        this.pack();
        this.setLocation(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator9_3();
    }
}
