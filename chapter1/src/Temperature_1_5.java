import java.util.Scanner;

public class Temperature_1_5 {
    public static void main(String[] args) {
        int f;
        int c;
        System.out.println("请输入华氏温度");
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        c = (f - 32) * 5 / 9;
        System.out.println("转换后的温度为");
        System.out.println(c);
    }
}
