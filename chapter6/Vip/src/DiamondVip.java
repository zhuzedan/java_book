public class DiamondVip extends Vip {
    private int initIntegral = 1000; // 初始积分

    public DiamondVip() {
        super("钻石会员");
        this.integral = initIntegral;
    }

    @Override
    public void getGift(String gift) {
        double useIntegral = 0;
        switch (gift) {
            case "玩偶":
                useIntegral = (int) (1000 * 0.8);
                break;
            case "保温杯":
                useIntegral = (int) (500 * 0.8);
                break;
            case "购物抵用券":
                useIntegral = (int) (800 * 0.8);
                break;
            default:
                System.out.println("礼物不存在");
                return;
        }
        if (useIntegral > integral) {
            System.out.println("积分不足");
        } else {
            integral -= useIntegral;
            System.out.println("尊贵的" + type + "，您兑换了" + gift + "，剩余积分：" + integral);
        }
    }
}
