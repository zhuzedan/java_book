package castle_extended_3_new;

import java.util.ArrayList;

public class Customer {
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
        String result = "租借给" + getName() + "\n";

        for (Rental rental : rentals) {
            double thisAmount = rental.getBook().getPriceCode().calculateAmount(rental.getDayRented());
            totalAmount += thisAmount;
            frequentRenterPoints += rental.getBook().getPriceCode().calculateFrequentRenterPoints(rental.getDayRented());

            result += "\t" + rental.getBook().getTitle() + "\t" + thisAmount + "\n";
        }

        result += "租借费用为 " + totalAmount + "\n";
        result += "你赢得了 " + frequentRenterPoints + " 积分s";
        return result;
    }

}