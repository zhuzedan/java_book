import java.util.Scanner;

public class Score_2_11 {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("请输入百分制成绩：");
        Scanner in = new Scanner(System.in);
        score = in.nextInt();
        switch (score / 10) {
            case 10:
            case 9:
                System.out.print("等级：优秀");
                break;
            case 8:
                System.out.print("等级：良好");
                break;
            case 7:
                System.out.print("等级：中等");
                break;
            case 6:
                System.out.print("等级：及格");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.print("等级：不及格");
                break;
            default:
                System.out.print("输入不合法");
        }
    }
}
