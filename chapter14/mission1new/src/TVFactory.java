// 具体工厂类
public class TVFactory implements DeviceFactory {
    @Override
    public IDevice createDevice() {
        return new ChangHong();
    }
}