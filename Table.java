import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take input from the user
        System.out.println("Enter the number: "); 
        int number = sc.nextInt(); // Read the number entered by the user

        int table[] = new int[11]; // Initialize an array to store the multiplication table (0 to 10)

        // Fill the array with the multiplication results
        for(int i = 0; i <= 10; i++) {
            table[i] = i * number; // Calculate and store the product of 'number' and 'i'
        }

        // Print the multiplication table
        for(int i = 0; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i]);
        }
    }
}
