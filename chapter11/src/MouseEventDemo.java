import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo {
    private void createGUI() {
        JFrame frame = new JFrame("鼠标事件");
        frame.setLayout(new FlowLayout());
        frame.setSize(250, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn = new JButton("按钮");
        frame.add(btn);
        // 为按钮添加鼠标单击事件监听器
        btn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    System.out.println("鼠标单击左键事件");
                } else if (e.getButton() == MouseEvent.BUTTON2) {
                    System.out.println("鼠标单击滚轮事件");
                } else if (e.getButton() == MouseEvent.BUTTON3) {
                    System.out.println("鼠标单击右键事件");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("鼠标按下事件");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("鼠标释放事件");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("鼠标移入按钮区域事件");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("鼠标移出按钮区域事件");
            }
        });
        // 为窗口添加鼠标拖动事件监听器
        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("鼠标拖动事件——按下鼠标移动");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("鼠标移动事件");
            }
        });
        // 为窗口添加鼠标滚轮事件监听器
        frame.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println("鼠标滚轮事件");
            }
        });
    }

    public static void main(String[] args) {
        new MouseEventDemo().createGUI();
    }
}
