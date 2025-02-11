import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩");
        double score = in.nextDouble();
        if (score > 8.0) {
            System.out.println("请输入性别");
            char gender = in.next().charAt(0);
            if (gender == '男') {
                System.out.println("进入男子组");
            } else if (gender == '女') {
                System.out.println("进入女子组");
            } else {
                System.out.println("你的性别有误，不能参加决赛~");
            }
        } else {
            System.out.println("sorry ,你被淘汰了~");
        }
    }
}