package ChallangeQuestions;

import java.util.Scanner;

public class squareMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number :");
        int num = input.nextInt();
        System.out.print("Sqaure is " + printSquare(num));

    }
    public static int printSquare(int n){
        return n*n;

    }
}
