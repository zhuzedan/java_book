import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("GridLayout");
        // 设置该布局为2*4的网格
        f.setLayout(new GridLayout(2, 4));
        f.setSize(500, 300);
        f.setLocation(400, 300);
        // 下面的代码是循环添加8个按钮到GridLayout中
        for (int i = 1; i <= 8; i++) {
            JButton btn = new JButton("Button" + i);
            f.add(btn); // 向窗体中添加按钮
        }
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
