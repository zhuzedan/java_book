package castle_extended_1_new;

// 遥控器类
public class Remote implements IRemote {
    private IDevice device;

    public Remote(IDevice device) {
        this.device = device;
    }

    @Override
    public void on() {
        device.on();
    }

    @Override
    public void off() {
        device.off();
    }
}