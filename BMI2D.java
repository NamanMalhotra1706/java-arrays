import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Ask for the number of people
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[numberOfPersons][3];
        // Create an array to store weight status of each person
        String[] weightStatus = new String[numberOfPersons];

        // Loop to collect data and calculate BMI for each person
        for (int i = 0; i < numberOfPersons; i++) {
            double weight = -1;
            double height = -1;

            // Input and validate weight
            while (weight <= 0) {
                System.out.print("Enter the weight (kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            }

            // Input and validate height
            while (height <= 0) {
                System.out.print("Enter the height (cm) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            }

            // Convert height from cm to meters
            double heightInMeters = height / 100;
            personData[i][0] = weight;  // Store weight
            personData[i][1] = heightInMeters;  // Store height in meters

            // Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;  // Store BMI

            // Determine weight status based on BMI value
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " m, Weight: " + personData[i][0] + " kg, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}
