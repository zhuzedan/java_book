public class Test {
    public static void main(String[] args) {
        Vip vip = new Vip();
        Vip goldenVip = new GoldenVip();
        Vip diamondVip = new DiamondVip();
        vip.consume(100);
        vip.getGift("玩偶");
        vip.getGift("保温杯");
        goldenVip.consume(100);
        goldenVip.getGift("玩偶");
        goldenVip.getGift("保温杯");
        diamondVip.consume(100);
        diamondVip.getGift("玩偶");
        diamondVip.getGift("购物抵用券");
    }
}
