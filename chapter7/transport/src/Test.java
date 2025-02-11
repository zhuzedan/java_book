public class Test {
    public static void main(String[] args) {
        Rental helloBike = new Bike("哈罗单车");
        helloBike.rent();
        helloBike.back(System.currentTimeMillis() + 45 * 60 * 1000);
        Rental camry = new Car("丰田凯美瑞");
        camry.rent();
        camry.back(System.currentTimeMillis() + 2 * 86400 * 1000);
    }
}
