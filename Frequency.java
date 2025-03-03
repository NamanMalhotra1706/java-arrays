import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read user input
        
        System.out.print("Enter the number: ");
        int number = sc.nextInt(); 
        
        int freq[] = new int[10]; // Array to store the frequency of each digit (0-9)
        
        // Loop to calculate the frequency of each digit
        while (number > 0) {
            int rem = number % 10; // Get the last digit
            freq[rem] += 1; // Increment the frequency count of the digit
            number /= 10; // Remove the last digit from the number
        }
        
        // Print the frequency of each digit
        for (int i = 0; i < freq.length; i++) {
            System.out.println("Frequency of " + i + " is: " + freq[i]);
        }
    }
}