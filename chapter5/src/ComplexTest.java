import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输第一个复数的实部：");
        double realPart1 = sc.nextDouble();
        System.out.print("请输第一个复数的虚部：");
        double imagePart1 = sc.nextDouble();
        ComplexNumber first = new ComplexNumber(realPart1, imagePart1);
        System.out.print("请输第二个复数的实部：");
        double realPart2 = sc.nextDouble();
        System.out.print("请输第二个复数的虚部：");
        double imagePart2 = sc.nextDouble();
        ComplexNumber second = new ComplexNumber(realPart2, imagePart2);
        System.out.println("两个复数之和为：" + first.add(second));
        System.out.println("两个复数之差为：" + first.sub(second));
        System.out.println("两个复数之积为：" + first.muti(second));
        System.out.println("两个复数之商为：" + first.div(second));
    }
}
