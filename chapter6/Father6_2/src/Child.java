public class Child extends Father {
    protected String lastName;
    private String firstName = "Brandon";

    public void introduce() {
        System.out.println("My name is " + super.lastName + this.firstName); // 使用super访问父类的属性
        System.out.print("My father’s name is ");
        super.introduce();// 使用super访问父类的方法
    }
}
