package clock;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock extends JFrame {

    private JLabel timeLabel; // 用于显示时间的标签

    public DigitalClock() {
        // 初始化窗口
        setTitle("电子时钟");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 窗口居中显示

        // 初始化时间标签
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 48));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setForeground(Color.RED); // 设置文字颜色为红色

        // 添加时间标签到窗口
        add(timeLabel, BorderLayout.CENTER);

        // 启动定时器，每秒更新时间
        startTimer();
    }

    private void startTimer() {
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        // 获取当前时间
        LocalTime currentTime = LocalTime.now();
        // 格式化时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        // 更新时间标签
        timeLabel.setText(formattedTime);
    }

    public static void main(String[] args) {
        // 在事件调度线程中创建和显示GUI
        SwingUtilities.invokeLater(() -> {
            DigitalClock clock = new DigitalClock();
            clock.setVisible(true);
        });
    }
}
