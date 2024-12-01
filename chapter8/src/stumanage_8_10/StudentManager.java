package stumanage_8_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManager {
    private Map<String, Student> students = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    // 新增学生
    public void addStudent() {
        System.out.print("请输入学号: ");
        String id = scanner.nextLine();
        System.out.print("请输入姓名: ");
        String name = scanner.nextLine();
        Student student = new Student(id, name);
        if (!students.containsKey(student.getId())) {
            students.put(student.getId(), student);
            System.out.println("学员 " + student.getName() + " 添加成功！");
        } else {
            System.out.println("学员 " + student.getName() + " 已存在，无法重复添加！");
        }
    }

    public void editStudent() {
        System.out.print("请输入要编辑的学号: ");
        String id = scanner.nextLine();
        if (students.containsKey(id)) {
            System.out.print("请输入新的姓名: ");
            String newName = scanner.nextLine();
            Student student = students.get(id);
            student.setName(newName);
            System.out.println("学员 " + id + " 信息更新为：" + student);
        } else {
            System.out.println("未找到学号为 " + id + " 的学员。");
        }
    }

    // 删除学生
    public void deleteStudent() {
        System.out.print("请输入要删除的学号: ");
        String id = scanner.nextLine();
        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("学员 " + id + " 已被删除。");
        } else {
            System.out.println("未找到学号为 " + id + " 的学员。");
        }
    }

    // 查看所有学生信息
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("没有学员信息。");
        } else {
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }

    // 根据学号查看单个学生信息
    public void viewStudentById() {
        System.out.print("请输入要查看的学号: ");
        String id = scanner.nextLine();
        if (students.containsKey(id)) {
            System.out.println(students.get(id));
        } else {
            System.out.println("未找到学号为 " + id + " 的学员。");
        }
    }

    // 主菜单
    public void showMenu() {
        while (true) {
            System.out.println("\n学生信息管理系统");
            System.out.println("1. 新增学员");
            System.out.println("2. 编辑学员");
            System.out.println("3. 删除学员");
            System.out.println("4. 查看所有学员");
            System.out.println("5. 查看单个学员");
            System.out.println("6. 退出系统");
            System.out.print("请选择操作: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    editStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    viewAllStudents();
                    break;
                case "5":
                    viewStudentById();
                    break;
                case "6":
                    System.out.println("感谢使用学生信息管理系统，再见！");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("无效的选择，请重新选择。");
            }
        }
    }
}
