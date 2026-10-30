package ChallangeQuestions;

import java.util.Scanner;

public class sumOfOddMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("oddSum till " + num + " is:  " + sum); 
    }
    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
       while (i <= num ){
        sum = sum + i;
        i = i+2;

       }
       return sum;

    }
    
}
