class Novel extends Book {
    public Novel(String title) {
        super(title, 0);
    }

    @Override
    public double calculatePrice(int days) {
        double amount = 2;
        if (days > 2) {
            amount += (days - 2) * 1.5;
        }
        return amount;
    }

    @Override
    public int calculateFrequentRenterPoints(int days) {
        return 1;
    }
}
