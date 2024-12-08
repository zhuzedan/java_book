import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculator extends JFrame {
    public MiniCalculator() { // 构造方法
        // 设置流式布局管理器
        this.setLayout(new FlowLayout());
        this.setTitle("乘法计算器");
        this.setLocation(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        // 定义相关组件
        JButton bt1 = new JButton("*");
        JButton bt2 = new JButton("=");
        JTextField text1 = new JTextField("0", 5);
        JTextField text2 = new JTextField("0", 5);
        JTextField text3 = new JTextField("0", 5);
        // 设置文本框不可编辑
        text3.setEnabled(false);
        // 按顺序添加组件
        this.add(text1);
        this.add(bt1);
        this.add(text2);
        this.add(bt2);
        this.add(text3);
        // 设置自适应JFrame窗体大小
        this.pack();
        // 定义事件监听器对象
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 执行计算
                String num1 = text1.getText();
                String num2 = text2.getText();
                Double d_num1 = 0.0, d_num2 = 0.0, sum = 0.0;
                if (!num1.equals("") && !num2.equals("")) {
                    d_num1 = Double.parseDouble(num1);
                    d_num2 = Double.parseDouble(num2);
                }
                sum = d_num1 * d_num2;
                text3.setText(sum.toString());
            }
        };
        // 为事件源按钮注册监听器
        bt2.addActionListener(listener);
    }

    public static void main(String[] args) {
        new MiniCalculator();
    }
}
