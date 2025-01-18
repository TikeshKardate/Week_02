import java.util.*;

// A class named Circle is created
class Circle{
    double radius;

    // Default Constructor
    public Circle(){
        this.radius=3;
    }

    // Parameterized Constructor
    public Circle(double radius){
        this.radius=radius;
    }

    // Method to calculate the Area
    public void areaCircle(){
        System.out.println("The area of Circle is : "+(Math.PI*radius*radius));
    }

    // Method to calculate the Area
    public void circumferenceCircle(){
        System.out.println("The circumference of Circle is :"+(2*Math.PI*radius));
    }

}

public class CircleCalculate{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter the radius of the circle : ");
        double radius=sc.nextDouble();

        System.out.println();
        
        //Object is created to call the Parameterized Constructor
        System.out.print ("The result for the Parameterized Constructor :\n");
        Circle obj = new Circle (radius);
        obj.areaCircle();
        obj.circumferenceCircle();

        System.out.println();

        //Object is created to call the Default Constructor
        System.out.print("The result for the Default Constructor :\n");
        Circle obj2 = new Circle ();
        obj2.areaCircle();
        obj2.circumferenceCircle();

    }
}