package castle_extended_3_new2;

class Rental {
    private Book book;
    private int dayRented;

    public Rental(Book book, int dayRented) {
        this.book = book;
        this.dayRented = dayRented;
    }

    public Book getMovie() {
        return book;
    }

    public int getDayRented() {
        return dayRented;
    }

    public double calculatePrice() {
        return book.calculatePrice(dayRented);
    }

    public int calculateFrequentRenterPoints() {
        return book.calculateFrequentRenterPoints(dayRented);
    }
}
