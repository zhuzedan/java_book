import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DigitalPainter extends JFrame implements ActionListener, ItemListener {
    private JMenuItem jmiClear, jmiExit, jmiEraser;
    private JRadioButtonMenuItem jrbmiBlue, jrbmiBlack, jrbmiRed;
    private JRadioButtonMenuItem jrbmiSmall, jrbmiMiddle, jrbmiLarge;
    Color color = new Color(0, 0, 0);// 用来设置画笔初始颜色,默认为黑色
    int x, y;// 用来设置画笔坐标
    int con = 20;// 用来设置画笔初始大小
    MyPanel p;

    public DigitalPainter() {
        init();
        createGUI();
    }

    private void init() {
        this.setTitle("电子绘画板");
        this.setSize(800, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createGUI() {
        // 添加菜单栏，下拉式菜单
        JMenuBar jmb = new JMenuBar();// 创建水平菜单栏
        setJMenuBar(jmb);// 将菜单栏添加到JFrame窗口中
        // 新建菜单
        JMenu fileMenu = new JMenu("清除方式");
        JMenu optionMenu = new JMenu("选择画笔");
        jmb.add(fileMenu); // 将菜单添加到菜单栏上
        jmb.add(optionMenu);
        fileMenu.add(jmiEraser = new JMenuItem("橡皮")); // 添加菜单项
        fileMenu.add(jmiClear = new JMenuItem("清除"));
        fileMenu.addSeparator();// 在菜单中添加一条分隔线
        fileMenu.add(jmiExit = new JMenuItem("退出"));
        JMenu colorSubMenu = new JMenu("颜色", true); // 新建子菜单
        JMenu sizeSubMenu = new JMenu("大小");
        optionMenu.add(colorSubMenu);
        optionMenu.add(sizeSubMenu);
        // 新建画笔颜色单选按钮菜单项
        jrbmiBlack = new JRadioButtonMenuItem("黑色");
        colorSubMenu.add(jrbmiBlack);
        jrbmiRed = new JRadioButtonMenuItem("红色");
        colorSubMenu.add(jrbmiRed);
        jrbmiBlue = new JRadioButtonMenuItem("蓝色");
        colorSubMenu.add(jrbmiBlue);
        // 保证颜色选项只能单选
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(jrbmiBlack);
        colorGroup.add(jrbmiRed);
        colorGroup.add(jrbmiBlue);
        // 新建画笔大小单选按钮菜单项
        jrbmiSmall = new JRadioButtonMenuItem("小");
        sizeSubMenu.add(jrbmiSmall);
        jrbmiMiddle = new JRadioButtonMenuItem("中");
        sizeSubMenu.add(jrbmiMiddle);
        jrbmiLarge = new JRadioButtonMenuItem("大");
        sizeSubMenu.add(jrbmiLarge);
        // 保证粗细选项只能单选
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(jrbmiSmall);
        sizeGroup.add(jrbmiMiddle);
        sizeGroup.add(jrbmiLarge);
        // 添加图形绘制区域
        p = new MyPanel();
        this.getContentPane().add(p, BorderLayout.CENTER);

        // 添加动作监听事件
        jmiEraser.addActionListener(this);
        jmiClear.addActionListener(this);
        jmiExit.addActionListener(this);
        // 添加单选按钮选择事件
        jrbmiBlue.addItemListener(this);
        jrbmiBlack.addItemListener(this);
        jrbmiRed.addItemListener(this);
        jrbmiSmall.addItemListener(this);
        jrbmiMiddle.addItemListener(this);
        jrbmiLarge.addItemListener(this);

        // 添加键盘事件
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String str = e.getKeyText(e.getKeyCode());
                if (str.equals("B")) {// 将画笔颜色设置为黑色
                    color = new Color(0, 0, 0);
                }
                if (str.equals("R")) {// 将画笔颜色设置为红色
                    color = new Color(255, 0, 0);
                }
                if (str.equals("L")) {// 将画笔颜色设置为蓝色
                    color = new Color(0, 0, 255);
                }
            }
        });
    }

    public class MyPanel extends JPanel implements MouseMotionListener {
        public MyPanel() {
            this.addMouseMotionListener(this);// 添加鼠标拖动事件监听
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            Graphics g = getGraphics();
            if (color == getBackground()) // 橡皮擦
            {
                g.setColor(getBackground());
                g.fillOval(e.getX() - (20 / 2), e.getY() - (20 / 2), 20, 20);
            } else { // 画笔
                g.setColor(color);
                x = e.getX(); // 获得鼠标当前位置
                y = e.getY();
                g.fillOval(x, y, con, con);
            }
            g.dispose();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    public static void main(String[] args) {
        new DigitalPainter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取图形设备
        Graphics g = getGraphics();
        if (e.getSource() == jmiEraser)
            color = getBackground();
        else if (e.getSource() == jmiClear)
            g.clearRect(0, 0, this.getSize().width, this.getSize().height);
        else if (e.getSource() == jmiExit)
            System.exit(0);
        // 释放图形设备
        g.dispose();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JRadioButtonMenuItem) {
            // 设置画笔颜色
            if (jrbmiBlack.isSelected())
                color = new Color(0, 0, 0);
            if (jrbmiRed.isSelected())
                color = new Color(255, 0, 0);
            if (jrbmiBlue.isSelected())
                color = new Color(0, 0, 255);
            // 设置画笔大小
            if (jrbmiSmall.isSelected())
                con = 10;
            if (jrbmiMiddle.isSelected())
                con = 20;
            if (jrbmiLarge.isSelected())
                con = 30;
        }
    }
}
