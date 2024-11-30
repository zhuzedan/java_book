package Transportation7_1;

public class Bike extends Vehicle {
    public Bike() {
    }

    public Bike(String brand) {
        this.brand = brand;
        this.type = "自行车";
    }

    @Override
    public void rent() {
        this.rentStartTime = System.currentTimeMillis();
        System.out.println("Hello！" + this.brand);
    }

    @Override
    public void charge(long rentTime) {
        double amount = Math.ceil((double) rentTime / 60000 / 30) * 1.8;
        System.out.printf("本单金额为：%.2f\n", amount);
    }

    @Override
    public void back(long rentEndTime) {
        long rentTime = rentEndTime - rentStartTime;
        System.out.println("还车成功！开始结算...");
        charge(rentTime);
    }
}
