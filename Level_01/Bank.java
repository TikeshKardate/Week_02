/*Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.
 */

class BankAccount {
    String accounteeName;
    static String bankName = "State Bank Of India";
    final int accountNumber;
    static int count = 0;

    // Constructor to initialize the account details
    public BankAccount(String accounteeName, int accountNumber) {
        this.accounteeName = accounteeName;
        this.accountNumber = accountNumber;
        count++;
    }

    // Static method to get the total number of accounts
    public static void getTotalAccounts() {
        System.out.println("The total number of accounts are: " + count);
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + accounteeName);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class Bank {
    public static void main(String[] args) {
        // Creating two BankAccount objects
        BankAccount obj1 = new BankAccount("Abhay", 25606060);
        BankAccount obj2 = new BankAccount("Tikesh", 25616161);

        // Displaying the total number of accounts
        BankAccount.getTotalAccounts();

        System.out.println();

        // Checking if obj1 is an instance of BankAccount before displaying details
        if (obj1 instanceof BankAccount) {
            System.out.println("Yes, it is an instance of BankAccount");
            obj1.displayDetails();
        }

        System.out.println();

        // Checking if obj2 is an instance of BankAccount before displaying details
        if (obj2 instanceof BankAccount) {
            System.out.println("Yes, it is an instance of BankAccount");
            obj2.displayDetails();
        }
    }
}
