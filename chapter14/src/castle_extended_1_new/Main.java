package castle_extended_1_new;

// 主方法
public class Main {
    public static void main(String[] args) {
        // 创建遥控器和设备对象
        IDevice hairTv = new TVFactory().createDevice();
        IDevice fridge = new FridgeFactory().createDevice();
        IDevice light = new LightFactory().createDevice();

        // 创建遥控器并关联设备
        IRemote remoteForHair = new Remote(hairTv);
        IRemote remoteForFridge = new Remote(fridge);
        IRemote remoteForLight = new Remote(light);

        // 测试遥控器是否能够正确地控制设备
        remoteForHair.on(); // 应该打印出 "ChangHong TV turned on."
        remoteForHair.off(); // 应该打印出 "ChangHong TV turned off."

        remoteForFridge.on(); // 应该打印出 "Fridge started."
        remoteForFridge.off(); // 应该打印出 "Fridge closed."

        remoteForLight.on(); // 应该打印出 "Light turned on."
        remoteForLight.off(); // 应该打印出 "Light turned off."
    }
}