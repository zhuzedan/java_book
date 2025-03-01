abstract class Book {
    protected String title;
    protected int priceCode;

    public Book(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public abstract double calculatePrice(int days);
    public abstract int calculateFrequentRenterPoints(int days);
}
