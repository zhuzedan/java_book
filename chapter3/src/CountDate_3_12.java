import java.util.Scanner;

public class CountDate_3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        // 调用计算日期差的方法
        int daysBetween = daysFrom1900(year, month);
        // 输出计算结果
        System.out.println("用户输入的日期离1900年1月1日相距" + daysBetween + "天");
        sc.close();
    }

    // 定义计算日期差的方法
    public static int daysFrom1900(int year, int month) {
        int sum = 0;
        for (int i = 1900; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                sum += 366;
            } else {
                sum += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                    sum += 31;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        sum += 29;
                    } else {
                        sum += 28;
                    }
                    break;
                default:
                    sum += 30;
                    break;
            }
        }
        return sum;
    }
}
