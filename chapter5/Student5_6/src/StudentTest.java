public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("宁小才", 20);
        Student stu2 = new Student("宁小静", 21);
        stu1.grade = "2024级";  // 对象stu1更改静态属性的值
        System.out.println(stu2.grade); // 输出结果为：2024级
    }
}