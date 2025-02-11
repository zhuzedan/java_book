public final class BankAccount {
    private double balance;//账户余额
    private String accountId; //账户ID
    public void deposit(double amount) {// 存款方法
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("存款金额必须大于0");
        }
    }
    public void withdraw(double amount) {// 取款方法
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("取款金额必须大于0且不超过账户余额");
        }
}
}

