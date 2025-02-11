public class BankAccount {
    private double balance;

    public final void deposit(double amount) {// 存款方法
        balance += amount;
    }
}

