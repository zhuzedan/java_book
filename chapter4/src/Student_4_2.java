public class Student_4_2 {
    // 定义学生的基本属性
    public String name;
    public int age;

    // 自我介绍的方法
    public String introduce() {
        return "大家好，我叫" + this.name + "，今年" + this.age + "岁。";
    }

    // 主函数用于测试
    public static void main(String[] args) {
        Student_4_2 stu1 = new Student_4_2();
        stu1.name = "宁小才";
        stu1.age = 20;
        Student_4_2 stu2 = stu1;
        System.out.println(stu1.introduce());
        System.out.println(stu2.introduce());
    }
}