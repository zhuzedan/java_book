import javax.swing.*;
import java.awt.*;

public class JRadioButtonDemo {
    public static void main(String[] args) {
        // 创建窗体
        JFrame frame = new JFrame("JRadioButton");
        frame.setLayout(new FlowLayout());
        frame.setLocation(700, 400);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("请选择性别："));
        // 新建一个ButtonGroup组
        ButtonGroup group = new ButtonGroup();
        // 新建两个JRadioButton,并添加到同一个ButtonGroup组中
        JRadioButton radio1 = new JRadioButton("男", true);
        JRadioButton radio2 = new JRadioButton("女");
        group.add(radio1);
        group.add(radio2);
        // 将JRadioButton添加到窗体中
        frame.add(radio1);
        frame.add(radio2);
        frame.setVisible(true);
    }
}
