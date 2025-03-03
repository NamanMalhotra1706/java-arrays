import java.util.Scanner;

public class FriendsAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read user input
        
        int ages[] = new int[3]; // Array to store ages of friends
        int heights[] = new int[3]; // Array to store heights of friends
        String[] names = {"Amar", "Akbar", "Anthony"}; // Array to store names of friends
        
        int minAge = Integer.MAX_VALUE; // Initialize minAge to the largest possible integer
        int maxAge = Integer.MIN_VALUE; // Initialize maxAge to the smallest possible integer
        int minIx = 0; // Index of the youngest friend
        int maxIx = 0; // Index of the oldest friend
        
        // Loop to take input for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the Age: ");
            int age = sc.nextInt(); // Read age input
            System.out.print("Enter the Height: ");
            int height = sc.nextInt(); // Read height input
            
            ages[i] = age; // Store age in the array
            heights[i] = height; // Store height in the array
            
            // Check for the youngest friend
            if (minAge > ages[i]) {
                minIx = i;
                minAge = ages[i];
            }
            
            // Check for the oldest friend
            if (maxAge < ages[i]) {
                maxIx = i;
                maxAge = ages[i];
            }
        }
        
        // Print results
        System.out.println("Tallest friend is : " + names[maxIx]);
        System.out.println("Youngest friend is : " + names[minIx]);
    }
}
