import java.util.Scanner;

public class NumberStatus {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i=0;i<5;i++){
            System.out.print("Enter the number: ");
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                System.out.println("Number " + numbers[i] + " is positive");
                if(numbers[i]%2==0){
                    System.out.println("Number is Even");
                }
                else{
                    System.out.println("Number is Odd");
                }
            }
            else if(numbers[i]<0){
                System.out.println("Number " + numbers[i] + " is negative");
            }
            else{
                System.out.println("Number " + numbers[i] + " is zero");
            }  
        }

        if(numbers[0] == numbers[numbers.length-1]){
            System.out.println("Both first and last number is equal");
        }
        else{
            System.out.println(Math.max(numbers[0],numbers[numbers.length-1])+" is greater");
        }
    }
}
