import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        double totalSalary = 0; // Variable to store the total old salary
        double bonus = 0; // Variable to store the total bonus
        double newTotalSalary = 0; // Variable to store the total new salary

        double oldSalaries[] = new double[10]; // Array to store old salaries
        double newSalaries[] = new double[10]; // Array to store new salaries after adding bonus
        double bonuses[] = new double[10]; // Array to store individual bonuses
        
        // Collect employee salary and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your salary: ");
            double salary = sc.nextDouble();

            System.out.println("Enter the year of services: ");
            int year = sc.nextInt();

            if (salary < 0 || year < 0) {
                System.out.println("Enter a valid positive salary and year of service.");
                i--; // Decrement the index to re-enter valid data
                continue;
            }

            double bns = 0;
            // Calculate bonus based on years of service
            if (year >= 5) {
                bns = salary / 100.0 * 5.0; // 5% bonus for service >= 5 years
            } else {
                bns = salary / 100.0 * 2.0; // 2% bonus for service < 5 years
            }

            oldSalaries[i] = salary; // Store old salary
            bonuses[i] = bns; // Store calculated bonus
            newSalaries[i] = salary + bns; // Store new salary after adding bonus
        }

        // Calculate total old salary, total bonus, and total new salary
        for (int i = 0; i < 10; i++) {
            totalSalary += oldSalaries[i];
            bonus += bonuses[i];
            newTotalSalary += newSalaries[i];
        }

        // Print the results
        System.out.println("Total old salary: " + totalSalary);
        System.out.println("Total bonus: " + bonus);
        System.out.println("Total new salary: " + newTotalSalary);
    }
}