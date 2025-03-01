public class FridgeFactory implements DeviceFactory {
    @Override
    public IDevice createDevice() {
        return new Fridge();
    }
}
