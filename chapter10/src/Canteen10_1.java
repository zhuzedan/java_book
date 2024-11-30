import javax.swing.*;
import java.awt.*;

public class Canteen10_1 extends JFrame {
    JPanel panel1, panel2, panel3, panel4;
    JLabel icon1, icon2, icon3;
    JCheckBox c1, c2, c3;
    JLabel label1, label2;
    JRadioButton r1, r2;
    JTextField text1;

    public Canteen10_1() {
        this.init();
        this.addComponent();
    }

    private void init() {
        this.setTitle("校园外卖系统");
        this.setLocation(700, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponent() {
        icon1 = new JLabel("images/food1.png");
        icon2 = new JLabel("images/food2.png");
        icon3 = new JLabel("images/food3.png");
        c1 = new JCheckBox("酸辣土豆丝，3.5元/份");
        c2 = new JCheckBox("皮蛋豆腐，4元/份");
        c3 = new JCheckBox("鸡腿，5元/个");
        panel1 = new JPanel(new GridLayout(3, 2));
        panel1.add(icon1);
        panel1.add(c1);
        panel1.add(icon2);
        panel1.add(c2);
        panel1.add(icon3);
        panel1.add(c3);
        this.add(panel1, BorderLayout.NORTH);
        label1 = new JLabel("是否需要餐具（请尽量减少一次性餐具的使用）");
        r1 = new JRadioButton("是");
        r2 = new JRadioButton("否", true);
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        panel2.add(label1);
        panel2.add(r1);
        panel2.add(r2);

        label2 = new JLabel("请填写配送地址");
        text1 = new JTextField(15);
        panel3 = new JPanel();
        panel3.add(label2);
        panel3.add(text1);

        panel4 = new JPanel(new GridLayout(2, 1));
        panel4.add(panel2);
        panel4.add(panel3);
        panel4.add(panel4);
        this.add(new JButton("提交订单"), BorderLayout.SOUTH);
        this.pack();
    }

    public static void main(String[] args) {
        new Canteen10_1();
    }
}
