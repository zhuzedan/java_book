public class Student_5_1 {
    private String name;  // 属性私有化
    private int age; // 属性私有化

    public String getName() {  // getter方法
        return name;
    }

    public void setName(String stuName) {  // setter方法
        name = stuName;
    }

    public int getAge() {  // getter方法
        return age;
    }

    public void setAge(int stuAge) {  // setter方法
        if (stuAge >= 18 && stuAge <= 28)
            age = stuAge;
        else
            System.out.println("年龄输入有误");
    }

    public static void main(String[] args) {
        Student_5_1 stu1 = new Student_5_1();
        stu1.setName("宁小才");// 使用setter方法为属性赋值
        stu1.setAge(10);// 使用setter方法为属性赋值
        System.out.println("学生姓名为：" + stu1.getName() + ",年龄为" + stu1.getAge());// 使用getter方法获取属性值
    }
}


