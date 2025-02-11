import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入港币金额(元)："); // 输入提示
        double HKD = input.nextDouble(); // 用户输入港币金额

        double CNY = HKD * 0.8394; // 港币转换为人民币
        System.out.println(HKD + "换算成人民币为" + CNY + "元"); // 输出信息提示
    }
}
