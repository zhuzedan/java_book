import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JComboBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox");
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 新建两个下拉框组件
        String[] provinces = {"上海", "福建", "安徽", "江苏", "浙江"};
        JComboBox<String> box1 = new JComboBox(provinces);
        box1.setEditable(true);
        final JComboBox<String> box2 = new JComboBox();
        frame.add(new JLabel("请选择省份"));
        frame.add(box1);
        frame.add(new JLabel("请选择城市"));
        frame.add(box2);
        frame.setVisible(true);
        // 为下拉框注册项目事件监听器,根据选择的省份给出对应的城市选项
        box1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // 选项被选择的时候触发
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // 先清除下拉框box2中的所有选项
                    box2.removeAllItems();
                    String province = box1.getSelectedItem().toString();
                    if ("江苏".equals(province)) {
                        // 根据选择的省份给出对应的城市选项
                        box2.addItem("南京");
                        box2.addItem("苏州");
                        box2.addItem("无锡");
                        box2.addItem("南通");
                    }
                    if ("浙江".equals(province)) {
                        // 根据选择的省份给出对应的城市选项
                        box2.addItem("杭州");
                        box2.addItem("宁波");
                        box2.addItem("温州");
                        box2.addItem("绍兴");
                    }
                }
            }
        });
    }
}
