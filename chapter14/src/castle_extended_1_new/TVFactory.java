package castle_extended_1_new;

// 具体工厂类
public class TVFactory implements DeviceFactory {
    @Override
    public IDevice createDevice() {
        return new ChangHong();
    }
}