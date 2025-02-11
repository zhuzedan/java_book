import java.util.Scanner;

public class SportCourse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入性别：ture代表男，false代表女");
        boolean sex = in.nextBoolean();
        if (sex) {
            System.out.println("选修篮球");
        } else {
            System.out.println("选修瑜伽");
        }
    }
}
