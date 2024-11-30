import java.util.Scanner;

public class StudentSystem {
    private Student[] students = new Student[1000];
    private String account = "admin";
    private String password = "123456";

    public Student addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生的姓名");
        String name = sc.next();
        System.out.print("请输入学生的年龄");
        int age = sc.nextInt();
        Student newStu = new Student(name, age);
        return newStu;
    }

    Scanner input = new Scanner(System.in);

    public void login() {
        int i = 0;
        while (i < 3) {
            System.out.println("请输入您的账户：");
            String inputAccount = input.next();
            System.out.println("请输入您的密码：");
            String inputPassword = input.next();
            if (inputAccount.equals(account) &&
                    inputPassword.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("账户或密码输入错误，请重新输入！");
            }
        }
    }

    public void run() {
        login();
        int i = 0;
        String flag = "";
        while (true) {
            System.out.print("录入报到学生信息(Y),退出(N)：");
            flag = input.next();
            if (flag.equals("Y")) {
                students[i] = addStudent();
                Student.increase();
                System.out.println("当前报到人数为：" + Student.getCount());
                i = i + 1;
                for (int j = 0; j < i; j++)
                    System.out.println(students[j]);
            }
        }
    }
}
