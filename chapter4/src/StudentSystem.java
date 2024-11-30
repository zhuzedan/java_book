import java.util.Scanner;

public class StudentSystem {
    Student[] students = new Student[1000];
    String account = "admin";
    String password = "123456";

    public Student addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生的学号");
        String no = sc.next();
        System.out.print("请输入学生的姓名");
        String name = sc.next();
        System.out.print("请输入学生的年龄");
        int age = sc.nextInt();
        Student newStu = new Student();
        newStu.stuNo = no;
        newStu.stuName = name;
        newStu.stuAge = age;
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
        String flage = "";
        while (true) {
            System.out.print("录入报到学生信息(Y),退出(N)：");
            flage = input.next();
            if (flage.equals("Y")) {
                students[i] = addStudent();
                i = i + 1;
                for (int j = 0; j < i; j++)
                    System.out.println(students[j]);
            } else if (flage.equals("N")) {
                System.exit(0);
            } else {
                System.out.print("输入错误，请重新输入！");
            }
        }
    }
}
