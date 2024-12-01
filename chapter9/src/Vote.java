import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vote extends JFrame implements ActionListener {
    private JButton btn1, btn2;
    private JLabel label1, label2;

    public Vote() {
        // 设置窗体标题
        this.setTitle("计票器");
        // 设置窗体布局为FlowLayout，并设置对齐方式和水平、垂直间距
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        this.setSize(250, 180);
        // 设置窗体的大小不可改变
        this.setResizable(false);
        this.setLocation(700, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}