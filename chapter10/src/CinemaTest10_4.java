import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CinemaTest10_4 {
    public static void main(String[] args) {
        new Cinema().setVisible(true);
    }
}

class Cinema extends JFrame implements ActionListener {
    JLabel cinemasLabel;
    JComboBox<String> cinemas;
    JLabel numLabel;
    JTextField num;
    JLabel moviesLabel;
    JComboBox<String> movies;
    JButton[][] seat;
    JButton saveBtn;
    JPanel operationPanel;
    String[] selectedSeats;
    int selectedCount;
    JPanel infoPanel;
    JPanel seatPanel;
    JPanel[] seatPanelItems;

    public Cinema() {
        infoPanel = new JPanel();
        cinemasLabel = new JLabel("影院：");
        cinemas = new JComboBox<String>();
        cinemas.addItem("UME国际影城");
        cinemas.addItem("保利国际影院");
        cinemas.addItem("金逸国际影院");
        moviesLabel = new JLabel("电影：");
        movies = new JComboBox<String>();
        movies.addItem("南方车站的聚会");
        movies.addItem("海上钢琴师");
        movies.addItem("罗小黑战记");
        numLabel = new JLabel("观影人数：");
        num = new JTextField(10);
        seatPanel = new JPanel();
        GridLayout seatLayout = new GridLayout(4, 1);
        seatPanel.setLayout(seatLayout);
        seatPanelItems = new JPanel[3];
        seat = new JButton[3][];
        for (int i = 0; i < 3; i++) {
            seatPanelItems[i] = new JPanel();
            seat[i] = new JButton[5 + i * 2];
            for (int j = 0; j < 5 + i * 2; j++) {
                JButton button = new JButton((i + 1) + "排" + (j + 1) + "座");
                button.addActionListener(this);
                seat[i][j] = button;
                seatPanelItems[i].add(seat[i][j]);
            }
            seatPanel.add(seatPanelItems[i]);
        }
        selectedCount = 0;
        operationPanel = new JPanel();
        saveBtn = new JButton("提交");
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        operationPanel.add(saveBtn);
        seatPanel.add(operationPanel);
        infoPanel.add(cinemasLabel);
        infoPanel.add(cinemas);
        infoPanel.add(moviesLabel);
        infoPanel.add(movies);
        infoPanel.add(numLabel);
        infoPanel.add(num);
        add(infoPanel, BorderLayout.NORTH);
        add(seatPanel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(800, 300);
        saveBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (saveBtn == e.getSource()) {
            try {
                String info = "影院：" + cinemas.getSelectedItem() + "\n" + "电影：" + movies.getSelectedItem() + "\n" + "人数："
                        + num.getText() + "\n" + "座位为：";
                for (int i = 0; i < selectedSeats.length; i++) {
                    info += selectedSeats[i] + ",";
                }
                info = info.substring(0, info.length() - 1); // 去掉末尾逗号
                JOptionPane.showMessageDialog(this, info, "确认信息", JOptionPane.DEFAULT_OPTION);
                num.setEditable(false);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "请选择座位", "警告信息", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            try {
                int totalNum = Integer.valueOf(num.getText());
                if (selectedSeats == null) {
                    selectedSeats = new String[totalNum];
                }
                if (selectedCount == totalNum) {
                    return;
                }
                for (int i = 0; i < seat.length; i++) {
                    for (int j = 0; j < seat[i].length; j++) {
                        if (e.getSource() == seat[i][j]) {
                            seat[i][j].setBackground(Color.RED);
                            selectedSeats[selectedCount] = seat[i][j].getText();
                            selectedCount++;
                        }
                    }
                }
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "请选择观影人数", "警告信息", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
