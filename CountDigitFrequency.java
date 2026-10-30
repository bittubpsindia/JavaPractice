import java.util.Scanner;

public class CountDigitFrequency{
    public static void main(String[] args) {
        int num = 122223332;
        int target  = 2;
        int targetCount = 0;

       while(num > 0){
          int  digit = num % 10;
          if (digit == target) {
            targetCount++;

          }
           num = num / 10;   
        }
        System.out.println("Taget count is: "+ targetCount);


       // Q1. Print squares

        
        for (int i = 1; i <=25; i++) {
            int sqrt = i * i;
            System.out.println(sqrt);
        }
        

        //Q2 — Count digits
    
        int n = 58392;
        int count = 0;

        while(n > 0){
          n = n / 10;
          count++;

        }
        System.out.println(count);

    

       // Q3 — PIN attempts

         
        Scanner input = new Scanner(System.in);
        int correctPin = 1234;
        int counter = 0;

        do{
           
            System.out.print("Enter the PIN: ");
             int Pin = input.nextInt();
             counter++;
            if (Pin == correctPin) {
                System.out.println("Login successfull");
                break;
            }else if(counter >= 3){
                System.out.println("Attempt was Over");
                break;     
            }else{
                System.out.println("Pin is wrong");
            }

        } while(counter <3);


//Q4
        Scanner sc = new Scanner(System.in);
        int nnum;
        int sum = 0;

        do{
            System.out.print("Enter a number: ");
            nnum = sc.nextInt();
            if (nnum != -1) {
            sum = sum + nnum;
            }
        }while (nnum != -1); 
            
        System.out.println("SUm is: "+ sum);
        sc.close();
    

    //   Q5. Find the largest number entered by the user.
       
    }
}