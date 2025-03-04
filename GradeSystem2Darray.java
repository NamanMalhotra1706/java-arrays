import java.util.Scanner;

public class GradeSystem2Darray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the number of students
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        // 2D array to store marks for Physics, Chemistry, and Maths for each student
        double marks[][] = new double[students][3]; 
        double percentage[] = new double[students];
        String grades[] = new String[students];

        // Loop to collect marks for each student
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for student " + (i + 1));

            // Marks in Physics
            System.out.print("Marks in Physics: ");
            marks[i][0] = sc.nextDouble();
            if (marks[i][0] < 0) {
                System.out.println("Marks cannot be negative, enter the marks again.");
                i--; // Decrement i 
            }

            // Marks in Chemistry
            System.out.print("Marks in Chemistry: ");
            marks[i][1] = sc.nextDouble();
            if (marks[i][1] < 0) {
                System.out.println("Marks cannot be negative, enter the marks again.");
                i--; // Decrement i 
            }

            // Marks in Maths
            System.out.print("Marks in Maths: ");
            marks[i][2] = sc.nextDouble();
            if (marks[i][2] < 0) {
                System.out.println("Marks cannot be negative, enter the marks again.");
                i--; // Decrement i 
            }

            // Calculate the percentage for the student
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (totalMarks * 100) / 300;
        }

        // Determine grades based on percentage
        for (int i = 0; i < students; i++) {
            if (percentage[i] >= 80) {
                grades[i] = "Level 4, above agency-normalized standards";
            } else if (percentage[i] >= 70) {
                grades[i] = "Level 3, at agency-normalized standards";
            } else if (percentage[i] >= 60) {
                grades[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage[i] >= 50) {
                grades[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage[i] >= 40) {
                grades[i] = "Level 1, too below agency-normalized standards";
            } else {
                grades[i] = "Remedial standards";
            }
        }

        // Display the percentage and grade for each student
        for (int i = 0; i < students; i++) {
            System.out.println("Percentage of student " + (i + 1) + " is: " + percentage[i] + "% having grade: " + grades[i]);
        }
    }
}
