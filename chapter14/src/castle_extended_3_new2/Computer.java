package castle_extended_3_new2;

class Computer extends Book {
    public Computer(String title) {
        super(title, 1);
    }

    @Override
    public double calculatePrice(int days) {
        return days * 3;
    }

    @Override
    public int calculateFrequentRenterPoints(int days) {
        return days > 1 ? 2 : 1;
    }
}