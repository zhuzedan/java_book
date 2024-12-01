package student_6_1;

public class Student {
    protected String no;// 父类属性
    protected String name; // 父类属性

    public String stuInfo() {// 父类方法，用于返回学生的基本信息
        return "学号:" + no + "，姓名:" + name;
    }
}

