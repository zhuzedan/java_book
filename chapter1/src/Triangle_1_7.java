import java.util.Scanner;

public class Triangle_1_7 {
    public static void main(String[] args) {
        double a, b, c, p, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的三条边：");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            p = (a + b + c) / 2;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("可以构成三角形，面积为" + area);
        } else {
            System.out.println("无法形成三角形");
        }
    }
}
