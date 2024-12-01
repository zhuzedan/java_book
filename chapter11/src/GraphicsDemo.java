import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JFrame {
    public GraphicsDemo() {
        init();
        createGUI();
    }

    private void init() {
        this.setTitle("图形绘制");
        this.setSize(300, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createGUI() {
        this.getContentPane().add(new MyPanel());
    }

    public static void main(String[] args) {
        new GraphicsDemo();
    }
}

class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        // 重写JComponent的方法,该方法会在需要绘制组件时自动调用
        // 绘制直线
        g.drawLine(25, 20, 150, 30);
        // 绘制弧线
        g.drawArc(25, 70, 50, 70, 20, 180);
        g.fillArc(5, 170, 100, 100, 30, 90);
        // 绘制矩形
        g.drawRect(125, 70, 40, 50);
        g.fillRect(125, 170, 40, 40);
        // 绘制圆形
        g.drawOval(200, 70, 70, 50);
        g.fillOval(200, 170, 60, 60);
        // 释放图形设备
        g.dispose();
    }
}
