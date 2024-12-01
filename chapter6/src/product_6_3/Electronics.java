package product_6_3;

public class Electronics extends Product {
    private String warrantyPeriod;

    public Electronics(String id, String name, double price, String warrantyPeriod) {
        super(id, name, price); // 调用父类的构造方法
        this.warrantyPeriod = warrantyPeriod;
    }

    public void displayWarranty() {
        System.out.println("保修期：" + warrantyPeriod);
    }
}