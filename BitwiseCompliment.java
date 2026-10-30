package ChallangeQuestions;

import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Showcasing NOT/Compliment Operator \n");
        System.out.println("Enter your num");
        int Num = input.nextInt();

        int result = ~ Num;
        System.out.println("Result is " + result);
    }
}
