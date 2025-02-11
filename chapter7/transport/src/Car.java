public class Car extends Vehicle{
    public Car(String brand) {
        this.brand = brand;
        this.type = "汽车";
    }
    @Override
    public void rent() {
        this.rentStartTime = System.currentTimeMillis();
        System.out.println("Hello！" + this.brand);
    }
    @Override
    public void charge(long rentTime) {
        double day = Math.ceil((double) rentTime / 60000 / 60 / 24);
        double price = 0;
        switch (brand) {
            case "丰田凯美瑞":
                price = 108;
                break;
            case "奔驰S级":
                price = 178;
                break;
            case "保时捷911":
                price = 258;
                break;
            default:
                break;
        }
        double amount = price * day;
        System.out.printf("本单金额为：%.2f\n", amount);
    }
    @Override
    public void back(long rentEndTime) {
        long rentTime = rentEndTime - rentStartTime;
        System.out.println("还车成功！开始结算...");
        charge(rentTime);
    }
}
