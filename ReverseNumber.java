import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int maxDigit = 10;

        int digits[] = new int[maxDigit];

        int ix = 0;
        while(number>0){
            int rem = number%10;
            digits[ix++] = rem;
            number/=10;
        }

        for(int i=0;i<ix;i++){
            System.out.print(digits[i]);
        }
    }
}