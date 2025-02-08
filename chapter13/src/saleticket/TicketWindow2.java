package saleticket;

public class TicketWindow2 extends Thread {
    private TicketBox tBox; // 从票箱对象tBox中取票

    public TicketWindow2(TicketBox tBox) {
        this.tBox = tBox;
    }

    @Override
    public void run() {
        prepare();
        sale();
    }

    public void prepare() {
        try {
            Thread.sleep(100); // 模拟售票前的准备工作
            System.out.println(Thread.currentThread().getName() + "购票前准备...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sale() {
        int tickets = tBox.getTicketNumber();
        if (tickets > 0) {
            synchronized (this) {
                tickets--;
                tBox.setTicketNumber(tickets);
                System.out.println("成功，剩余票数" + tickets);
            }
        } else {
            System.out.println("无票");
        }
    }

}