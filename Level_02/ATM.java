/*
Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to
 modify and view the account's state.*/

import java.util.Scanner;

 class BankAccount{
    String accountHolder; 
    String accountNumber; 
    double balance;

    //Constructor to store details of account holder 
    BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder; 
        this.accountNumber = accountNumber;
        this.balance = balance;
    } 

    //To check the total balance in account
   void fetchBalance(){
        System.out.println("Available Balance is:  "+balance);
       // return balance;
    } 
    //Method to withdraw amount
    void withDrawAmount(double amount){
        if(amount<= balance){
            System.out.println("Amount "+ amount +" withdraw sucessfull ");
            balance-=amount;
            fetchBalance();
        } 
        else{
            System.out.println("Insufficient Balance");
        }
    }


    //Display Details  
    void display(){
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

 } 

public class ATM { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Object
        BankAccount account = new BankAccount("Tikesh Kardate", "1201437", 5000000); 

        //Display the account details
        account.display();
        //Display the total account balance
        account.fetchBalance();
        System.out.print("Enter amount you want to withdraw: ");
        double amount = sc.nextDouble(); 
        //Fetching the amount from account
        account.withDrawAmount(amount);
  
    }

}