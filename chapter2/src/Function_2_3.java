import java.util.Scanner;

public class Function_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入x的值：");
        double x = in.nextDouble();
        double y = 0;
        if (x <= -10) {
            y = 0;
        } else if (x >= -10 && x < 100) {
            y = Math.sqrt(x + 10);
        } else {
            y = 5 * x + 1;
        }
        System.out.println("函数y的值：" + y);
    }
}
