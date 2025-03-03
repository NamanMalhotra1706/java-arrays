import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heights[] = new double[11];

        double sumOfHeights = 0;
        for(int i=0;i<heights.length;i++){
            System.out.println("Enter the player height: ");
            double playerHeight = sc.nextDouble();
            heights[i] = playerHeight;
            sumOfHeights+=heights[i];
        }

        System.out.println("Mean Height of football team: "+sumOfHeights/11);
    }
}
