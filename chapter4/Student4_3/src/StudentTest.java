public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "宁小才";
        stu1.age = 20;
        Student stu2 = stu1;
        System.out.println(stu1.introduce());
        System.out.println(stu2.introduce());
    }
}
