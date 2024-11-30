package VIP6_1;

public class GoldenVip extends Vip{
    public GoldenVip() {
        super("黄金会员");
    }
    @Override
    public void getGift(String gift) {
        int useIntegral = 0;
        switch (gift) {
            case "玩偶":
                useIntegral = (int)(1000 * 0.9);
                break;
            case "保温杯":
                useIntegral =  (int)(500 * 0.9);
                break;
            default:
                System.out.println("礼物不存在");
                return;
        }
        if (useIntegral > integral) {
            System.out.println("积分不足");
        } else {
            integral -= useIntegral;
            System.out.println("尊贵的" + type +"，您兑换了" + gift + "，剩余积分：" + integral);
        }
    }
}
