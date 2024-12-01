package toll_7_5;

public class BusPriceCalculator implements PriceCalculator {
    @Override
    public double calculatePrice(double distance) {
        return 2.0; // 公交车全程两元
    }
}
