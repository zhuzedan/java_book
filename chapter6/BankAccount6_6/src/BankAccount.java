public class BankAccount {
    private double balance;
    private final String ACCOUNTID = "3901001";

    public void modify() {
        ACCOUNTID = "3901002";// 编译错误！！！
    }
}
