import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        boolean time;
        String ticketType = "";
        int ticketNum;
        double totalPrice = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("请选择时段(true代表平日,false代表节假日)：");
        time = input.nextBoolean();
        System.out.println("请输入字母选择购票类型(A代表成人票,S代表学生票,O代表老人票,C代表儿童票)：");
        String option = input.next();
        System.out.println("请输入购买票数：");
        ticketNum = input.nextInt();

        if (time) {
            if (option.equals("A")) {
                ticketType = "成人票";
                totalPrice = ticketNum * 30;
            } else if (option.equals("S")) {
                ticketType = "学生票";
                totalPrice = ticketNum * 15;
            } else if (option.equals("O")) {
                ticketType = "老人票";
                totalPrice = ticketNum * 30 * 0.6;
            } else if (option.equals("C")) {
                ticketType = "儿童票";
                totalPrice = ticketNum * 10;
            }
        } else {
            if (option.equals("A")) {
                ticketType = "成人票";
                totalPrice = ticketNum * 45;
            } else if (option.equals("S")) {
                ticketType = "学生票";
                totalPrice = ticketNum * 45 * 0.5;
            } else if (option.equals("O")) {
                ticketType = "老人票";
                totalPrice = ticketNum * 45 * 0.6;
            } else if (option.equals("C")) {
                ticketType = "儿童票";
                totalPrice = ticketNum * 15;
            }
        }

        System.out.println("您购买了" + ticketNum + "张" + ticketType +
                ",请支付购票金额：" + "\n" + totalPrice + " 元");

    }
}
