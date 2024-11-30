package PriceManage7_4;

public class Test {
    public static void main(String[] args) {
        Clothing clothing = new Clothing(200, 1, "男装");
        System.out.println("原价格：" + clothing.totalPrice());// 计算价格
        System.out.println("打折价格：" + clothing.reducePrice());// 计算打折价格
    }
}
