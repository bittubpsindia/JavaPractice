package practiceQuestions;

import java.util.Scanner;



public class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
        int Number = input.nextInt();

        if((Number & 1)==1){
            System.out.println("Number is Odd"+Number);
        }
        else{
            System.out.println("Number is even:" + Number);
        }
    }
}
