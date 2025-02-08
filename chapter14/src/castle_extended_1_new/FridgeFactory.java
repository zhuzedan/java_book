package castle_extended_1_new;

public class FridgeFactory implements DeviceFactory {
    @Override
    public IDevice createDevice() {
        return new Fridge();
    }
}
