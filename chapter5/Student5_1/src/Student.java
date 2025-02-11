public class Student {
    private String name;  // 属性私有化
    private int age; // 属性私有化

    public void setName(String stuName) {
        name = stuName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int stuAge) {  // setter方法
        if (stuAge >= 18 && stuAge <= 28)
            age = stuAge;
        else
            System.out.println("年龄输入有误");
    }
}

