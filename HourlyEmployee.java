// HourlyEmployee class that extends Employee
public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    // Constructor
    public HourlyEmployee(String firstName, String lastName, double hourlyWage, double hoursWorked) {
        super(firstName, lastName);
        if (hourlyWage < 0 || hoursWorked < 0) {
            throw new IllegalArgumentException("Hourly wage and hours worked cannot be negative");
        }
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Getters and Setters
    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage < 0) {
            throw new IllegalArgumentException("Hourly wage cannot be negative");
        }
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative");
        }
        this.hoursWorked = hoursWorked;
    }

    // Override the salary method to calculate salary based on hourly wage and hours worked
    @Override
    public double salary() {
        return hourlyWage * hoursWorked;
    }
}
