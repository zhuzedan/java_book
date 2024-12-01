import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopupMenuDemo extends JFrame {
    public JPopupMenuDemo() {
        this.init();// 初始化操作
        this.addComponent();// 添加组件
    }

    private void init() {
        this.setTitle("弹出式菜单");
        this.setSize(300, 150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponent() {
        // 创建一个JPopupMenu弹出式菜单
        JPopupMenu popupMenu = new JPopupMenu();
        // 创建三个JMenuItem菜单项
        JMenuItem refreshItem = new JMenuItem("刷新");
        JMenuItem createItem = new JMenuItem("新建");
        JMenuItem exitItem = new JMenuItem("退出");
        // 向JPopupMenu菜单添加菜单项
        popupMenu.add(refreshItem);
        popupMenu.add(createItem);
        // 添加一个分隔符
        popupMenu.addSeparator();
        popupMenu.add(exitItem);
        // 为JFrame窗口添加鼠标事件监听器
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // 如果单击的是鼠标的右键，显示JPopupMenu菜单
                if (e.getButton() == e.BUTTON3) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }

    public static void main(String[] args) {
        new JPopupMenuDemo();
    }
}
