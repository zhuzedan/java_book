package saleticket;

public class TicketWindow {
    private TicketBox tBox; // 从票箱对象tBox中取票
    private int windowId; // 窗口号

    public TicketWindow(TicketBox tBox, int windowId) {
        this.tBox = tBox;
        this.windowId = windowId;
    }

    public void prepare() {
        try {
            Thread.sleep(100); // 模拟售票前的准备工作
            System.out.println("窗口 " + windowId + " 购票前准备...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sale() {
        int tickets = tBox.getTicketNumber();
        if (tickets > 0) {
            synchronized(this){
                tickets--;
                tBox.setTicketNumber(tickets);
                System.out.println("成功，剩余票数" + tickets);
            }
        } else {
            System.out.println("无票");
        }
    }

    public void service() {
        prepare();
        sale();
    }
}