package price_7_7;

public class Clothing extends Goods implements VipPrice {
    private String style;
    private double price;

    public Clothing(String style) {
        this.style = style;
    }

    public Clothing(double unitPrice, int account, String style) {
        super(unitPrice, account);
        this.style = style;
        this.price = unitPrice * account;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "style='" + style + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double reducePrice() {
        return price = price * DISCOUNT;
    }
}
