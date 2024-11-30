public class Account {
    private String accountName;
    private double income;
    private double outcome;

    public Account() {
    }

    public Account(String accountName, double income, double outcome) {
        if (income > 0 && outcome > 0) {
            this.accountName = accountName;
            this.income = income;
            this.outcome = outcome;
        } else {
            System.out.println("金额输入有误");
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        if (income > 0)
            this.income = income;
        else
            System.out.println("金额输入有误");
    }

    public double getOutcome() {
        return outcome;
    }

    public void setOutcome(double outcome) {
        if (outcome > 0)
            this.outcome = outcome;
        else
            System.out.println("金额输入有误");
    }

    public double compute() {
        return income - outcome;
    }

    public void printInfo() {
        System.out.println(accountName + "存入" + income + "元，支出" + outcome + "元，余额为" + compute() + "元");
    }
}
