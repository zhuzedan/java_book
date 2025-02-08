package castle_extended_1_original;

// Hair 类实现了 ITV 接口
class Hair implements ITV {
    @Override
    public void turnOn() {
        System.out.println("Hair TV turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Hair TV turned off.");
    }
}