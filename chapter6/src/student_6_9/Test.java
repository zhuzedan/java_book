package student_6_9;

public class Test {
    public static void main(String[] args) {
        // 创建学生对象
        int[] score1 = {85,78,92};
        int[] score2 = {72, 65, 70};
        int[] score3 = {88, 85, 90};
        int[] score4 = {75, 70, 65};
        Student student1 = new Undergraduate("U123", "张三", score1);
        Student student2 = new Undergraduate("U124", "李四", score2);
        Student student3 = new Graduate("G123", "王五", score3);
        Student student4 = new Graduate("G124", "赵六", score4);
        // 打印学生的成绩等级
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
    }
}
