import javax.swing.*;

public class JMenuDemo extends JFrame {
    public JMenuDemo() {
        this.init();// 初始化操作
        this.addComponent();// 添加组件
    }

    private void init() {
        this.setTitle("下拉式菜单");
        this.setSize(300, 150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponent() {
        JMenuBar menuBar = new JMenuBar(); // 创建下拉式菜单栏
        this.setJMenuBar(menuBar); // 将菜单栏添加到JFrame窗口中
        JMenu menu1 = new JMenu("文件"); // 创建菜单
        JMenu menu2 = new JMenu("字体");
        JMenu menu3 = new JMenu("格式");
        menuBar.add(menu1); // 将菜单添加到菜单栏上
        menuBar.add(menu2);
        menuBar.add(menu3);
        // 创建三个菜单项
        JMenuItem item1 = new JMenuItem("保存");
        JMenuItem item2 = new JMenuItem("另存为");
        JMenuItem item3 = new JMenuItem("打开");
        menu1.add(item1); // 将菜单项添加到菜单中
        menu1.add(item2);
        menu1.add(item3);
        // 创建两个单选按钮菜单项
        JRadioButtonMenuItem radioItem1 = new JRadioButtonMenuItem("宋体");
        JRadioButtonMenuItem radioItem2 = new JRadioButtonMenuItem("楷体");
        ButtonGroup group = new ButtonGroup(); // 为单选按钮菜单项添加分组
        group.add(radioItem1);
        group.add(radioItem2);
        menu2.add(radioItem1); // 将菜单项添加到菜单中
        menu2.add(radioItem2);
        // 创建两个复选框菜单项
        JCheckBoxMenuItem checkBoxItem1 = new JCheckBoxMenuItem("加粗");
        JCheckBoxMenuItem checkBoxItem2 = new JCheckBoxMenuItem("斜体");
        menu3.add(checkBoxItem1);
        menu3.add(checkBoxItem2);
    }

    public static void main(String[] args) {
        new JMenuDemo();
    }
}
