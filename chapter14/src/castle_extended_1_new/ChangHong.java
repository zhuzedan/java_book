package castle_extended_1_new;

// 具体设备类
public class ChangHong implements ITV {
    @Override
    public void turnOn() {
        System.out.println("ChangHong TV turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("ChangHong TV turned off.");
    }

    @Override
    public void on() {
        turnOn();
    }

    @Override
    public void off() {
        turnOff();
    }
}