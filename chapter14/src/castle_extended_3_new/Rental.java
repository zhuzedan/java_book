package castle_extended_3_new;

public class Rental {
 
    private Book book;
    private int dayRented;
 
    public Rental(Book book, int dayRented) {
        this.book = book;
        this.dayRented = dayRented;
    }
 
    public Book getBook() {
        return book;
    }
 
    public void setBook(Book book) {
        this.book = book;
    }
 
    public int getDayRented() {
        return dayRented;
    }
 
    public void setDayRented(int dayRented) {
        this.dayRented = dayRented;
    }
}