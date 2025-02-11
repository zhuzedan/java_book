public class Trunk implements Vehicle, Transport {
    @Override
    public void startEngine() {
        System.out.println("卡车引擎已启动");
    }

    @Override
    public void loadCargo(int weight) {
        System.out.println("卡车装载了" + weight + "公斤的货物");
    }
}
