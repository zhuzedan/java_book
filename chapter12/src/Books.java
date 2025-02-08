public class Books {
    // 图书编号
    private int id;
    // 图书名称
    private String name;
    // 出版社
    private String publish;
    // 单价
    private double price;
    // 购买数量
    private int number;
    // 总价
    private double money;

    public Books(int id, String name, String publish, double price) {
        this.id = id;
        this.name = name;
        this.publish = publish;
        this.price = price;
        this.number = 0;
        this.money = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publish='" + publish + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", money=" + money +
                '}';
    }

    // 修改number的方法
    public void setNum(int num) {
        this.number = num;
        // 更新总价
        this.money = this.price * num;
    }
}