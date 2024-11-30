import javax.swing.*;
import java.awt.*;

public class LibrarySeats10_3 extends JFrame {
    private JLabel imageLabel = new JLabel(new ImageIcon("images/library.png"));// 图片标签

    public LibrarySeats10_3() {
        this.init();// 初始化操作
        this.addComponent();// 添加组件
    }

    // 初始化操作
    private void init() {
        this.setTitle("图书馆座位预约");// 标题
        this.setSize(450, 380);
        this.setLocation(700, 400);
        this.setResizable(false);// 窗体大小固定
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭窗口默认操作
    }

    // 添加组件
    private void addComponent() {
        // 窗体使用默认的边界布局,北区放入图片
        this.add(this.imageLabel, BorderLayout.NORTH);
        JPanel panel = new JPanel();
        // 取消面板布局,可自由设计面板中组件的位置
        panel.setLayout(null);
        // 学生学号
        JLabel idLabel = new JLabel("学号:");
        JTextField idText = new JTextField(15);
        // 设置组件在窗口中的位置
        idLabel.setBounds(10, 10, 90, 25);
        idText.setBounds(10, 40, 90, 25);
        panel.add(idLabel);
        panel.add(idText);
        // 预约区域
        JLabel typeLabel = new JLabel("请选择预约区域");
        ButtonGroup group = new ButtonGroup();
        JRadioButton type1 = new JRadioButton("图书阅览区");
        JRadioButton type2 = new JRadioButton("电子阅览区");
        JRadioButton type3 = new JRadioButton("自习室");
        group.add(type1);
        group.add(type2);
        group.add(type3);
        typeLabel.setBounds(150, 10, 90, 25);
        type1.setBounds(150, 40, 90, 25);
        type2.setBounds(150, 70, 90, 25);
        type3.setBounds(150, 100, 90, 25);
        panel.add(typeLabel);
        panel.add(type1);
        panel.add(type2);
        panel.add(type3);
        // 预约时间
        JLabel timeLabel = new JLabel("请选择预约时间");
        String[] time = new String[]{"8:00-10:00", "10:00-12:00", "12:00-14:00", "14:00-16:00", "16:00-18:00", "18:00-20:00"};
        JComboBox<String> timeBox = new JComboBox<>(time);
        timeLabel.setBounds(290, 10, 90, 25);
        timeBox.setBounds(290, 40, 90, 25);
        panel.add(timeLabel);
        panel.add(timeBox);
        // 将JPanel对象添加到窗体中区
        this.add(panel, BorderLayout.CENTER);
        JButton btn = new JButton("确认预约");
        this.add(btn, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new LibrarySeats10_3().setVisible(true);
    }
}
