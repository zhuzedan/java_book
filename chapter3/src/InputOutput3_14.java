import java.util.Scanner;

public class InputOutput3_14 {
    public static void main(String[] args) {
        boolean isFlag = true;// 定义了一个布尔变量isFlag并初始化为true，用于控制while循环的继续执行。当用户选择退出时，该变量将被设置为false，从而退出循环。
        String details = "收支\t账户金额\t收支金额\t说明\n";// 定义了一个字符串details，用于存储收支的详细记录。初始内容包含表头。
        int balance = 10000;// 定义了一个整型变量balance并初始化为10000，表示账户的初始金额。
        while (isFlag) {// 如果isFlag为真，则进入while循环执行while循环中的代码
            System.out.println("----------家庭收支记账软件-----------------\n");// 用println语句输出菜单以提醒用户
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出");
            System.out.println("请选择（1-4）");

            char selection = readMenuSelection();// 调用readMenuSelection()方法来读取用户的菜单选择。
            switch (selection) {// 运用switch语句，通过用户选择的数字执行语句
                case '1':// 当selection等于1时
                    System.out.println("--------------当前收支明细记录----------------");// 用println语句输出提示及分界线
                    System.out.println(details);// 输出明细记录detail字符串
                    System.out.println("-------------------------------------------");// 输出分界线分隔
                    break;// 结束这一轮选择，退出switch语句
                case '2':// 当selection等于2时
                    System.out.println("本次收入金额：");// 用println语句输出提示“本次收入金额”
                    int money = readNumber();// 调用readNumber()方法来得到用户输入的金额，定义money用于存储金额
                    System.out.println("本次收入说明：");// 用println语句输出提示“本次收入说明：”
                    String info = readString();// 调用readString()方法来取得收入和支出说明的输入，定义info用于存储方法返回的信息
                    balance += money;// 将原有金额加上money
                    details += ("收入\t" + balance + "\t" + money + "\t\t" + info + "\n");// 将收支明细信息加上更新后信息的字符串
                    System.out.println("-------------登记完成------------------------");// 输出提示登记完成
                    break;// 结束这一轮选择，退出switch语句
                case '3':// 当selection等于3时
                    System.out.println("本次支出金额：");// 用println语句输出提示“本次支出金额：”
                    int minusmoney = readNumber();// 调用readNumber()方法来得到用户输入的金额，定义minusmoney用于存储金额
                    System.out.println("本次支出说明：");// 输出提示“本次支出说明：”
                    String minusInfo = readString();// 调用readString()方法来取得收入和支出说明的输入，定义minusinfo用于存储方法返回的信息
                    if (balance >= minusmoney) {// 当支出小于等于原始金额时
                        balance -= minusmoney;// 原始金额减去支出
                        details += ("支出\t" + balance + "\t" + minusmoney + "\t\t" + minusInfo + "\n");// 将收支明细信息加上更新后信息的字符串
                    } else {
                        System.out.println("支出超出账户额度，支付失败");// 否则支出大于原有金额，则提示输出“支出超出账户额度，支付失败”
                    }
                    System.out.println("------------------登记完成----------------------");// 输出提示登记完成
                    break;// 结束这一论选择，退出switch语句
                case '4':// 当selection等于4时
                    System.out.println("确认是否退出（Y/N）");// 用println语句输出提示“确认是否退出”
                    char isExit = readConfirmSelection();// 运用readConfirmSelection()方法确认选择的输入，并将方法返回的值存储到字符isExit中
                    if (isExit == 'Y') {// 当isExit的值为‘Y’时
                        isFlag = false;// 将isFlag赋值为false，从而退出while循环
                        break;// 结束switch语句
                    }
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);// 定义一个类变量Scanner，使scanner可以被类的全部对象共享。

    private static String readKeyBoard(int limit) {// 创建读取键盘方法，传入的参数limit为限制输入的长度
        String line = "";// 定义字符串型变量line,用于存储用户输入的数据
        while (scanner.hasNext()) {// 当scanner对象接收来的数据还未读取完时，执行while循环中的代码
            line = scanner.nextLine();// 将scanner获取来的数据赋值给line
            if (line.length() < 1 || line.length() > limit) {// 当line字符串的长度小于1或者大于limit参数，则用println语句输出提示：输入长度（不大于）limit错误，请重新输入。
                System.out.println("输入长度（不大于）" + limit + "错误，请重新宿输入：");
                continue;// 使用continue跳过当前执行，直接进入循环的下一次执行
            }
            break;// 如果没有输入错误，则结束循环
        }
        return line;// 返回用户键盘输入的字符。
    }

    public static char readConfirmSelection() {// 创建一个用于确认选择的输入。
        char c;// 定义一个字符型变量char
        for (; ; ) {// 无限循环，直到用户输入有效的字符。
            String str = readKeyBoard(1).toUpperCase();// 读取用户输入的字符串，并将其转换为大写。
            c = str.charAt(0); // 取出字符串的第一个字符。
            if (c == 'Y' || c == 'N') {// 检查输入的字符是否为 'Y' 或 'N'
                break;// 如果输入是 'Y' 或 'N'，则跳出循环，表示输入有效。
            } else {
                System.out.println("选择错误，请重新输入：");// 如果输入不是 'Y' 或 'N'，则用println语句提示用户重新输入。
            }
        }
        return c;// 返回有效的字符 'Y' 或 'N'。
    }

    public static String readString() {// 创建一个用于收入和支出说明的输入的方法
        String str = readKeyBoard(8);// 定义一个字符串型变量str,用于从键盘读取一个不超过8位长度的字符串
        return str;// 并将其作为方法的返回值
    }

    public static int readNumber() {// 创建方法用于收入和支出金额的输入。
        int n;// 声明一个整型变量n，用于存储用户输入的整数。
        for (; ; ) {// 使用无限循环，直到用户输入有效的整数。
            String str = readKeyBoard(4);// 调用readKeyBoard方法，读取并返回用户输入的字符串，参数4表示最大长度
            try {// 尝试将字符串转换为整数。
                n = Integer.parseInt(str);
                break;// 如果转换成功，跳出循环。
            } catch (NumberFormatException e) {// 如果转换失败（即输入的不是有效的整数），则捕获NumberFormatException异常。
                System.out.println("数字输入错误，请重新输入：");// 用println语句，提示用户输入错误，并准备重新读取。
            }
        }
        return n;// 返回用户输入的整数。
    }

    public static char readMenuSelection() {// 创建一个方法用于界面菜单的选择。
        char c;// 声明一个字符变量c，用于存储用户输入的菜单选项。
        for (; ; ) {// 使用无限循环，直到用户输入有效的菜单选项。
            String str = readKeyBoard(1);// 调用readKeyBoard方法，读取并返回用户输入的字符串，参数1表示只读取一个字符。
            c = str.charAt(0);// 从返回的字符串中获取第一个字符，并赋值给c。
            if (c != '1' && c != '3' && c != '4') {// 检查c是否是'1'、'3'或'4'中的一个。
                System.out.println("选择错误，请重新输入：");// 如果不是，提示用户输入错误，并准备重新读取。
            } else// 如果是，跳出循环。
                break;
        }
        return c;// 返回用户输入的菜单选项。
    }
}
