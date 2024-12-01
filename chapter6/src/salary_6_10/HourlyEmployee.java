package salary_6_10;

public class HourlyEmployee extends Employee{
    private double hourlyWage;
    private double hoursWorked;
    public HourlyEmployee(String name, int birthMonth, double hourlyWage, double hoursWorked) {
        super(name, birthMonth);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    public double getHourlyWage() {
        return hourlyWage;
    }
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    protected double calculateSalary(int month) {
        double baseSalary = hourlyWage * hoursWorked;
        if (hoursWorked > 160) {
            double overtimeHours = hoursWorked - 160;
            double overtimePay = overtimeHours * hourlyWage * 1.5;
            baseSalary += overtimePay;
        }
        return baseSalary;
    }
}
