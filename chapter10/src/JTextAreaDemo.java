import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaDemo {
    public static void main(String[] args) {
        // 创建窗体
        JFrame frame = new JFrame("JTextArea");
        frame.setLocation(700, 400);
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 添加一个文本框组件
        JTextField text1 = new JTextField("请选择你需要的内容：这是一段测试文字");
        frame.add(text1, BorderLayout.NORTH);
        // 添加一个文本域组件
        JTextArea textArea = new JTextArea("您选择了如下文本内容:");
        frame.add(textArea, BorderLayout.SOUTH);
        // 添加一个按钮组件
        JButton button = new JButton("选择");
        frame.add(button);
        frame.setVisible(true);

        // 为按钮组件注册一个监听器
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取选择的文本内容
                String str = text1.getSelectedText();
                // 追加到文本域中
                textArea.append("\n" + str);
            }
        });
    }
}
