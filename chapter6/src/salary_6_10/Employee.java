package salary_6_10;

public class Employee {
    private String name;
    private int birthMonth;
    public Employee(String name, int birthMonth) {
        this.name = name;
        this.birthMonth = birthMonth;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthMonth() {
        return birthMonth;
    }
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }
    public double getSalary(int month) {
        double salary = calculateSalary(month);
        if (month == birthMonth) {
            salary += 100; // 生日奖金
        }
        return salary;
    }
    protected double calculateSalary(int month) {
        return 0; // 默认实现，子类需要重写
    }
}
