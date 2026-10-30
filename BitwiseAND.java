package ChallangeQuestions;

import java.util.Scanner;


//bitwise AND  

public class BitwiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Showcasing Bitwise And Operator\n");
        System.out.println("Enter first Num");
        int firstNum = input.nextInt();
        System.out.println("Enter second num ");
        int secondNum = input.nextInt();


        int result = firstNum & secondNum ;
        System.out.println("Result is " +result);


    }
}
