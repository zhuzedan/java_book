import javax.swing.*;
import java.awt.*;

public class UserRegister10_2 extends JFrame {
    JLabel label1, label2, label3;
    JTextField text;
    JPasswordField password;
    String[] school;
    JComboBox box;
    JButton button;
    JPanel panel;

    public UserRegister10_2() {
        this.init();// 初始化操作
        this.addComponent();// 添加组件
    }

    private void init() {
        this.setTitle("实习平台用户注册");
        this.setLocation(700, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponent() {
        label1 = new JLabel("手机号:");
        text = new JTextField(15);
        label2 = new JLabel("密码:");
        password = new JPasswordField(15);
        label3 = new JLabel("所在学校:");
        school = new String[]{"宁波大学", "宁波财经学院", "宁波工程学院"};
        box = new JComboBox(school);
        box.setEditable(true);
        button = new JButton("注册");
        panel = new JPanel(new GridLayout(3, 2));
        panel.add(label1);
        panel.add(text);
        panel.add(label2);
        panel.add(password);
        panel.add(label3);
        panel.add(box);
        this.add(panel);
        this.add(button, BorderLayout.SOUTH);
        this.pack();
    }

    public static void main(String[] args) {
        new UserRegister10_2();
    }
}
