import javax.swing.*;
import java.awt.*;

public class ClassRoom_9_2 extends JFrame {
    public ClassRoom_9_2() {
        this.setTitle("教室平面图");
        this.setSize(500, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("讲台");
        JButton btn2 = new JButton("走廊");
        JButton btn3 = new JButton("窗户");
        JButton btn4 = new JButton("座位");

        this.add(btn1, BorderLayout.NORTH);
        this.add(btn2, BorderLayout.EAST);
        this.add(btn3, BorderLayout.WEST);
        this.add(btn4, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new ClassRoom_9_2();
    }
}
