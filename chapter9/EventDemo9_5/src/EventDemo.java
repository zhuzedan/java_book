import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("事件处理");
        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 向窗体中添加一个按钮组件
        JButton btn = new JButton("Button");
        frame.add(btn);
        // 为按钮组件注册一个监听器
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // 实现监听方法, 对事件进行处理
                System.out.println("按钮Button被点击");
            }
        });
    }
}
