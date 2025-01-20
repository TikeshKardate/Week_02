/*Sample Program 3: Employee Management System
Design an Employee class with the following features:
Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show the total number of employees.
This:
Use this to initialize name, id, and designation in the constructor.
Final:
Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof:
Check if a given object is an instance of the Employee class before printing the employee details.
*/

class Employee {
    String name;
    String designation;
    final int id;
    static String companyName = "Kardate Private Limited";

    // Constructor to initialize the employee details
    public Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
    }

    // Method to display the employee details
    public void displayEmployeeDetails() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Employee Name : " + name);
        System.out.println("Designation : " + designation);
        System.out.println("Employee Id : " + id);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        
        // Creating three Employee objects
        Employee obj1 = new Employee("Tikesh Kardate", "CEO", 201231);
        Employee obj2 = new Employee("Abhay Gautam", "Director",201232);
        Employee obj3 = new Employee("Amaan Siddhiqui", "CFO", 201233);

        // Checking if obj1 is an instance of Employee before displaying details
        if (obj1 instanceof Employee) {
            System.out.println("Yes, this Employee is an instance of Employee");
            obj1.displayEmployeeDetails();
        }

        System.out.println();

        // Checking if obj2 is an instance of Employee before displaying details
        if (obj2 instanceof Employee) {
            System.out.println("Yes, this Employee is an instance of Employee");
            obj2.displayEmployeeDetails();
        }

        System.out.println();

        // Checking if obj3 is an instance of Employee before displaying details
        if (obj3 instanceof Employee) {
            System.out.println("Yes, this book is an instance of Employee");
            obj3.displayEmployeeDetails();
        }
    }
}
