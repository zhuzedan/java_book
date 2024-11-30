import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ticket9_1 extends JFrame implements ActionListener {
    private JButton btn1, btn2;
    private JLabel label1, label2;

    public Ticket9_1() {
        this.setTitle("计票器");
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        this.setSize(250, 180);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn1 = new JButton("宁小才");
        btn2 = new JButton("宁小静");

        label1 = new JLabel("宁小才的票数：");
        label2 = new JLabel("宁小静的票数：");

        this.add(btn1);
        this.add(btn2);
        this.add(label1);
        this.add(label2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    private int v1 = 0, v2 = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            label1.setText("宁小才的票数：" + String.valueOf(++v1));
        }
        if (e.getSource() == btn2) {
            label2.setText("宁小静的票数：" + String.valueOf(++v2));
        }
    }

    public static void main(String[] args) {
        new Ticket9_1();
    }
}
