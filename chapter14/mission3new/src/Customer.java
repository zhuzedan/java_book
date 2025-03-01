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