package castle_extended_3_new;

public class ComputerPriceCode implements PriceCode {
    @Override
    public double calculateAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}