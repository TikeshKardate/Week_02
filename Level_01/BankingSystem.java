/*
4. Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.
*/


// Interface with methods for loan operations
interface Loanable {
    public void applyForLoan();
    public void calculateLoanEligibility();
}

// Abstract class representing a bank account, implementing Loanable
abstract class BankAccount implements Loanable {
    private int accountNumber; // Account number of the bank account
    private String holderName; // Name of the account holder
    private double balance; // Current balance of the bank account
    private double interest; // Interest earned on the bank account

    // Constructor to initialize accountNumber, holderName, and balance
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Method to deposit amount into the bank account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw amount from the bank account
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Setter for interest field
    public void setInterest(double interest) {
        this.interest = interest;
    }

    // Getter for balance field
    public double getBalance() {
        return balance;
    }

    // Abstract method to calculate interest, to be implemented by subclasses
    public abstract void calculateInterest();

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + holderName);
        System.out.println("Account Balance: " + balance);
        System.out.println("Account Interest: " + interest);
    }
}

// Subclass representing a savings account
class SavingsAccount extends BankAccount implements Loanable {
    private double interest; // Interest specific to savings account

    // Constructor to initialize accountNumber, holderName, and balance
    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance); // Call the parent class constructor
    }

    // Implementation of abstract method from BankAccount class to calculate interest
    public void calculateInterest() {
        interest = getBalance() * 0.05; // Calculate interest at 5%
        setInterest(interest); // Set the calculated interest
    }

    // Method to apply for a loan
    public void applyForLoan() {
        System.out.println("You can apply for a loan.");
    }

    // Method to calculate loan eligibility
    public void calculateLoanEligibility() {
        System.out.println("You are eligible for a loan.");
    }
}

// Subclass representing a current account
class CurrentAccount extends BankAccount implements Loanable {
    private double interest; // Interest specific to current account

    // Constructor to initialize accountNumber, holderName, and balance
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance); // Call the parent class constructor
    }

    // Implementation of abstract method from BankAccount class to calculate interest
    public void calculateInterest() {
        interest = getBalance() * 0.02; // Calculate interest at 2%
        setInterest(interest); // Set the calculated interest
    }

    // Method to apply for a loan
    public void applyForLoan() {
        System.out.println("You can apply for a loan.");
    }

    // Method to calculate loan eligibility
    public void calculateLoanEligibility() {
        System.out.println("You are eligible for a loan.");
    }
}

// Main class to test the banking system
public class BankingSystem {
    public static void main(String[] args) {
        // Creating and initializing a SavingsAccount
        SavingsAccount sa = new SavingsAccount(1111, "Tikesh", 200000);
        sa.deposit(10000); // Deposit amount into savings account
        sa.withdraw(5000); // Withdraw amount from savings account
        sa.calculateInterest(); // Calculate interest for savings account
        sa.displayDetails(); // Display savings account details
        sa.applyForLoan(); // Apply for loan
        sa.calculateLoanEligibility(); // Calculate loan eligibility

        System.out.println(); // Print an empty line for better readability

        // Creating and initializing a CurrentAccount
        CurrentAccount ca = new CurrentAccount(22222, "Abhay", 500000);
        ca.deposit(2000); // Deposit amount into current account
        ca.withdraw(50000); // Withdraw amount from current account
        ca.calculateInterest(); // Calculate interest for current account
        ca.displayDetails(); // Display current account details
        ca.applyForLoan(); // Apply for loan
        ca.calculateLoanEligibility(); // Calculate loan eligibility
    }
}
