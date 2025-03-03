import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int maxDigit = 10;

        int digits[] = new int[maxDigit];
        
        int firstMax = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        int ix = 0;
        while(number>0){
            int rem = number%10;
            digits[ix++] = rem;
            number/=10;
        }

        
        for(int i=0;i<ix;i++){
            if(firstMax<digits[i]){
                firstMax = digits[i];
            }
        }
        for(int i=0;i<ix;i++){
            if(secMax< digits[i] && firstMax!=digits[i]){
                secMax = digits[i];
            }
        }
        System.out.println("First Max: " + firstMax);
        System.out.println("Second Max: " + secMax);
    }
}
