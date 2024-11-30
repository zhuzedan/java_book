package Salary6_4;

public class SalesEmployee extends Employee{
    private double monthlySales;
    private double commissionRate;
    public SalesEmployee(String name, int birthMonth, double monthlySales, double commissionRate) {
        super(name, birthMonth);
        this.monthlySales = monthlySales;
        this.commissionRate = commissionRate;
    }
    public double getMonthlySales() {
        return monthlySales;
    }
    public void setMonthlySales(double monthlySales) {
        this.monthlySales = monthlySales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    @Override
    protected double calculateSalary(int month) {
        return monthlySales * commissionRate;
    }
}
