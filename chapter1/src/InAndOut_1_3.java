import java.util.Scanner;

public class InAndOut_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学号");
        int id = in.nextInt();
        System.out.println("请输入姓名");
        String name = in.next();
        System.out.println("请输入性别");
        String sex = in.next();
        System.out.println(id);
        System.out.println(name);
        System.out.println(sex);
    }
}