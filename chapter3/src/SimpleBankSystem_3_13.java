import java.util.Scanner;

public class SimpleBankSystem_3_13 {
    private static double balance = 0; // 静态变量作为账户余额

    // 存款方法
    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功：" + amount + " 新余额：" + balance);
        } else {
            System.out.println("无效的存款金额");
        }
    }

    // 取款方法
    public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("取款成功：" + amount + " 新余额：" + balance);
        } else {
            System.out.println("无效的取款金额或余额不足");
        }
    }

    // 显示账户余额
    public static void displayBalance() {
        System.out.println("当前余额：" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n请选择操作：");
            System.out.println("1. 存款");
            System.out.println("2. 取款");
            System.out.println("3. 显示余额");
            System.out.println("4. 退出");
            System.out.print("选择一个选项：");
            int option = scanner.nextInt();
            scanner.nextLine(); // 消耗掉多余的换行符
            switch (option) {
                case 1:
                    System.out.print("请输入存款金额：");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("请输入取款金额：");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    displayBalance();
                    break;
                case 4:
                    System.out.println("退出中...");
                    scanner.close();
                    return;
                default:
                    System.out.println("无效选项，请重新输入。");
            }
        }
    }
}
