import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take input from the user

        int numbers[] = new int[10]; // Initialize an array to store up to 10 numbers

        int cnt = 0; // Counter to keep track of the number of valid inputs
        System.out.println("To end the input enter 0 or any negative integer."); // Inform the user how to end input
        
        // Loop to take user input
        while(cnt < numbers.length){
            System.out.print("Enter the number: "); // Prompt the user to enter a number
            int number  = sc.nextInt(); // Read the number

            if(number <= 0){ // Check if the number is zero or negative
                break; // Exit the loop if the number is zero or negative
            }
            numbers[cnt++] = number; // Store the number in the array and increment the counter
        }

        int sumOfNumbers = 0; // Variable to store the sum of the numbers
        
        // Calculate the sum of entered numbers
        for(int i = 0; i < cnt; i++){
            sumOfNumbers += numbers[i];
        }

        System.out.println("Sum of Numbers are: " + sumOfNumbers); // Print the sum of the numbers
    }
}
