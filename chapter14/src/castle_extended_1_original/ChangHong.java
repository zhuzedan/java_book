package castle_extended_1_original;

// ChangHong 类实现了 ITV 接口
class ChangHong implements ITV {
    @Override
    public void turnOn() {
        System.out.println("ChangHong TV turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("ChangHong TV turned off.");
    }
}
