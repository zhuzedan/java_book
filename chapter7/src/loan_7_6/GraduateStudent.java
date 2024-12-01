package loan_7_6;

public class GraduateStudent implements Person {
    private String name;
    private double monthlyLivingCost;
    private double monthlySalary;

    public GraduateStudent(String name, double monthlyLivingCost, double monthlySalary) {
        this.name = name;
        this.monthlyLivingCost = monthlyLivingCost;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void printIncomeAndExpense() {
        double income = monthlySalary;
        double expense = monthlyLivingCost;
        double netIncome = income - expense;
        System.out.println("在职研究生 " + name + " 的月收支情况：收入 " + income + " 元，支出 " + expense + " 元，净收入 " + netIncome + " 元");
        if (netIncome < 2000) {
            System.out.println("在职研究生 " + name + " 需要贷款");
        } else {
            System.out.println("在职研究生 " + name + " 不需要贷款");
        }
    }
}
