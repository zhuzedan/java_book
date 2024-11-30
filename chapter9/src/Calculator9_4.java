import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator9_4 extends JFrame {
    public Calculator9_4() {
        this.setLayout(new FlowLayout());
        this.setTitle("乘法计算器");
        this.setLocation(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        JButton btn1 = new JButton("*");
        JButton btn2 = new JButton("=");
        JTextField text1 = new JTextField("0", 5);
        JTextField text2 = new JTextField("0", 5);
        JTextField text3 = new JTextField("0", 5);

        text3.setEnabled(false);

        this.add(text1);
        this.add(btn1);
        this.add(btn2);
        this.add(text2);
        this.add(text3);

        this.pack();

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = text1.getText();
                String num2 = text2.getText();
                Double d_num1 = 0.0, d_num2 = 0.0, d_num3 = 0.0;
                if (!num1.equals("") && !num2.equals("")) {
                    d_num1 = Double.parseDouble(num1);
                    d_num2 = Double.parseDouble(num2);
                }
                d_num3 = d_num1 * d_num2;
                text3.setText(d_num3.toString());
            }
        };
        btn2.addActionListener(listener);
    }

    public static void main(String[] args) {
        new Calculator9_4();
    }
}
