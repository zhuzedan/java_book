package parking_8_9;

public class CarParking {
    private String lpn; // 车牌号
    private long enterDate; // 停车时间

    public CarParking(String lpn, long enterDate) {
        this.lpn = lpn;
        this.enterDate = enterDate;
    }

    public String getLpn() {
        return lpn;
    }

    public long getEnterDate() {
        return enterDate;
    }
}
