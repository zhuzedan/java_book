import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vote extends JFrame implements ActionListener {

    // 按钮和标签组件
    private JButton btn1, btn2;
    private JLabel label1, label2;

    // 记录投票数
    private int v1 = 0, v2 = 0;

    public Vote() {
        // 设置窗体标题
        this.setTitle("计票器");

        // 设置窗体布局为FlowLayout，并设置对齐方式和水平、垂直间距
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        this.setSize(250, 180);

        // 设置窗体的大小不可改变
        this.setResizable(false);

        // 设置窗体的显示位置
        this.setLocation(700, 400);

        // 设置窗体可见
        this.setVisible(true);

        // 设置窗体关闭时的操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建按钮和标签组件
        btn1 = new JButton("宁小才");
        btn2 = new JButton("宁小静");
        label1 = new JLabel("宁小才的票数: 0");
        label2 = new JLabel("宁小静的票数: 0");

        // 向窗体中添加按钮和标签
        this.add(btn1);
        this.add(label1);
        this.add(btn2);
        this.add(label2);

        // 为按钮添加事件监听器
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    // 事件处理方法
    @Override
    public void actionPerformed(ActionEvent e) {
        // 当点击"宁小才"按钮时，宁小才的票数加1
        if (e.getSource() == btn1) {
            label1.setText("宁小才的票数: " + (++v1));
        }
        // 当点击"宁小静"按钮时，宁小静的票数加1
        if (e.getSource() == btn2) {
            label2.setText("宁小静的票数: " + (++v2));
        }
    }

    // 主方法
    public static void main(String[] args) {
        // 创建并显示计票器窗口
        new Vote();
    }
}
