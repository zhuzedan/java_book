import java.util.Scanner;

public class Month_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入月份:");
        int month = in.nextInt();
        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            default:
                System.out.println("您的输入有误！");
        }
        System.out.println(month + "月:" + day + "天");
    }
}
