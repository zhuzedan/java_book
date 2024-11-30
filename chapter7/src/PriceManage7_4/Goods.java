package PriceManage7_4;

public class Goods {
    private double unitPrice;//单价
    private int account;//数量

    public Goods() {
    }
    public Goods(double unitPrice, int account) {
        this.unitPrice = unitPrice;
        this.account = account;
    }
    public double totalPrice() {
        return unitPrice * account;
    }
}
