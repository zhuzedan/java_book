public class Student {
    private String name;
    private int age;

    public Student(String name) { // 构造方法1：一个参数的构造方法
        this.name = name;
    }

    public Student(String name, int age) {// 构造方法2：两个参数的构造方法
        this(name);// 调用一个参数的构造方法
        this.age = age;
    }
}
