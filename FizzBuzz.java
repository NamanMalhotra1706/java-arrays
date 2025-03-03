import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        int number;
    
        // Input validation loop
        while (true) {
            System.out.print("Enter the number: "); 
            number = sc.nextInt(); 
            
            if (number <= 0) {
                System.err.println("Number must be positive"); // Error message for invalid input
            } else {
                break; // Break loop if valid number
            }
        }

        String[] result = new String[number + 1]; // Array to store FizzBuzz results

        // Populate the result array with FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result[i] = "FizzBuzz"; // Multiple of both 3 and 5
            } else if (i % 3 == 0) {
                result[i] = "Fizz"; // Multiple of 3
            } else if (i % 5 == 0) {
                result[i] = "Buzz"; // Multiple of 5
            } else {
                result[i] = String.valueOf(i); // Non-multiple, store the number as a string
            }
        }

        // Print the results
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
