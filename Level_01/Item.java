/*Program to track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price. 
Add a method to display item details and calculate the total cost for a given quantity.
*/

public class Item {
    
    // Attributes of the Item class
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize the attributes
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price: %.2f\n", price);
    }

    // Main method to demonstrate the usage of the Item class
    public static void main(String[] args) {
        // Creating an instance of the Item class
        Item item = new Item("001", "Laptop", 80000.999);
        
        // Displaying the item details
        item.displayDetails();
        
        // Calculating and displaying the total cost for a given quantity
        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.printf("Total cost for %d items: %.2f\n", quantity, totalCost);
    }
}
