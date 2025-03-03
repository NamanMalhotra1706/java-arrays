import java.util.Scanner;  // Import Scanner class for user input

public class NumberStatus {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner sc  = new Scanner(System.in);

        // Create an array to hold 5 numbers
        int[] numbers = new int[5];

        // Loop to get 5 numbers from the user
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter the number: ");
            numbers[i] = sc.nextInt();  // Store the entered number in the array
        }

        // Loop through each number in the array and determine its status
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {  // Check if the number is positive
                System.out.println("Number " + numbers[i] + " is positive");
                if(numbers[i] % 2 == 0) {  // Check if the number is even
                    System.out.println("Number is Even");
                } else {  // If it's not even, it must be odd
                    System.out.println("Number is Odd");
                }
            }
            else if(numbers[i] < 0) {  // Check if the number is negative
                System.out.println("Number " + numbers[i] + " is negative");
            }
            else {  // If the number is neither positive nor negative, it's zero
                System.out.println("Number " + numbers[i] + " is zero");
            }
        }

        // Check if the first number is equal to the last number in the array
        if(numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("Both first and last number is equal");
        }
        else {  // Otherwise, print which number is greater
            System.out.println(Math.max(numbers[0], numbers[numbers.length - 1]) + " is greater");
        }
    }
}
