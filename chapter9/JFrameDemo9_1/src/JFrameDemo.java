import javax.swing.*;

public class JFrameDemo extends JFrame {
    public static void main(String[] args) {
        // 实例化JFrame对象，并设置窗体标题
        JFrame frame = new JFrame("JFrame");
        // 设置窗体大小
        frame.setSize(300, 200);
        // 设置窗体在屏幕上的位置
        frame.setLocation(700, 400);
        // frame.add(new JButton("按钮"));
        // 设置单击关闭按钮时的默认操作：关闭时退出
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体是否显示
        frame.setVisible(true);
    }
}
