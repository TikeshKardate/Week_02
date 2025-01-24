/*
Hierarchical Inheritance
Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.
*/

// Superclass
class BankAccount {

    // Account number and balance for the bank account
    int accountNumber;
    int balance;

    // Constructor to initialize the bank account with an account number and balance
    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// Subclass representing a savings account, inheriting from BankAccount
class SavingsAccount extends BankAccount {

    // Interest rate specific to the savings account
    double interestRate;

    // Constructor to initialize the savings account with specific details
    public SavingsAccount(int accountNumber, int balance, double interestRate) {
        super(accountNumber, balance); // Call to the constructor of the base class
        this.interestRate = interestRate;
    }

    // Method to display the details of the savings account
    public void displayAccountDetails() {
        System.out.println("Account Number is : " + accountNumber);
        System.out.println("Balance in this account is : " + balance);
        System.out.println("Interest Rate for this account is : " + interestRate);
    }
}

// Subclass representing a checking account, inheriting from BankAccount
class CheckingAccount extends BankAccount {

    // Withdrawal limit specific to the checking account
    int withdrawalLimit;

    // Constructor to initialize the checking account with specific details
    public CheckingAccount(int accountNumber, int balance, int withdrawalLimit) {
        super(accountNumber, balance); // Call to the constructor of the base class
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display the details of the checking account
    public void displayAccountDetails() {
        System.out.println("Account Number is : " + accountNumber);
        System.out.println("Balance in this account is : " + balance);
        System.out.println("Withdrawal Limit for this account is : " + withdrawalLimit);
    }
}

// Subclass representing a fixed deposit account, inheriting from BankAccount
class FixedDepositAccount extends BankAccount {
    // Tenure specific to the fixed deposit account
    int tenure;

    // Constructor to initialize the fixed deposit account with specific details
    public FixedDepositAccount(int accountNumber, int balance, int tenure) {
        super(accountNumber, balance); // Call to the constructor of the base class
        this.tenure = tenure;
    }

    // Method to display the details of the fixed deposit account
    public void displayAccountDetails() {
        System.out.println("Account Number is : " + accountNumber);
        System.out.println("Balance in this account is : " + balance);
        System.out.println("Tenure for this account is : " + tenure);
    }
}

// Main class to test the bank account system
public class BankAccountTypes{
    public static void main(String[] args) {
        // Creating instances of different account types
        SavingsAccount s = new SavingsAccount(11111, 500000, 8);
        CheckingAccount c = new CheckingAccount(22222, 600000, 1500);
        FixedDepositAccount f = new FixedDepositAccount(33333, 700000, 6);

        // Displaying the details of each account
        s.displayAccountDetails();
        System.out.println();
        c.displayAccountDetails();
        System.out.println();
        f.displayAccountDetails();
    }
}
