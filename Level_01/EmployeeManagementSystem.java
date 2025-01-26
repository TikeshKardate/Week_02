/*
 1. Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
 */


abstract class Employee{  
    // Fields to store common attributes of all employees
    private String name;
    private int employeeId;
    private int baseSalary = 15000; // Base salary common to all employees
    private String time; // To store the time duration/full-time or half-time status of the employee
    private int totalSalary; // To store the calculated total salary of the employee

    // Constructor to initialize name and employeeId
    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to calculate salary, to be implemented by subclasses
    public abstract void calculateSalary();

    // Abstract method to set time duration, to be implemented by subclasses
    public abstract void TimeDuration();

    // Setter for totalSalary field
    public void setSalary(int salary){
        this.totalSalary = salary;
    }

    // Getter for baseSalary field
    public int getBaseSalary(){
        return baseSalary;
    }

    // Setter for time field
    public void setTime(String time){
        this.time = time;
    }

    // Getter for time field
    public String getTime(){
        return time;
    }

    // Method to display employee details
    public void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Salary: " + totalSalary);
        System.out.println("This employee works: " + time);
    }
}

// Subclass representing full-time employees
class FullTimeEmployee extends Employee{
    private String time = "full time"; // Default time duration for full-time employees
    private int fullTimeSalary; // Salary specific to full-time employees

    // Constructor to initialize name, employeeId, and fullTimeSalary
    public FullTimeEmployee(String name, int employeeId, int fullTimeSalary){
        super(name, employeeId); // Call the parent class constructor
        this.fullTimeSalary = fullTimeSalary;
    }

    // Implementation of abstract method from Employee class to calculate salary
    @Override
    public void calculateSalary(){
        setSalary(fullTimeSalary + getBaseSalary()); // Calculate total salary
    }

    // Implementation of abstract method from Employee class to set time duration
    @Override
    public void TimeDuration(){
        setTime(time); // Set time duration as full-time
    }
}

// Subclass representing half-time employees
class HalfTimeEmployee extends Employee{
    private String time = "half time"; // Default time duration for half-time employees
    private int halfTimeSalary; // Salary specific to half-time employees

    // Constructor to initialize name, employeeId, and halfTimeSalary
    public HalfTimeEmployee(String name, int employeeId, int halfTimeSalary){
        super(name, employeeId); // Call the parent class constructor
        this.halfTimeSalary = halfTimeSalary;
    }

    // Implementation of abstract method from Employee class to calculate salary
    @Override
    public void calculateSalary(){
        setSalary(halfTimeSalary + getBaseSalary()); // Calculate total salary
    }

    // Implementation of abstract method from Employee class to set time duration
    @Override
    public void TimeDuration(){
        setTime(time); // Set time duration as half-time
    }
}

// Main class to test the employee management system
public class EmployeeManagementSystem{
    public static void main(String[] args) {
        // Array to store full-time employees
        FullTimeEmployee[] empf = new FullTimeEmployee[2];
        
        // Array to store half-time employees
        HalfTimeEmployee[] emph = new HalfTimeEmployee[2];

        // Creating and initializing full-time employees
        empf[0] = new FullTimeEmployee("Tikesh", 11111, 100000);
        empf[0].calculateSalary();
        empf[0].TimeDuration();
        empf[0].displayDetails();

        System.out.println(); 

        empf[1] = new FullTimeEmployee("Abhay", 22222, 200000);
        empf[1].TimeDuration();
        empf[1].calculateSalary();
        empf[1].displayDetails();

        System.out.println(); 

        // Creating and initializing half-time employees
        emph[0] = new HalfTimeEmployee("Amaan", 33333, 6000);
        emph[0].calculateSalary();
        emph[0].TimeDuration();
        emph[0].displayDetails();
        
        System.out.println(); 

        emph[1] = new HalfTimeEmployee("Vikas", 44444, 1200);
        emph[1].calculateSalary();
        emph[1].TimeDuration();
        emph[1].displayDetails();
    }
}
