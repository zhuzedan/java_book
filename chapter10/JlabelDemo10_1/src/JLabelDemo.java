import javax.swing.*;
import java.awt.*;

public class JLabelDemo {
    public static void main(String[] args) {
        // 创建窗体
        JFrame frame = new JFrame("JLabel");
        frame.setLocation(700, 400);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 新建两个标签对象,一个用来显示文本,一个用来显示图像
        JLabel label1 = new JLabel("用户名:宁小才");
        JLabel label2 = new JLabel();
        // 新建一个图标对象,并加入到JLabel中
        ImageIcon icon = new ImageIcon("images/photo.png");
        // 为标签设置图片
        label2.setIcon(icon);
        // 将文本标签添加到布局的北部,将图像标签添加到布局的中部
        frame.add(label1, BorderLayout.NORTH);
        frame.add(label2);
        frame.setVisible(true);
    }
}
