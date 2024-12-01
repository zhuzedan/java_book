package loan_7_6;

public class Teacher implements Person {
    private String name;
    private double monthlySalary;

    public Teacher(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void printIncomeAndExpense() {
        double income = monthlySalary;
        double expense = 0; // 老师没有额外支出
        double netIncome = income - expense;
        System.out.println("老师 " + name + " 的月收支情况：收入 " + income + " 元，支出 " + expense + " 元，净收入 " + netIncome + " 元");
        if (netIncome < 2000) {
            System.out.println("老师 " + name + " 需要贷款");
        } else {
            System.out.println("老师 " + name + " 不需要贷款");
        }
    }
}
