import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Canteen10_1 extends JFrame {

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
    private JButton submitButton;

    public Canteen10_1() {
        this.init();         // 初始化
        this.addComponent(); // 添加组件
    }

    private void init() {
        // 设置窗体标题、位置、可见性等
        this.setTitle("校园外卖系统");
        this.setLocation(700, 400);
        this.setSize(400, 400);  // 设置窗体大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 设置关闭操作
        this.setVisible(true);
    }

    private void addComponent() {
        // 任务2：菜品选择部分
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

        // 任务3：餐具选择部分
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

        // 任务4：地址填写部分
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

        // 任务5：提交订单按钮
        submitButton = new JButton("提交订单");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 收集选择的信息
                StringBuilder orderSummary = new StringBuilder("您的订单:\n");

                // 添加菜品选择
                if (c1.isSelected()) {
                    orderSummary.append("酸辣土豆丝, 3.5元/份\n");
                }
                if (c2.isSelected()) {
                    orderSummary.append("皮蛋豆腐, 4元/份\n");
                }
                if (c3.isSelected()) {
                    orderSummary.append("鸡腿, 5元/个\n");
                }

                // 添加餐具选择
                if (r1.isSelected()) {
                    orderSummary.append("需要餐具\n");
                } else {
                    orderSummary.append("不需要餐具\n");
                }

                // 添加地址信息
                String address = text1.getText();
                if (!address.isEmpty()) {
                    orderSummary.append("配送地址: " + address);
                } else {
                    orderSummary.append("没有填写配送地址");
                }

                // 显示订单确认信息
                JOptionPane.showMessageDialog(Canteen10_1.this, orderSummary.toString(), "订单确认", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        this.add(submitButton, BorderLayout.SOUTH);  // 将提交按钮添加到窗体底部

        // 任务5：自动调整窗口大小
        this.pack();
    }

    public static void main(String[] args) {
        new Canteen10_1();  // 创建并显示界面
    }
}
