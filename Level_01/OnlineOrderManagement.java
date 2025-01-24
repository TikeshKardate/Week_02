/*
Multilevel Inheritance
Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
*/

// Superclass: Order
class Order {
    // Attributes for orderId and orderDate
    int orderId;
    String orderDate;

    // Constructor to initialize the attributes
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    // Additional attribute for ShippedOrder
    int trackNumber;

    // Constructor to initialize attributes of Order and ShippedOrder
    public ShippedOrder(int orderId, String orderDate, int trackNumber) {

        // Call the superclass constructor 
        super(orderId, orderDate); 
        this.trackNumber = trackNumber;
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor to initialize attributes of ShippedOrder and DeliveredOrder
    public DeliveredOrder(int orderId, String orderDate, int trackNumber, String deliveryDate) {

        // Call the superclass constructor 
        super(orderId, orderDate, trackNumber); 
        this.deliveryDate = deliveryDate;
    }

    // Method to display details of the delivered order
    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackNumber);
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class to test the Online Order Management system
public class OnlineOrderManagement {
    public static void main(String[] args) {

        // Creating an instance of DeliveredOrder
        DeliveredOrder a = new DeliveredOrder(1215, "24/01/2025", 678953, "26/01/2025");
        
        // Displaying details of the delivered order
        a.displayDetails();
    }
}
