import java.util.Scanner;

public class HowDay3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// 定义Scanner对象用于接收用户传入的数据
        System.out.println("请输入年份：");// 用println语句输出提示“请输入年份：”提醒用户输入数据
        int year = sc.nextInt();// 并将接收到的数据赋值给定义的整型变量year
        System.out.println("请输入月份：");// 用println语句输出提示“请输入月份：”提醒用户输入数据
        int month = sc.nextInt();// 并将接收到的数据赋值给定义的整型变量month
        int sum = 0;// 定义一个整型变量sum,并赋值为0
        for (int i = 1900; i < year; i++) {// 因为题目要算的是距离1900年1月1日，所以运用for循环，新定义i变量，从1900年一年一年算起
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {// 该if语句判断是否为闰年。当循环到的i变量也就是年份为闰年时，该年的天数为366天，则sum总天数加上366
                sum += 366;
            } else {// 否则不是闰年，则sum总天数加上天数365天
                sum += 365;
            }
            // 每循环一次，i变量加1，一直到用户所给的年份以前为止
        }
        // 循环完年份，循环用户输入的剩余的月份
        for (int i = 1; i < month; i++) {// 从一月开始算起，一直循环到用户所给的月份
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8) {// 运用if语句判断循环到的月份是不是为大月份，如果是则在总天数sum上加31天
                sum += 31;
            } else if (i == 2) {// 如果循环到的该月为2月
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {// 则先判断该年是否为闰年，如果是则该年的2月有29天，则要在总天数sum上加29天
                    sum += 29;
                } else {
                    sum += 28;// 若今年不是闰年，则在总天数sum上加28天
                }
            } else {// 其他情况的月份则是在总天数sum上加30天
                sum += 30;
            }
        }
        System.out.println("用户输入的日期离1900年1月1日相距" + sum + "天");// 最后用println语句输出提示：“用户输入的日期离1900年1月1日相距”再加上相加得到的总天数sum.
    }
}
