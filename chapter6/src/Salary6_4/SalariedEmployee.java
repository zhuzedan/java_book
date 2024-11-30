package Salary6_4;

public class SalariedEmployee extends Employee{
    private double monthlySalary;
    public SalariedEmployee(String name, int birthMonth, double monthlySalary) {
        super(name, birthMonth);
        this.monthlySalary = monthlySalary;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    @Override
    protected double calculateSalary(int month) {
        return monthlySalary;
    }
}
