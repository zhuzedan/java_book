package castle_extended_3_new2;

import java.util.ArrayList;

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

class Customer {
    private String name;
    private ArrayList<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Records for " + getName() + "\n";

        for (Rental rental : rentals) {
            double thisAmount = rental.calculatePrice();
            totalAmount += thisAmount;
            frequentRenterPoints += rental.calculateFrequentRenterPoints();

            result += "\t" + rental.getMovie().getTitle() + "\t" + thisAmount + "\n";
        }

        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建书籍
        Book book1 = new Novel("科学引文索引");
        Book book2 = new Literature("百年孤独");
        Book book3 = new Novel("哈利·波特与魔法石");

        // 创建客户
        Customer customer = new Customer("张三");

        // 创建租赁记录
        Rental rental1 = new Rental(book1, 3); // 租借3天
        Rental rental2 = new Rental(book2, 6); // 租借6天
        Rental rental3 = new Rental(book3, 4); // 租借4天

        // 将租赁记录添加到客户
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // 生成账单声明
        String statement = customer.statement();
        System.out.println(statement);
    }
}
