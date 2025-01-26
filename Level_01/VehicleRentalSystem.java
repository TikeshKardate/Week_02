/*
3. Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
*/

// Interface with methods for insurance operations
interface Insurable {
    public void calculateInsurance();
    public void getInsuranceDetails();
}

// Abstract class representing a vehicle, implementing Insurable
abstract class Vehicle implements Insurable {
    private String vehicleNumber; // The vehicle's identification number
    private String type; // The type of vehicle (e.g., car, bike, truck)
    private int rentalRate; // Cost to rent the vehicle per day
    private int insurance; // Insurance amount of the vehicle

    // Constructor to initialize vehicleNumber, type, and rentalRate
    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost, which must be implemented by subclasses
    public abstract void calculateRentalCost(int days);

    // Setter for the insurance field
    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Vehicle Rental Rate: " + rentalRate);
        System.out.println("Vehicle Insurance: " + insurance);
    }
}

// Subclass representing a car
class Car extends Vehicle {
    private int rentalRate; // Rental rate specific to the car

    // Constructor to initialize vehicleNumber, type, and rentalRate for the car
    public Car(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate); // Call the parent class constructor
        this.rentalRate = rentalRate;
    }

    // Implementation of abstract method to calculate rental cost
    @Override
    public void calculateRentalCost(int days) {
        int totalCost = days * rentalRate; // Calculate total cost based on days and rental rate
        System.out.println("Total cost for car is: " + totalCost);
    }

    // Implementation of method to calculate insurance for the car
    @Override
    public void calculateInsurance() {
        setInsurance(1000); // Set a fixed insurance amount for the car
    }

    // Implementation of method to get insurance details for the car
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance for car is 1000");
    }
}

// Subclass representing a bike
class Bike extends Vehicle {
    private int rentalRate; // Rental rate specific to the bike

    // Constructor to initialize vehicleNumber, type, and rentalRate for the bike
    public Bike(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate); // Call the parent class constructor
        this.rentalRate = rentalRate;
    }

    // Implementation of abstract method to calculate rental cost
    @Override
    public void calculateRentalCost(int days) {
        int totalCost = days * rentalRate; // Calculate total cost based on days and rental rate
        System.out.println("Total cost for bike is: " + totalCost);
    }

    // Implementation of method to calculate insurance for the bike
    @Override
    public void calculateInsurance() {
        setInsurance(500); // Set a fixed insurance amount for the bike
    }

    // Implementation of method to get insurance details for the bike
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance for bike is 500");
    }
}

// Subclass representing a truck
class Truck extends Vehicle {
    private int rentalRate; // Rental rate specific to the truck

    // Constructor to initialize vehicleNumber, type, and rentalRate for the truck
    public Truck(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate); // Call the parent class constructor
        this.rentalRate = rentalRate;
    }

    // Implementation of abstract method to calculate rental cost
    @Override
    public void calculateRentalCost(int days) {
        int totalCost = days * rentalRate; // Calculate total cost based on days and rental rate
        System.out.println("Total cost for truck is: " + totalCost);
    }

    // Implementation of method to calculate insurance for the truck
    @Override
    public void calculateInsurance() {
        setInsurance(2000); // Set a fixed insurance amount for the truck
    }

    // Implementation of method to get insurance details for the truck
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance for truck is 2000");
    }
}

// Main class to test the vehicle rental system
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Array to store different types of vehicles
        Vehicle[] vehicles = new Vehicle[3];
        
        // Creating and initializing different vehicles
        vehicles[0] = new Car("1111", "car", 1000);
        vehicles[1]=new Bike("2222","bike",500);
        vehicles[2]=new Truck("3333","truck",2000);
       
        for(Vehicle vehicle:vehicles){
            
            vehicle.calculateInsurance();
            vehicle.displayDetails();
            vehicle.calculateRentalCost(5);
            System.out.println();
            
        }
    }
    
}