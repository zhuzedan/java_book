package stumanage_8_10;

public class Student implements Comparable<Student> {
    // 学号
    private String id;
    // 姓名
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id.compareTo(other.id); // 根据学号比较
    }

    @Override
    public String toString() {
        return "学号: " + id + ", 姓名: " + name;
    }
}
