package ChallangeQuestions;

import java.util.Scanner;

public abstract class BitwiseOddEven {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter your number");
         int number = input.nextInt();
         
         if ((number & 1) ==1) {
            System.out.println("your num is odd");
         }
         else {
            System.out.println("your num is even");
         }
    }
}

/* 

4 = 0100
 0100 & 0001 = 0000
 0001
 0000 == 0001 nhi ha so its even
 */