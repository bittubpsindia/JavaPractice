package ChallangeQuestions;

import java.util.Scanner;
public class BitwiseXOR {
   

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Showcasing Bitwise XOR \n");
        System.out.println("Enter first num");
        int firstNum = input.nextInt();
        System.out.println("Enter Second num");
        int secondNum = input.nextInt();

        int result = firstNum ^ secondNum ;
        System.out.println("Result is " + result);
    }
}
