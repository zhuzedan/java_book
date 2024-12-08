import javax.swing.*;

public class JScrollPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane");
        frame.setLocation(700, 400);
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea("JScrollPane演示");
        // 新建一个JScrollPane,并指定文本域组件
        JScrollPane scrollPane = new JScrollPane(textArea);
        // 将JScrollPane添加到窗体中
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
