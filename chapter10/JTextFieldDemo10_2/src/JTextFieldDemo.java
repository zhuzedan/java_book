import javax.swing.*;
import java.awt.*;

public class JTextFieldDemo {
    public static void main(String[] args) {
        // 创建窗体
        JFrame frame = new JFrame("JTextField");
        frame.setLayout(new GridLayout(2, 2));
        frame.setLocation(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // 新建两个标签组件
        JLabel label1 = new JLabel("用户名:");
        JLabel label2 = new JLabel("密码:");
        // 新建一个文本框组件,一个密码框组件
        JTextField username = new JTextField(15);
        JPasswordField password = new JPasswordField(15);
        // 按顺序添加至窗体中
        frame.add(label1);
        frame.add(username);
        frame.add(label2);
        frame.add(password);
        frame.pack();
    }
}
