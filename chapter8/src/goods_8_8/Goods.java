package goods_8_8;

public class Goods {
    private int id;
    private String goodsName;
    private double price;

    public Goods(int id, String goodsName, double price) {
        this.id = id;
        this.goodsName = goodsName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                '}';
    }
}
