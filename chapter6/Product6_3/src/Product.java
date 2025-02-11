public class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("产品ID：" + id + "，名称：" + name + "，价格：" + price);
    }
}