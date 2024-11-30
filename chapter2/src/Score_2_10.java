import java.util.Scanner;

public class Score_2_10 {
    public static void main(String[] args) {
        int score;
        System.out.println("请输入百分制成绩：");
        Scanner in = new Scanner(System.in);
        score = in.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("输入不合法");
        } else {
            if (score >= 90) {
                System.out.println("等级：优秀");
            } else if (score >= 80) {
                System.out.println("等级：良好");
            } else if (score >= 70) {
                System.out.println("等级：中等");
            } else if (score >= 60) {
                System.out.println("等级：及格");
            } else {
                System.out.println("等级：不及格");
            }
        }
    }
}
