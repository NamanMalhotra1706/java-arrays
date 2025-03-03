import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take input from the user
        
        System.out.println("Enter the number: ");
        int number = sc.nextInt(); 

        int[] odd = new int[(number / 2) + 1]; // Array to store odd numbers
        int[] even = new int[(number / 2) + 1]; // Array to store even numbers

        int evenCount = 0; // Counter for even numbers
        int oddCount = 0; // Counter for odd numbers

        // Loop to separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenCount++] = i; // Store even number and increment even counter
            } else {
                odd[oddCount++] = i; // Store odd number and increment odd counter
            }
        }

        // Print odd numbers
        System.out.println("Odd Array: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.println(odd[i]);
        }

        // Print even numbers
        System.out.println("Even Array: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.println(even[i]);
        }
    }
}
