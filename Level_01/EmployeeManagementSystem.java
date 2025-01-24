/* Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
*/

import java.lang.String;

// Superclass: Employee
class Employee {
    // Attributes for name, id, and salary
    String name;
    int id;
    int salary;

    // Constructor to initialize the attributes
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details of the Employee
    public void displayDetails() {
        System.out.println("KARDATE TECHNOLOGIES Employees Details:\n");
    }
}

// Subclass: Manager
class Manager extends Employee {
    // Unique attribute for Manager
    int teamSize;

    // Constructor to initialize Manager-specific attributes
    public Manager(String name, int id, int salary, int teamSize) {

        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding displayDetails() method for Manager
    @Override
    public void displayDetails() {
        System.out.println("Designation: Manager\nName: " + name + "\nEmployee Id: " + id + "\nSalary: " + salary + "\nTeam Size: " + teamSize + "\n");
    }
}

// Subclass: Developer
class Developer extends Employee {
    // Unique attribute for Developer
    String programmingLanguage;

    // Constructor to initialize Developer-specific attributes
    public Developer(String name, int id, int salary, String programmingLanguage) {

        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails() method for Developer
    @Override
    public void displayDetails() {
        System.out.println("Designation: Developer\nName: " + name + "\nEmployee Id: " + id + "\nSalary: " + salary + "\nProgramming Language: " + programmingLanguage + "\n");
    }
}

// Subclass: Intern
class Intern extends Employee {
    // Unique attribute for Intern
    String trainingPeriod;

    // Constructor to initialize Intern-specific attributes
    public Intern(String name, int id, int salary, String trainingPeriod) {

        super(name, id, salary);
        this.trainingPeriod = trainingPeriod;
    }

    // Overriding displayDetails() method for Intern
    @Override
    public void displayDetails() {
        System.out.println("Designation: Intern\nName: " + name + "\nEmployee Id: " + id + "\nSalary: " + salary + "\nTraining Period: " + trainingPeriod + "\n");
    }
}

// Main class to test the Employee hierarchy
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Create an instance of each subclass and call their displayDetails() methods
        Employee a = new Employee(" ", 1, 1);
        a.displayDetails();

        Employee manager = new Manager("Tikesh Kardate", 116, 100000, 5);
        manager.displayDetails();

        Employee developer = new Developer("Abhay Gautam", 101, 90000, "JAVA");
        developer.displayDetails();

        Employee intern = new Intern("Amaan Sid", 123, 80000, "4 Months");
        intern.displayDetails();
    }
}
