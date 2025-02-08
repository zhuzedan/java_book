package castle_extended_1_original;

// Remote 类实现了 IRemote 接口
class Remote implements IRemote {
    private ITV tv; // Remote 持有一个 ITV 的引用

    public Remote(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void on() {
        tv.turnOn(); // 调用 ITV 的 turnOn 方法
    }

    @Override
    public void off() {
        tv.turnOff(); // 调用 ITV 的 turnOff 方法
    }
}