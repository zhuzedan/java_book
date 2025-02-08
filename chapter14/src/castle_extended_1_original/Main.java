package castle_extended_1_original;

// 主方法
public class Main {
    public static void main(String[] args) {
        // 创建遥控器和电视对象
        ITV hairTv = new Hair();
        ITV changHongTv = new ChangHong();

        // 创建遥控器并关联电视
        IRemote remoteForHair = new Remote(hairTv);
        IRemote remoteForChangHone = new Remote(changHongTv);

        // 测试遥控器是否能够正确地控制电视
        remoteForHair.on(); // 应该打印出 "Hair TV turned on."
        remoteForHair.off(); // 应该打印出 "Hair TV turned off."

        remoteForChangHone.on(); // 应该打印出 "ChangHong TV turned on."
        remoteForChangHone.off(); // 应该打印出 "ChangHong TV turned off."
    }
}