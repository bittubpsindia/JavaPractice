package ChallangeQuestions;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

           if ((a > b && a < c) || (a > c && a < b)) {
       System.out.println("Second largest = " + a);
}
        else if ((b > a && b < c) || (b > c && b < a)) {
        System.out.println("Second largest = " + b);
}
       else {
       System.out.println("Second largest = " + c);
}
    }
}
