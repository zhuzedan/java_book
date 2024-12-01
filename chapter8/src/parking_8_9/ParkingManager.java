package parking_8_9;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    // 存储停车场内的车辆
    private List<CarParking> cars = new ArrayList<>();
    // 最大停车数量
    private int maxNumber = 100;
    // 当前停车数量
    private int currentNumber = 0;

    // 记录车辆入场
    public void enter(String lpn) {
        if (maxNumber <= cars.size()) {
            System.out.println("停车场已满，无法入场");
            return;
        }
        CarParking car = new CarParking(lpn, System.currentTimeMillis());
        cars.add(car);
        currentNumber = cars.size();
        System.out.println("车辆 " + lpn + " 已进入停车场。剩余车位：" + (maxNumber - currentNumber));
    }

    // 车辆出场并计算费用
    public void exit(String licensePlate) {
        for (int i = 0; i < cars.size(); i++) {
            CarParking car = cars.get(i);
            if (car.getLpn().equals(licensePlate)) {
                long stayTime = System.currentTimeMillis() - car.getEnterDate();
                // 测试用，随机增加停留时间
                stayTime += Math.round(1 * 3600000.0 * (Math.random() * 10));
                // 计算费用
                double fee = calculateFee(stayTime);
                // 移除已出场的车辆
                cars.remove(i);
                currentNumber = cars.size();
                System.out.printf("车辆 %s 出场，停留时间为 %.2f 小时，费用为 %.2f 元。剩余车位：%d\n", licensePlate, stayTime / 3600000.0, fee, maxNumber - currentNumber);
                return;
            }
        }
        System.out.println("未找到车牌号为 " + licensePlate + " 的车辆。");
    }

    // 计算费用
    private double calculateFee(long stayTime) {
        double hours = stayTime / 3600000.0; // 将停留时间转换成小时
        return Math.ceil(hours) * 5; // 假设每小时收费5元，向上取整
    }
}
