package ChallangeQuestions;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        boolean printIsPrime = printIsPrime(num);
            if(printIsPrime){
                System.out.println("your number is prime");
            }else{
                System.out.println("your number is not prime");
            }

    }
    public static boolean printIsPrime(int num){
       
        int i = 2;
        while (i < num){
            if (num%i==0)
            {
                return false;

            }
            i++;
        }
        return true;

        
    }
    
}
