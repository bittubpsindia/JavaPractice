package ChallangeQuestions;

import java.util.Scanner;

public class Challange1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("Area Of Circle Calculator");  
        System.out.print("Enter the Radius");
        double Radius = input.nextDouble();
        double area = Math.PI * Radius * Radius;
        
        System.out.println("Area of Circle is : "+ area );
     
    }
    
}
