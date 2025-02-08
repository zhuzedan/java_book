package castle_extended_1_new;

public class Light implements ILight {
    @Override
    public void turnOn() {
        System.out.println("Light turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light turned off.");
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