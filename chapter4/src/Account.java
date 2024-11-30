public class Account {
    String accountName;
    double income;
    double outcome;
    public double compute() {
        return income - outcome;
    }
    public void printInfo(){
        System.out.println(accountName+"存入"+income+"元，支出"+outcome+"元，余额为"+compute()+"元");
    }
}
