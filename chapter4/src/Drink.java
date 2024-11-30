public class Drink {
    String name;
    double price;
    int num;

    public void show() {
        System.out.println("您已购买" + name + num + "瓶,需要支付" + price * num + "元");
    }
}
