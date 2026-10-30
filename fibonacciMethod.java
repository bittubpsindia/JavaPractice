package ChallangeQuestions;

import java.util.Scanner;

public class fibonacciMethod {
    public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
      System.out.print("Enter a number"); 
      int first = input.nextInt(); 
      System.out.println("Here is the fibo number");
      printFibo(first);
    }
    public static void printFibo(int num){
        if (num < 0) return;
        System.out.println("0 ");
        if(num==0)return;
        System.out.println("1 ");
            

        int first = 0, second = 1;
        while (first + second  <=num) {
            int third = first + second;
            System.out.println(third +" ");
            first = second;
            second = third;


            
        }

    }
}
