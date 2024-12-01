package product_6_3;

public class Test {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("001", "笔记本电脑", 800.00, "1年");
        laptop.displayInfo(); // 显示产品信息
        laptop.displayWarranty(); // 显示保修信息
    }
}
