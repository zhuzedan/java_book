import java.util.Scanner;

public class Circle_1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double r;
        System.out.println("请输入半径：");
        r = in.nextDouble();
        Double area = Math.PI * r * r;
        System.out.println("圆的面积是：");
        System.out.println(area);
    }
}
