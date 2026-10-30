package ChallangeQuestions;

import java.util.Scanner;

public class palindromeMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);


        }
        public static boolean isPalindrome(int num){
            int original = num;
            int newNum = 0;
            while (num > 0){
                int digit = num % 10;
                newNum = newNum * 10 + digit;
                num = num / 10;
            }

                if(original == newNum) {
                
                    System.out.println("Number is a palindrome: ");
                    return true;
                }
                
                else
                     {
                    System.out.println("not a palindrome");
                   return false;
                }
        }
    }


        
