package saleticket;

public class SaleTicketTest {
    public static void main(String[] args) {
//        System.out.println("TestStatic.tt = " + TestStatic.tt);
//        int statict = ;
//        TestStatic t2 = new TestStatic();

        TicketBox tBox = new TicketBox();
        tBox.setTicketNumber(4); // 初始票数为4张

        long startTime = System.currentTimeMillis();

        // 创建5个窗口对象
        TicketWindow[] windows = new TicketWindow[5];
        for (int i = 0; i < 5; i++) {
            windows[i] = new TicketWindow(tBox, i + 1);
        }

        // 模拟5个窗口轮流调用售票服务
        for (int i = 0; i < 5; i++) {
            windows[i].service();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("售票全部用时：" + (endTime - startTime) + " 毫秒");
    }
}