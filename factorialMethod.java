package ChallangeQuestions;

import java.util.Scanner;

public class factorialMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number  :");
        int num = input.nextInt();
        long fact = printFactorial(num);
        System.out.print("factorial of " + num + "is:  " +fact);

    }
    public static long printFactorial(int num){
        if (num < 2){
            return 1;

        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact =fact * i;
            i++;
        }
       return fact;
 
    }
}
