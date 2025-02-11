public class Vip {
    private final int pointsPerYuan = 10; // 消费1元获得10积分
    protected int integral = 0; // 积分
    protected String type = "普通会员";

    public Vip() {
    }

    public Vip(String type) {
        this.type = type;
    }

    public final void consume(int amount) {
        int integral = amount * pointsPerYuan;
        this.integral += integral;
        System.out.println("尊贵的" + type + "，您获得了 " + integral + " 积分，" + "当前积分：" + this.integral);
    }

    public void getGift(String gift) {
        int useIntegral = 0;
        switch (gift) {
            case "玩偶":
                useIntegral = 1000;
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
