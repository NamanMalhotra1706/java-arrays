import java.util.Scanner;

class ValidVoter {
    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        // Initialize an array to store the ages of 10 students
        int[] students = new int[10];

        // Loop through to input ages for 10 students
        for (int i = 1; i <= 10; i++) {
            // Prompt the user to enter the age for each student
            System.out.print("Enter the Student " + i + " age: ");
            int age = sc.nextInt();

            // Check if the entered age is invalid (less than or equal to 0)
            if (age <= 0) {
                // If invalid age is entered, print an error message and terminate the program
                System.err.println("Invalid age");
                System.exit(0);
            }

            // Store the valid age in the students array
            students[i - 1] = age;
        }

        // Loop through the students array to check if each student can vote
        for (int i = 0; i < 10; i++) {
            // If the student's age is 18 or above, they can vote
            if (students[i] >= 18) {
                System.out.println("Student with age " + students[i] + " can vote.");
            } else {
                // If the student's age is below 18, they cannot vote
                System.out.println("Student with age " + students[i] + " cannot vote.");
            }
        }
    }
}
