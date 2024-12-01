package student_6_1;

public class Undergraduate extends Student {
    private String major; // 子类属性

    public String getMajor() {// 子类方法
        return this.major;
    }

    public void setMajor(String major) {// 子类方法
        this.major = major;
    }
}