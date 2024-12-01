package transport_7_3;

public class Car implements Vehicle, Transport {
    @Override
    public void startEngine() {
        System.out.println("小轿车引擎已启动");
    }

    @Override
    public void loadCargo(int weight) {
        System.out.println("小轿车装载了" + weight + "公斤的货物");
    }
}
