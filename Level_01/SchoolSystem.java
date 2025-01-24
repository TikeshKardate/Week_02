/*
Sample Problem 2: School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
*/


// Superclass Person
class Person {

    // Attributes for name, age, and role
    String name;
    int age;
    String role;

    // Constructor to initialize the person with name, age, and role
    public Person(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
}

// Subclass representing a teacher, inheriting from Person
class Teacher extends Person {
    // Subject that the teacher teaches
    String subject;

    // Constructor to initialize the teacher with specific details
    public Teacher(String name, int age, String subject) {
        super(name, age, "Teacher"); // Call to the constructor of the base class, setting the role to "Teacher"
        this.subject = subject;
    }

    // Method to display the details of the teacher
    public void displayInfo() {
        System.out.println("Displaying the details of: " + role);
        System.out.println("Name of the teacher is: " + name);
        System.out.println("Age of the teacher is: " + age);
        System.out.println("Teacher is teaching: " + subject);
    }
}

// Subclass representing a student, inheriting from Person
class Student extends Person {
    // Grade that the student is in
    char grade;

    // Constructor to initialize the student with specific details
    public Student(String name, int age, char grade) {
        super(name, age, "Student"); // Call to the constructor of the base class, setting the role to "Student"
        this.grade = grade;
    }

    // Method to display the details of the student
    public void displayInfo() {
        System.out.println("Displaying the details of: " + role);
        System.out.println("Name of the student is: " + name);
        System.out.println("Age of the student is: " + age);
        System.out.println("Grade of the student is: " + grade);
    }
}

// Subclass representing staff, inheriting from Person
class Staff extends Person {
    // Total number of staff members
    int totalStaff;

    // Constructor to initialize the staff with specific details
    public Staff(String name, int age, int totalStaff) {

        super(name, age, "Staff"); // Call to the constructor of the base class, setting the role to "Staff"
        this.totalStaff = totalStaff;
    }

    // Method to display the details of the staff
    public void displayInfo() {
        System.out.println("Displaying the details of: " + role);
        System.out.println("Name of head of the staff is: " + name);
        System.out.println("Age of head of the staff is: " + age);
        System.out.println("There are total " + totalStaff + " staff members");
    }
}

// Main class to test the school system
public class SchoolSystem {
    public static void main(String[] args) {

        // Creating instances of different members in the school system
        Teacher t = new Teacher("Tikesh", 21, "Aptitude");
        t.displayInfo();
        System.out.println();

        Student s = new Student("Abhay", 21, 'A');
        s.displayInfo();
        System.out.println();

        Staff st = new Staff("Nishank", 20, 50);
        st.displayInfo();
    }
}
