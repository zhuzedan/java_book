import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventDemo extends JFrame implements ItemListener {
    JLabel label1, label2, label3;
    JCheckBox box1, box2, box3;

    public ItemEventDemo() {
        this.setTitle("ItemEvent");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label1 = new JLabel("请选择课程：");
        box1 = new JCheckBox("C语言程序设计");
        box2 = new JCheckBox("Java程序设计");
        box3 = new JCheckBox("Python程序设计");
        JPanel panel1 = new JPanel();
        panel1.add(label1);
        panel1.add(box1);
        panel1.add(box2);
        panel1.add(box3);
        label2 = new JLabel("您选择的课程有：");
        label3 = new JLabel();
        JPanel panel2 = new JPanel();
        panel2.add(label2);
        panel2.add(label3);
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.SOUTH);
        this.pack();
        box1.addItemListener(this);
        box2.addItemListener(this);
        box3.addItemListener(this);
    }

    public static void main(String[] args) {
        new ItemEventDemo();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String text = "";
        if (box1.isSelected()) text += box1.getText() + " ";
        if (box2.isSelected()) text += box2.getText() + " ";
        if (box3.isSelected()) text += box3.getText() + " ";
        label3.setText(text);
    }
}
