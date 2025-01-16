/*Program to Display Employee Details
Problem Statement: Write a program to create an Employee
class with attributes name, id, and salary. Add a method to display the details.
 */ 

 class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name , int id , double salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displayDetails(){
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Salary:"+salary);

    }  
 }
 
 public class EmployeeDetails{
    public static void main (String[] args){
        Employee object=new Employee("Tikesh Kardate", 20256622 , 5000000);
        object.displayDetails();

    }
}