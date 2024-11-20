public class Main {
    public static void main(String[] args) {
        try {
            // Create a Commissioned Employee
            CommissionedEmployee commissionedEmployee = new CommissionedEmployee("John", "Doe", 50000, 0.1);
            System.out.println(commissionedEmployee.getFirstName() + " " + commissionedEmployee.getLastName() + "'s salary: $" + commissionedEmployee.salary());

            // Create an Hourly Employee
            HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", "Smith", 20, 160);
            System.out.println(hourlyEmployee.getFirstName() + " " + hourlyEmployee.getLastName() + "'s salary: $" + hourlyEmployee.salary());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
