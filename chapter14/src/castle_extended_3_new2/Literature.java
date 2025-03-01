package castle_extended_3_new2;

class Literature extends Book {
    public Literature(String title) {
        super(title, 2);
    }

    @Override
    public double calculatePrice(int days) {
        double amount = 1.5;
        if (days > 3) {
            amount += (days - 3) * 1.5;
        }
        return amount;
    }

    @Override
    public int calculateFrequentRenterPoints(int days) {
        return 1;
    }
}
