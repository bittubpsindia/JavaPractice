package ChallangeQuestions;

import java.util.Scanner;

public class armstrongMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your num is a armstropng number: " + isArmstrong);
        }
        else{
            System.out.println("Your number is not a Armstrong Number: ");
        }
    }
    public static boolean isArmstrong(int num){

        int noOfDigit = noOfDigit(num);
        int numCopy = num;
        System.out.println("No of digit: " + noOfDigit);
        int finalNumber = 0;
        int digit = noOfDigit(num);
        while (num > 0) {
            int lastDigit = num % 10;
            num /=10;
            finalNumber += pow(lastDigit, noOfDigit);
            
        }
        System.out.println("final number is: "+finalNumber);
        return finalNumber ==numCopy;

    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while (i < num2) {
            result = result*num1;
            i++;
            
    }
        System.out.println("pow of "+ num1 + "is" +result);

        return result;

    }

    public static int noOfDigit(int num){
        int digit = 0;
        while(num > 0){
            digit++;
            num /=10;
        }
        return digit;
    }
}
