import java.util.Scanner;

public class Bike_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = in.nextInt();
        if (age > 12) {
            System.out.println("请扫码租车！");
        }
    }
}
