/*Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. 
Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. 
The method is used to retrieve and display this information for each object.
*/

 class Phone{
    // Attributes of the Phone class
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize the attributes
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display all the details of the phone
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: %.2f\n", price);
    }
 }

    public class MobilePhone{
    // Main method to demonstrate the usage of the Phone class
    public static void main(String[] args) {
        // Creating an instance of the MobilePhone class
        Phone phone = new Phone("Samsung", "Galaxy S21", 80000.99);
        // Calling the method to display mobile phone details
        phone.displayDetails();
    }
}
 