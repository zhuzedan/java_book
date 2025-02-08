package castle_extended_3_original;

class Book {
 
    public static final int NOVEL = 0;
    public static final int COMPUTER = 1;
    public static final int LITERATURE = 2;
 
    private String title;
    private int priceCode;
 
    public Book(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public int getPriceCode() {
        return priceCode;
    }
 
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}