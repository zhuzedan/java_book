public class Student {
    private String name;
    private int age;
    static String grade = "2023级";  // 静态属性

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void show() {
        System.out.println("我的年级为：" + grade);
    }
}

