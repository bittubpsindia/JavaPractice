package JavaProjects;

import java.util.Scanner;


import java.util.ArrayList;

public class atmSimulationUsingMethods {

  //Method for check Balance   

    static void checkBalance(double balance){
        System.out.println("The Account Balance is: " + balance);
    }
 //method for deposit amount

    static double deposit(double balance, double amount, ArrayList<String> transactions){
        if (amount > 0) {
           balance = balance + amount;

           transactions.add("Deposit: +₹" + amount);

           System.out.println("Deposit Successfull");
        }
        else {
             System.out.println("Invalid deposit amount! ");
        }
        return balance;
    }
 //method for withdraw amount

    static double withdraw (double balance, double amount, ArrayList<String> transactions){
    if (amount <= 0) {
        System.out.println("Invalid amount!");
    } else if (amount > balance) {
        System.out.println("Insufficient balance!");
    } else {
        balance = balance - amount;
        transactions.add("Withdraw: -₹" + amount);
        System.out.println("Withdrawal successful!");
    }

    return balance;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 50000;
        ArrayList<String> transactions = new ArrayList<>();
        int choice;
        
   do{

        System.out.println("  Menu ");
        System.out.println("1 -> Balance Check ");
        System.out.println("2 -> Deposit Money ");
        System.out.println("3 ->Withdraw Money");
        System.out.println("4 -> Mini Statement");
        System.out.println("5 -> Exit");
        System.out.print("Select the Choice: ");

          choice = input.nextInt();


    switch(choice) {

        case 1 : //balance check    
                    checkBalance(balance);
                break;

        case 2 : // Deposit Money

            System.out.print("Enter amount to deposit: ");
             double amount = input.nextDouble();
            balance = deposit(balance, amount, transactions);

            System.out.println("updated balance is : "+ balance);
            break;

        case 3 : // Withdraw Money

            System.out.println("Enter amount to withdraw");

            double WithdrawAmount = input.nextDouble();

            balance = withdraw(balance, WithdrawAmount,transactions);
            
            System.out.println("Updated balance is : " + balance);
            break;

        case 4: //Mini Statement
            System.out.println("\n--- MINI STATEMENT---");

            if (transactions.isEmpty()) {
                System.out.println("No transaction yet");  
            }else {
                for(String transaction : transactions){
                    System.out.println(transaction);
                }
            }

            System.out.println("Total transactions: "+ transactions.size());

            checkBalance(balance);
            break;

        case 5 : 
              System.out.println("Thank you for using ATM!");
            break;
        default :
        System.out.println("Invalid choice");
      }
    }
    while (choice != 5);
        
        input.close();
    }
}