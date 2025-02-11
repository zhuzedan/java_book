public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("宁小才");// 使用setter方法为属性赋值
        stu1.setAge(10);// 使用setter方法为属性赋值
        System.out.println("学生姓名为：" + stu1.getName() + ",年龄为" + stu1.getAge());// 使用getter方法获取属性值
    }
}
