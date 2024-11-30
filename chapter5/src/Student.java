public class Student {
    private String stuNo;
    private String stuName;
    private int stuAge;

    public Student() {
    }

    public String getStuNo() {
        return this.stuNo;
    }

    public String getStuName() {
        return this.stuName;
    }

    public int getStuAge() {
        return this.stuAge;
    }

    private static int count;

    static {
        count = 0;
    }

    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuNo = String.format("24%05d", count + 1);
    }

    public static int getCount() {
        return count;
    }

    public static void increase() {
        count++;
    }
}
