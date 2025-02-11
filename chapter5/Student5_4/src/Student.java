public class Student {
    private String name;
    private int age;

    public int getAge() {
        return this.age;
    }

    public void printInfo() {
        System.out.println(name + "的年龄是" + this.getAge());
    }

}
