public class Student {
    private String stuNo;
    private String stuName;
    private int stuAge;
    private static int count = 0; // 记录学生数量

    static {
        count = 0;
    }

    public Student() {
    }

    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuNo = String.format("24%05d", count + 1); // 自动增加并格式化学号
    }

    public String getStuNo() {
        return stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public static int getCount() {
        return count;
    }

    public static void increase() {
        count++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}