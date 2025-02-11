public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("宁小才", 20);
        stu1.show();  // 使用对象访问静态方法
        Student.show(); // 使用类名访问静态方法
    }
}
