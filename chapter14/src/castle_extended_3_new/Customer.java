package castle_extended_3_new;

import java.util.ArrayList;

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
            double thisAmount = calculateAmountForRental(rental);
            totalAmount += thisAmount;
            frequentRenterPoints += calculateFrequentRenterPointsForRental(rental);

            result += "\t" + rental.getBook().getTitle() + "\t" + thisAmount + "\n";
        }

        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

    private double calculateAmountForRental(Rental rental) {
        double thisAmount = 0;
        int priceCode = rental.getBook().getPriceCode();
        int daysRented = rental.getDayRented();

        switch (priceCode) {
            case Book.NOVEL:
                thisAmount += 2;
                if (daysRented > 2) {
                    thisAmount += (daysRented - 2) * 1.5;
                }
                break;
            case Book.COMPUTER:
                thisAmount += daysRented * 3;
                break;
            case Book.LITERATURE:
                thisAmount += 1.5;
                if (daysRented > 3) {
                    thisAmount += (daysRented - 3) * 1.5;
                }
                break;
        }
        return thisAmount;
    }

    private int calculateFrequentRenterPointsForRental(Rental rental) {
        int points = 1;
        if ((rental.getBook().getPriceCode() == Book.COMPUTER) && rental.getDayRented() > 1) {
            points++;
        }
        return points;
    }
}
