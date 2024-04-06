public class CustomerDetails { private double billAmount;

// Constructor to initialize billAmount
public CustomerDetails(double billAmount) {
    this.billAmount = billAmount;
}

// Method to calculate bonus points
public double calculateBonusPoints() {
    if (billAmount >= 350) {
        return billAmount / 10;
    } else {
        return 0;
    }
}

// Main method for testing
public static void main(String[] args) {
    // Example usage
    double billAmount = 580;
    CustomerDetails customer = new CustomerDetails(billAmount);
    double bonusPoints = customer.calculateBonusPoints();
    System.out.println("Bonus Points: " + bonusPoints);
}
}
