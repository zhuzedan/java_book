package TollCollectionSystem7_2;

public class BusPriceCalculator implements PriceCalculator {
    @Override
    public double calculatePrice(double distance) {
        return 2.0; // 公交车全程两元
    }
}
