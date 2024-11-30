import java.util.Scanner;

public class SalesAmount_3_3 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            System.out.println("请输入第" + i + " 个月的销售数量：");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("上半年的销售总量为：" + sum);
    }
}
