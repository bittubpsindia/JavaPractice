package practiceQuestions;

import java.util.Scanner; 

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first number");
        int num = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        int GCD = GCD(num, num2);
        System.out.println(GCD);
        }
    public static int GCD(int num, int num2){
        while (num2 != 0) {
            int remain = num % num2;
            num = num2;
            num2 = remain;
    }
      return num;
    }
}

