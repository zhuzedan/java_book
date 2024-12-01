package toll_7_5;

public class TaxiPriceCalculator implements PriceCalculator {
    private static final double START_PRICE = 10.0; // 出租车起步价
    private static final double PER_KM_PRICE = 2.0; // 每公里价格

    @Override
    public double calculatePrice(double distance) {
        if (distance <= 0) {
            return 0;
        }
        double basePrice = START_PRICE;
        double additionalPrice = (distance - 3.5) * PER_KM_PRICE;
        return basePrice + additionalPrice;
    }
}
