import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("BorderLayout");
        f.setLayout(new BorderLayout()); // 设为边界布局
        f.setSize(400, 400);                 // 设置窗体大小
        f.setLocation(300, 200);          // 设置窗体显示的位置
        f.setVisible(true);                 // 设置窗体可见
        // 创建5个按钮，分別用于填充Borderlayout的5个区域
        JButton but1 = new JButton("东部");// 创建新按钮
        JButton but2 = new JButton("西部");
        JButton but3 = new JButton("南部");
        JButton but4 = new JButton("北部");
        JButton but5 = new JButton("中部");
        // 将创建好的按钮添加到窗体中，并设置按钮所在的区域
        f.add(but1, BorderLayout.EAST);
        f.add(but2, BorderLayout.WEST);
        f.add(but3, BorderLayout.SOUTH);
        f.add(but4, BorderLayout.NORTH);
        f.add(but5, BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
