package saleticket;

public class SaleTicketTest2 {
    public static void main(String[] args) {

        TicketBox tBox = new TicketBox();
        tBox.setTicketNumber(4); // 初始票数为4张

        long startTime = System.currentTimeMillis();

        TicketWindow2 tw = new TicketWindow2(tBox);

        Thread t1 = new Thread(tw, "窗口 1");// 子线程t1~t5执行同样的售票算法tw
        Thread t2 = new Thread(tw, "窗口 2");
        Thread t3 = new Thread(tw, "窗口 3");
        Thread t4 = new Thread(tw, "窗口 4");
        Thread t5 = new Thread(tw, "窗口 5");

// 启动5个线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
// 主线程等待5个子线程都执行
        while (t1.getState() != Thread.State.TERMINATED
                || t2.getState() != Thread.State.TERMINATED
                || t3.getState() != Thread.State.TERMINATED
                || t4.getState() != Thread.State.TERMINATED
                || t5.getState() != Thread.State.TERMINATED) {
        } // 空循环，等待5个子线程结束


        long endTime = System.currentTimeMillis();
        System.out.println("售票全部用时：" + (endTime - startTime) + " 毫秒");
    }
}
