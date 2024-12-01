package salary_6_10;

public class BasePlusSalesEmployee extends SalesEmployee {
    private double baseSalary;
    public BasePlusSalesEmployee(String name, int birthMonth, double monthlySales, double commissionRate, double baseSalary) {
        super(name, birthMonth, monthlySales, commissionRate);
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    protected double calculateSalary(int month) {
        return super.calculateSalary(month) + baseSalary;
    }
}
