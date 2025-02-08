package castle_extended_3_original;

import java.util.ArrayList;
import java.util.Iterator;

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
        Iterator<Rental> rentalIterator = rentals.iterator();
        String result = "Rental Records for " + getName() + "\n";

        while (rentalIterator.hasNext()) {
            double thisAmount = 0;
            Rental each = rentalIterator.next();

            // determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Book.NOVEL:
                    thisAmount += 2;
                    if (each.getDayRented() > 2) {
                        thisAmount += (each.getDayRented() - 2) * 1.5;
                    }
                    break;
                case Book.COMPUTER:
                    thisAmount += each.getDayRented() * 3;
                    break;
                case Book.LITERATURE:
                    thisAmount += 1.5;
                    if (each.getDayRented() > 3) {
                        thisAmount += (each.getDayRented() - 3) * 1.5;
                    }
                    break;
            }

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for two day new release rental
            if ((each.getMovie().getPriceCode() == Book.COMPUTER) && each.getDayRented() > 1) {
                frequentRenterPoints++;
            }

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }
}