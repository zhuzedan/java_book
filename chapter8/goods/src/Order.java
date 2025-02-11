public class Order {
    private int orderId;
    private int status;
    private String goodsName;
    private String userNick;

    public Order(int orderId, int status, String goodsName, String userNick) {
        this.orderId = orderId;
        this.status = status;
        this.goodsName = goodsName;
        this.userNick = userNick;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", status=" + status +
                ", goodsName='" + goodsName + '\'' +
                ", userNick='" + userNick + '\'' +
                '}';
    }
}
