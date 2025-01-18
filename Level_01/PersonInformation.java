import java.util.*;

// A class named Person is created
class Person{
    String name;
    int age;

    // Default Constructor
    public Person(){
        this.name="Tikesh Kardate";
        this.age=22;
    }

    // Parameterized Constructor
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    // Method to display person details
    public void displayPersonDetails(){
        System.out.println("The name of the person is : "+name);
        System.out.println("The age of the person is : "+age);
    }


}

// A main class named PersonInformation is created
public class PersonInformation{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
    
        //Takes user input for the name of the person
        System.out.print("Enter the name of the person : ");
        String name=sc.nextLine();

        //Takes user input for the name of the person
        System.out.print("Enter the age of the person : ");
        int age=sc.nextInt();

        System.out.println();
        
        //Object is created to call the Parameterized Constructor
        System.out.print ("The result for the Parameterized Constructor :\n");
        Person obj1 = new Person (name , age);
        obj1.displayPersonDetails();
    
        System.out.println();

        //Object is created to call the Default Constructor
        System.out.print("The result for the Default Constructor :\n");
        Person obj2 = new Person ();
        obj2.displayPersonDetails();

    }
}