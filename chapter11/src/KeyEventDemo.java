import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventDemo {
    private void createGUI() {
        JFrame frame = new JFrame("键盘事件");
        frame.setLayout(new FlowLayout());
        frame.setSize(250, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField text = new JTextField(10);
        frame.add(text);
        // 为文本框添加键盘事件
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("键盘敲击事件，敲击了字符" + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下事件，按下了字符" + e.getKeyText(e.getKeyCode()) + "对应的字符码为：" + e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("键盘释放事件");
            }
        });
    }

    public static void main(String[] args) {
        new KeyEventDemo().createGUI();
    }
}
