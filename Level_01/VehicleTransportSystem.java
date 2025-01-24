/*
Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, 
and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.
*/

// Superclass: Vehicle
class Vehicle {
    // Attributes for maxSpeed and fuelType
    int maxSpeed;
    String fuelType;

    // Constructor to initialize the attributes
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display information about the vehicle
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    // Unique attribute for Car
    int seatCapacity;

    // Constructor to initialize Car-specific attributes
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo() method for Car
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    // Unique attribute for Truck
    int loadCapacity;

    // Constructor to initialize Truck-specific attributes
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo() method for Truck
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    // Unique attribute for Motorcycle
    String type;

    // Constructor to initialize Motorcycle-specific attributes
    public Motorcycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }

    // Overriding displayInfo() method for Motorcycle
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}

// Main class to test the Vehicle hierarchy
public class VehicleTransportSystem {
    public static void main(String[] args) {
        
        // Creating an array of Vehicle type to demonstrate polymorphism
        Vehicle[] vehicles = new Vehicle[3];

        // Storing objects of different subclasses in the array
        vehicles[0] = new Car(120, "Petrol", 5);
        vehicles[1] = new Truck(80, "Diesel", 1000);
        vehicles[2] = new Motorcycle(150, "Petrol", "Sportsbike");

        // Calling displayInfo() on each object to demonstrate polymorphism
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
