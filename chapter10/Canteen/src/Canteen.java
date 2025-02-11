import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Canteen extends JFrame {

    // 菜品选择部分
    private JLabel icon1, icon2, icon3;
    private JCheckBox c1, c2, c3;
    private JPanel panel1;

    // 餐具选择部分
    private JLabel label1;
    private JRadioButton r1, r2;
    private ButtonGroup group;
    private JPanel panel2;

    // 地址填写部分
    private JLabel label2;
    private JTextField text1;
    private JPanel panel3, panel4;

    // 提交订单按钮
    private JButton btn;

    StringBuilder info;

    public Canteen() {
        this.init();         // 初始化
        this.addComponent(); // 添加组件
    }

    private void init() {
        this.setTitle("校园外卖系统");
        this.setLocation(700, 400);
        this.setSize(400, 400);  // 设置窗体大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 设置关闭操作
        this.setVisible(true);
    }

    private void addComponent() {
        // 菜品选择部分
        icon1 = new JLabel(new ImageIcon("images/food1.png"));
        icon2 = new JLabel(new ImageIcon("images/food2.png"));
        icon3 = new JLabel(new ImageIcon("images/food3.png"));
        c1 = new JCheckBox("酸辣土豆丝, 3.5元/份");
        c2 = new JCheckBox("皮蛋豆腐, 4元/份");
        c3 = new JCheckBox("鸡腿, 5元/个");

        panel1 = new JPanel(new GridLayout(3, 2));  // 使用GridLayout来排列组件
        panel1.add(icon1);
        panel1.add(c1);
        panel1.add(icon2);
        panel1.add(c2);
        panel1.add(icon3);
        panel1.add(c3);

        this.add(panel1, BorderLayout.NORTH); // 将菜品面板添加到窗体顶部

        // 餐具选择部分
        label1 = new JLabel("是否需要餐具(请尽量减少一次性餐具的使用):");
        r1 = new JRadioButton("是");
        r2 = new JRadioButton("否", true);  // 默认选择否
        group = new ButtonGroup();  // 单选按钮组
        group.add(r1);
        group.add(r2);

        panel2 = new JPanel();  // 创建餐具选择面板
        panel2.add(label1);
        panel2.add(r1);
        panel2.add(r2);

        // 地址填写部分
        label2 = new JLabel("请填写配送地址:");
        text1 = new JTextField(15);  // 创建文本框用于输入地址

        panel3 = new JPanel();  // 创建地址填写面板
        panel3.add(label2);
        panel3.add(text1);

        // 将餐具选择和地址填写组件添加到一个面板中
        panel4 = new JPanel(new GridLayout(2, 1));
        panel4.add(panel2);
        panel4.add(panel3);

        this.add(panel4, BorderLayout.CENTER);  // 将中间面板添加到窗体中间

        // 提交订单按钮
        btn = new JButton("提交订单");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 收集选择的信息
                info = new StringBuilder("您的订单:\n");

                // 添加菜品选择
                if (c1.isSelected()) {
                    info.append(c1.getText());
                }
                if (c2.isSelected()) {
                    info.append(c2.getText());
                }
                if (c3.isSelected()) {
                    info.append(c3.getText());
                }

                // 添加餐具选择
                if (r1.isSelected()) {
                    info.append("需要餐具\n");
                } else {
                    info.append("不需要餐具\n");
                }

                // 显示订单确认信息
                JOptionPane.showMessageDialog(Canteen.this, info, "订单确认", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        this.add(btn, BorderLayout.SOUTH);  // 将提交按钮添加到窗体底部

        // 自动调整窗口大小
        this.pack();
    }

    public static void main(String[] args) {
        new Canteen();  // 创建并显示界面
    }
}
