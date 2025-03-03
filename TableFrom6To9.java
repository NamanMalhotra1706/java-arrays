import java.util.Scanner;

class TableFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take input from the user
        int number;
        
        // Loop to ensure the user enters a number between 6 and 9
        while (true) {
            System.out.print("Enter the number: "); // Prompt the user to enter a number
            number = sc.nextInt(); // Read the number
            
            if (number >= 6 && number <= 9) { // Check if number is in range
                break; // Exit the loop if valid number
            } else {
                System.err.println("Please enter the number between 6 to 9"); // Show error message
                System.exit(0); // Exit the program if invalid input
            }
        }

        int table[] = new int[11]; // Initialize an array to store the multiplication table (0 to 10)

        // Fill the array with the multiplication results
        for (int i = 0; i <= 10; i++) {
            table[i] = i * number; // Calculate and store the product of 'number' and 'i'
        }
        
        // Print the multiplication table
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i]);
        }
    }
}
