package castle_extended_1_new;

public class LightFactory implements DeviceFactory {
    @Override
    public IDevice createDevice() {
        return new Light();
    }
}
