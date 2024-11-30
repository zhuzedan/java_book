package Transportation7_1;

public abstract class Vehicle implements Rental {
    protected String brand; // 品牌
    protected String type; // 类型
    protected long rentStartTime; // 租车开始时间

    public abstract void charge(long rentTime);
}
