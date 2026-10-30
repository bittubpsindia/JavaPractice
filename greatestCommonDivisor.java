package ChallangeQuestions;

import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number");
        int first = input.nextInt();
        System.out.print("Enter second num");
        int second = input.nextInt();
        int printGCD = printGCD(first, second);
        System.out.println("GCD of the number is: " +printGCD);

    }
    public static int printGCD(int num1, int num2){
        int GCD = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least){
            if (num1 % i==0 && num2 % i ==0) {
                GCD = i;
            }
            i++;
        }
        return GCD;
    }

    public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;

        }
        else {
            return num2;

        }
    }
    
}
