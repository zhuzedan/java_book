import javax.swing.*;
import java.awt.*;

class Calculater extends JFrame {
    public Calculater() {
        this.setTitle("计算器");
        // 指定布局为GridLayout，4行4列，间隙为5
        this.setLayout(new GridLayout(4, 4, 5, 5));
        // 添加按钮
        String[] num = {"7", "8", "9", "+", "4", "5", "6", "-",
                "1", "2", "3", "*", "0", ".", "=", "/"};
        for (int i = 0; i < 16; i++) {
            this.add(new JButton(num[i]));
        }
        this.pack();// 设置自适应JFrame窗体大小
        this.setLocation(300, 300);// 设置窗体位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculater();
    }
}
