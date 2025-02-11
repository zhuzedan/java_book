package castle_extended_3_new;

public interface PriceCode {
    double calculateAmount(int daysRented);
    int calculateFrequentRenterPoints(int daysRented);
}