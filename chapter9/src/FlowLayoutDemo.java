import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Flowlayout");
        // 设置布局管理器为 Flowlayout，所有组件居中对齐
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        // 设置窗体大小
        f.setSize(500, 150);
        // 设置窗体显示的位置
        f.setLocation(300, 200);
        // 把4个按钮添加到f窗口
        f.add(new JButton("Button1"));
        f.add(new JButton("Button2"));
        f.add(new JButton("Button3"));
        f.add(new JButton("Button4"));
        // 设置窗体可见
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
