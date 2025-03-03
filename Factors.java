import java.util.*;

class Factors {
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
        
        int maxFactors = 10; 
        int factors[] = new int[maxFactors]; // Array to store factors
        int idx = 0; // Index to keep track of the number of factors

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (idx == maxFactors) { 
                    maxFactors *= 2; // Double the size of maxFactors
                    int temp[] = new int[maxFactors]; // Temporary array with new size
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy old factors to new array
                    factors = temp; // Point factors to the new array
                }
                factors[idx++] = i; // Store the factor and increment index
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < idx; i++) {
            System.out.println(factors[i]);
        }
    }
}
