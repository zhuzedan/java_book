import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入港币金额(元)：");
        double hkd = input.nextDouble();

        double cny = hkd * 0.8394;
        System.out.println(hkd + "换算成人民币为" + cny + "元");
    }
}
