import java.util.Scanner;

public class StudentSystem {
    private Student[] students = new Student[1000];
    private String account = "admin";
    private String password = "123456";
    private int i = 0; // 存储学生的索引

    public Student addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生的姓名: ");
        String name = sc.next();
        System.out.print("请输入学生的年龄: ");
        int age = sc.nextInt(); // 修改为nextInt()以匹配构造函数参数类型
        return new Student(name, age);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("录入报到学生信息(Y),退出(N): ");
            String flag = input.next();
            if(flag.equalsIgnoreCase("Y")) {
                students[i] = addStudent();
                Student.increase();
                System.out.println("当前报到人数为：" + Student.getCount());
                i++;
                for(int j=0; j<i; j++)
                    System.out.println(students[j]);
            } else if(flag.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        new StudentSystem().run();
    }
}