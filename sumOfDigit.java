package ChallangeQuestions;

import java.util.Scanner;;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();
        int sum = printSumDigit(num);
        System.out.println("sum of the digit is :"+ sum);


    }
    public static int printSumDigit(int num ){
        int sum = 0;
        while (num > 0) {
        sum = sum + (num % 10);
            num = num / 10;
            
        }
        return sum;

    }
    
}
 