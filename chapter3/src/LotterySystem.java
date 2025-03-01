import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args) throws InterruptedException {
        String[] phoneNums = {"187****3612", "199****7781", "137****8121", "187****7033", "155****2478", "131****7126", "132****6947", "130****5401", "188****5633", "138****8193"};
        Scanner input = new Scanner(System.in);
        System.out.println("---------欢迎来到晚会抽奖系统---------");
        System.out.println("本次晚会共有3轮抽奖环节");
        for (int i = 1; i <= 3; i++) {
            System.out.println("本轮抽奖为第 " + i + " 轮" + "\n" + "请设置中奖人数：");
            int n = input.nextInt();
            System.out.println("按下S键开始抽奖：");
            String key = input.next();
            if (key.equals("S")) {
                System.out.println("名单开始滚动...");
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < phoneNums.length; k++) {
                        Thread.sleep(100);
                        System.out.println(phoneNums[k]);
                    }
                }
                System.out.println("---------------------------------");
            }
            if (n == 1) {
                choose(phoneNums);
            } else if (n > 1) {
                choose(phoneNums, n);
            }
        }
    }

    public static void choose(String[] phoneNums) {
        int ran = (int) (Math.random() * phoneNums.length);
        String str = phoneNums[ran].substring(7);
        System.out.println("恭喜手机尾号为 " + str + " 的朋友，您中奖了！");
        System.out.println("---------------------------------");
    }

    public static boolean compare(int[] indexs, int n) {
        for (int i : indexs) {
            if (n == i) {
                return true;
            }
        }
        return false;
    }

    public static void choose(String[] phoneNums, int n) {
        int[] indexs = new int[n];
        int chooseIndex;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                indexs[i] = (int) (Math.random() * phoneNums.length);
            } else {
                chooseIndex = (int) (Math.random() * phoneNums.length);
                while (compare(indexs, chooseIndex)) {
                    chooseIndex = (int) (Math.random() * phoneNums.length);
                }
                indexs[i] = chooseIndex;
            }
        }
        System.out.println("恭喜以下" + n + "位,你们中奖了");
        System.out.println("手机尾号分别为 ");
        for (int i : indexs) {
            String str = phoneNums[i].substring(7);
            System.out.println(str);
        }
        System.out.println("---------------------------------");
    }

}
