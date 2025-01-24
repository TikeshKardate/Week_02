/*
Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.
*/


// Superclass Vehicle
class Vehicle {

    // Attributes for maximum speed and model of the vehicle
    int maxSpeed;
    String model;

    // Constructor to initialize the vehicle with maximum speed and model
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display the information of the vehicle
    public void displayInfo() {
        System.out.println("Maximum Speed can be  : " + maxSpeed);
        System.out.println("Model of vehicle is : " + model);
    }
}

// Interface representing refuelable capability
interface Refuelable {
    // Abstract method to be implemented by refuelable vehicles
    public void refuel();
}

// Subclass representing an electric vehicle, inheriting from Vehicle
class ElectricVehicle extends Vehicle {

    // Constructor to initialize the electric vehicle with specific details
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model); // Call to the constructor of the base class
    }

    // Method specific to electric vehicles for charging
    public void charge() {
        System.out.println("Charging the electric vehicle");
    }
}

// Subclass representing a petrol vehicle, inheriting from Vehicle, and implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {

    // Constructor to initialize the petrol vehicle with specific details
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model); // Call to the constructor of the base class
    }

    // Method to implement refueling behavior specific to petrol vehicles
    public void refuel() {
        System.out.println("Refueling the petrol vehicle");
    }
}

// Main class to test the vehicle management system
public class VechileManagementSystem {
    public static void main(String[] args) {
        
        // Creating an instance of an electric vehicle and displaying its information
        ElectricVehicle ev = new ElectricVehicle(250, "Tata Curv");
        ev.displayInfo();
        ev.charge();
        System.out.println();

        // Creating an instance of a petrol vehicle and displaying its information
        PetrolVehicle pv = new PetrolVehicle(180, "Tata Avinya");
        pv.displayInfo();
        pv.refuel();
    }
}
