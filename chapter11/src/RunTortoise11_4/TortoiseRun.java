package RunTortoise11_4;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class TortoiseRun {
    int count = 0;
    int y1, y2;
    public void MyFrame(String title) {
//        super(title);
        addKeyListener((KeyListener) this);
    }
    public void paint(Graphics g) {
//        super.paint(g);//调用父类的paint方法
        Color color = new Color(86, 180, 62);//画笔颜色
        g.setColor(color);//设置画笔
        g.fillOval(200, 150, 60, 100);
        //左眼
        color = new Color(255, 255, 255);//白色
        g.setColor(color);
        g.fillOval(210, 160, 10, 10);
        color = new Color(0, 0, 0);//黑色
        g.setColor(color);
        g.fillOval(210, 160, 7, 7);
        //右眼
        color = new Color(255, 255, 255);
        g.setColor(color);
        g.fillOval(240, 160, 10, 10);
        color = new Color(0, 0, 0);
        g.setColor(color);
        g.fillOval(240, 160, 7, 7);
        //画笔重置为绿色
        color = new Color(86, 180, 62);
        g.setColor(color);
        //左前
        g.fillOval(100, 200 - y1, 70, 100);
        //右前
        g.fillOval(280, 200 - y2, 70, 100);
        //左后
        g.fillOval(100, 350 + y2, 70, 100);
        //右后
        g.fillOval(280, 350 + y2, 70, 100);
        //尾巴
        for (int x = 220; x <= 230; x++) {
            g.drawLine(x, 400, 225, 500);
        }
        //壳
        color = new Color(67, 200, 0);
        g.setColor(color);
        g.fillOval(100, 200, 250, 250);//绘制一个圆
        color = new Color(34, 153, 0);
        g.setColor(color);
        g.drawLine(100, 320, 150, 310);
        g.drawLine(150, 310, 190, 290);
        g.drawLine(150, 310, 190, 330);
        g.drawLine(190, 290, 150, 225);
        g.drawLine(190, 330, 150, 425);
        g.drawLine(190, 290, 250, 290);
        g.drawLine(190, 330, 250, 330);
        g.drawLine(250, 290, 300, 225);
        g.drawLine(250, 330, 300, 425);
        g.drawLine(250, 290, 300, 310);
        g.drawLine(250, 330, 300, 310);
        g.drawLine(300, 310, 350, 320);
    }
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            count++;
            if (count % 2 == 1) {
                y1 = 10;
                y2 = 0;
            } else {
                y1 = 0;
                y2 = 10;
            }
            repaint();
        }
    }

    private void repaint() {

    }

    public void keyReleased(KeyEvent e) {
    }
    public void keyTyped(KeyEvent e) {
    }
}
