public class Drink {
    private String name;
    private double price;
    private int num;

    public Drink() {
    }

    public Drink(String name, double price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void show() {
        System.out.println("您已购买" + name + num + "瓶,需要支付" + price * num + "元");
    }
}
