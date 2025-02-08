package castle_extended_1_new;

public class Fridge implements IFridge {
    @Override
    public void start() {
        System.out.println("Fridge started.");
    }

    @Override
    public void close() {
        System.out.println("Fridge closed.");
    }

    @Override
    public void on() {
        start();
    }

    @Override
    public void off() {
        close();
    }
}