/*Sample Program 5: University Student Management
Create a Student class to manage student data with the following features:
Static:
A static variable universityName shared across all students.
A static method displayTotalStudents() to show the number of students enrolled.
This:
Use this in the constructor to initialize name, rollNumber, and grade.
Final:
Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
*/

class Student{
    String name;
    final int rollNumber;
    char grade;
    static String universityName="Technocrats Institute Of Technology";
    static int totalStudents=0;

    public Student (String name, int rollNumber, char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students are: " + totalStudents);
    }


    public void displayStudentDetails(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Grade : "+grade);
        
    }
}

public class UniversityManagementSystem {
public static void main(String[] args) {
    Student obj1 = new Student("Tikesh",116,'A');
    Student obj2 = new Student("Abhay",117,'B');
    Student obj3 = new Student("Amaan",118,'A');

    System.out.println("University Name : "+Student.universityName);

    Student.displayTotalStudents();

    System.out.println();

    // Checking if obj2 is an instance of Student before displaying details
    if (obj1 instanceof Student) {
        System.out.println("Yes, this Student is an instance of Student");
        obj1.displayStudentDetails();
    }

    System.out.println();

    // Checking if obj2 is an instance of Student before displaying details
    if (obj2 instanceof Student) {
        System.out.println("Yes, this Student is an instance of Student");
        obj2.displayStudentDetails();
    }

    System.out.println();

    // Checking if obj3 is an instance of Student before displaying details
    if (obj3 instanceof Student) {
        System.out.println("Yes, this Student is an instance of Student");
        obj3.displayStudentDetails();
    }
}
}