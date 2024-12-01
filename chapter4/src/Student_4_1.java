public class Student_4_1 {
    // 定义学生的基本属性
    public String name;
    public int age;

    // 自我介绍的方法
    public String introduce() {
        return "大家好，我叫" + this.name + "，今年" + this.age + "岁。";
    }

    // 主函数用于测试
    public static void main(String[] args) {
        // 创建两个学生对象并设置他们的名字和年龄
        Student_4_1 stu1 = new Student_4_1();
        Student_4_1 stu2 = new Student_4_1();

        stu1.name = "宁小才";
        stu1.age = 20;
        stu2.name = "宁小静";
        stu2.age = 21;

        // 打印每个学生的自我介绍
        System.out.println(stu1.introduce());
        System.out.println(stu2.introduce());
    }
}