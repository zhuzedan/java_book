package loan_7_6;

public class Student implements Person {
    private String name;
    private double monthlyLivingCost;

    public Student(String name, double monthlyLivingCost) {
        this.name = name;
        this.monthlyLivingCost = monthlyLivingCost;
    }

    @Override
    public void printIncomeAndExpense() {
        double income = 0; // 学生没有收入
        double expense = monthlyLivingCost;
        double netIncome = income - expense;
        System.out.println("学生 " + name + " 的月收支情况：收入 " + income + " 元，支出 " + expense + " 元，净收入 " + netIncome + " 元");
        if (netIncome < 2000) {
            System.out.println("学生 " + name + " 需要贷款");
        } else {
            System.out.println("学生 " + name + " 不需要贷款");
        }
    }
}
