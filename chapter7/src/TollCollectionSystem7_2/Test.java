package TollCollectionSystem7_2;

public class Test {
    public static void main(String[] args) {
        // 出租车费用计算
        PriceCalculator taxiCalc = new TaxiPriceCalculator();
        System.out.println("出租车费用（行驶10公里）: " + taxiCalc.calculatePrice(10) + "元");
        // 公交车费用计算
        PriceCalculator busCalc = new BusPriceCalculator();
        System.out.println("公交车费用: " + busCalc.calculatePrice(0) + "元");
        // 电影院费用计算
        PriceCalculator cinemaCalc2D = new CinemaPriceCalculator("2D");
        System.out.println("2D电影票价: " + cinemaCalc2D.calculatePrice(0) + "元");
        PriceCalculator cinemaCalc3D = new CinemaPriceCalculator("3D");
        System.out.println("3D电影票价: " + cinemaCalc3D.calculatePrice(0) + "元");
        PriceCalculator cinemaCalcIMAX = new CinemaPriceCalculator("IMAX");
        System.out.println("IMAX电影票价: " + cinemaCalcIMAX.calculatePrice(0) + "元");
    }
}
