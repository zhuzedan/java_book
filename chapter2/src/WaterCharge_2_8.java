import java.util.Scanner;

public class WaterCharge_2_8 {
    public static void main(String[] args) {
        double waterConsumption;
        double totalPrice = 0;
        String level = "";
        Scanner input = new Scanner(System.in);
        System.out.println("请输入本月用水量：");
        waterConsumption = input.nextDouble();
        if (waterConsumption > 38) {
            level = "第三阶梯";
            totalPrice = 30 * 1.88 + 8 * 2.82 + (waterConsumption - 38) * 5.64;
        } else if (waterConsumption >= 30) {
            level = "第二阶梯";
            totalPrice = 30 * 1.88 + (waterConsumption - 30) * 2.82;
        } else if (waterConsumption > 0) {
            level = "第一阶梯";
            totalPrice = waterConsumption * 1.88;
        }
        System.out.println("您本月的用水量在" + level + "，本月居民生活用水费用为：" + "\n" + totalPrice + "元");
    }
}
// 定义浮点型变量waterConsumption表示用水量，定义浮点型变量totalPrice表示总水费，并赋值为0,定义字符串变量level为空字符串。定义Scanner对象input用于接收用户键盘输入的用水量。运用println语句输出提示：请输入本月用水量，提醒用户输入用水量，再将其赋值给waterConsumption。
// 运用if语句，根据题目给出的条件筛选出用水量属于哪一梯度，并通过公式进行计算，并赋值给totalPrice。最后用println语句输出提示信息：您本月的用水量在，再输出level,本月居民生活用水费为，再输出totalPrice元。