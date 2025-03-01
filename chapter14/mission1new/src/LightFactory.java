public class LightFactory implements DeviceFactory {
    @Override
    public IDevice createDevice() {
        return new Light();
    }
}
