/*
Hybrid Inheritance (Simulating Multiple Inheritance)
Since Java doesn’t support multiple inheritance directly, hybrid inheritance is typically achieved through interfaces.
Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
*/


// Superclass Person
class Person {

    // Attributes for name and id
    String name;
    int id;

    // Constructor to initialize the person with name and id
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display the information of the person
    public void display() {
        System.out.println("Name is : " + name);
        System.out.println("ID is : " + id);
    }
}

// Interface representing a worker with a method to perform duties
interface Worker {
    // Abstract method to be implemented by worker classes
    public void performDuties();
}

// Subclass representing a chef, inheriting from Person and implementing Worker
class Chef extends Person implements Worker {

    // Constructor to initialize the chef with name and id
    public Chef(String name, int id) {

        super(name, id); // Call to the constructor of the base class
        super.display(); // Display the chef's information
    }

    // Method to perform duties specific to a chef
    public void performDuties() {
        System.out.println("Chefs are making food for the party");
    }
}

// Subclass representing a waiter, inheriting from Person and implementing Worker
class Waiter extends Person implements Worker {

    // Constructor to initialize the waiter with name and id
    public Waiter(String name, int id) {

        super(name, id); // Call to the constructor of the base class
        super.display(); // Display the waiter's information
    }

    // Method to perform duties specific to a waiter
    public void performDuties() {
        System.out.println("Waiter is serving food at the party");
    }
}

// Main class to test the restaurant management system
public class RestaurantManagementSystem {
    public static void main(String[] args) {

        // Creating an instance of a chef and displaying their information and duties
        Chef c = new Chef("Tikesh", 11111);
        c.performDuties();

        System.out.println();

        // Creating an instance of a waiter and displaying their information and duties
        Waiter w = new Waiter("Abhay", 22222);
        w.performDuties();
    }
}
