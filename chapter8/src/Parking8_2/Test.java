package Parking8_2;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ParkingManager parkingManager = new ParkingManager();
        // 模拟车辆入场
        parkingManager.enter("粤A12345");
        // 再次模拟车辆入场
        parkingManager.enter("京B67890");
        // 车辆出场
        parkingManager.exit("粤A12345");
        parkingManager.exit("京B67890");
    }
}
