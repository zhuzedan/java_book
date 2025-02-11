public class Student {
    private String name;
    private int age;

    public Student() {  // 无参构造方法
        System.out.println("无参构造方法");
    }

    public Student(String stuName, int stuAge) {  // 有参构造方法
        name = stuName;
        age = stuAge;
    }
}

