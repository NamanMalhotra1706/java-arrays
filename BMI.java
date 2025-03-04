import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Ask for the number of people
        System.out.print("Enter the number of person: ");
        int person = sc.nextInt();

        // Create arrays to store weight, height, BMI, and weight status for each person
        double weights[] = new double[person];
        double heights[] = new double[person];
        double bmis[] = new double[person];
        String[] weightStatus = new String[person];

        // Loop to collect data and calculate BMI for each person
        for(int i = 0; i < person; i++){
            System.out.print("Enter the weight (kg): ");
            double weight = sc.nextDouble();
            weights[i] = weight;

            System.out.print("Enter the height (cm): ");
            double height = sc.nextDouble();
            double cmToM = height / 100; // Convert height from cm to meters
            heights[i] = cmToM;

            // Calculate BMI
            double bmi = weight / (cmToM * cmToM);
            bmis[i] = bmi;

            // Determine weight status based on BMI value
            if(bmi <= 18.4){
                weightStatus[i] = "Underweight";
            }
            else if(bmi <= 24.9 && bmi >= 18.5){
                weightStatus[i] = "Normal";
            }
            else if(bmi >= 25.0 && bmi <= 39.9){
                weightStatus[i] = "Overweight";
            }
            else if(bmi >= 40.0){
                weightStatus[i] = "Obese";
            }
        }

        // Display the results for each person
        for(int i = 0; i < person; i++){
            System.out.println("Height, weight, BMI & BMI Status of person " + (i + 1) + " is: " + heights[i] + "m, " + weights[i] + "kg, " + bmis[i] + ", " + weightStatus[i]);
        }
    }
}
