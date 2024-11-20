// CommissionedEmployee class that extends Employee
public class CommissionedEmployee extends Employee {
    private double totalSales;
    private double commissionRate;  // Percentage of total sales

    // Constructor
    public CommissionedEmployee(String firstName, String lastName, double totalSales, double commissionRate) {
        super(firstName, lastName);
        if (totalSales < 0 || commissionRate < 0 || commissionRate > 1) {
            throw new IllegalArgumentException("Invalid sales or commission rate");
        }
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    // Getters and Setters
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        if (totalSales < 0) {
            throw new IllegalArgumentException("Sales cannot be negative");
        }
        this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0 || commissionRate > 1) {
            throw new IllegalArgumentException("Commission rate must be between 0 and 1");
        }
        this.commissionRate = commissionRate;
    }

    // Override the salary method to calculate commission-based salary
    @Override
    public double salary() {
        return totalSales * commissionRate;
    }
}
