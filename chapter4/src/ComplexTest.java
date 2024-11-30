import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplexNumber first = new ComplexNumber();
        System.out.print("请输第一个复数的实部：");
        first.realPart = sc.nextDouble();
        System.out.print("请输第一个复数的虚部：");
        first.imagePart = sc.nextDouble();
        ComplexNumber second = new ComplexNumber();
        System.out.print("请输第二个复数的实部：");
        second.realPart = sc.nextDouble();
        System.out.print("请输第二个复数的虚部：");
        second.imagePart = sc.nextDouble();
        System.out.println("两个复数之和为：" + first.add(second));
        System.out.println("两个复数之差为：" + first.sub(second));
        System.out.println("两个复数之积为：" + first.muti(second));
        System.out.println("两个复数之商为：" + first.div(second));
    }
}
