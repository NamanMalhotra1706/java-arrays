import java.util.Scanner;

public class TwoDTo1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of coloums: ");
        int cols = sc.nextInt();

        int [][] twoDArray = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the " + i + ", " + j + " ele: ");
                twoDArray[i][j]= sc.nextInt();
            }
        }

        int oneDArray[] = new int[rows*cols];

        int oneDIx = 0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                oneDArray[oneDIx++] = twoDArray[i][j];
            }
        }

        for(int i=0;i<oneDArray.length;i++){
            System.out.println("Element in " + i + " index is: " + oneDArray[i]);
        }
    }
}
