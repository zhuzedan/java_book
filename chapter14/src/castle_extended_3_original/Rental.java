package castle_extended_3_original;

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
 
    public void setMovie(Book book) {
        this.book = book;
    }
 
    public int getDayRented() {
        return dayRented;
    }
 
    public void setDayRented(int dayRented) {
        this.dayRented = dayRented;
    }
}