/*Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius. 
Add methods to calculate and display the area and circumference of the circle.
*/

class Circle {
   double radius;

    public Circle (double radius) {
        this.radius=radius;
    }

    public double area () {
        return Math.PI*radius*radius;

    }
    public void displayDetails() {
        System.out.println("The area of the circle for the given radius "+radius+" is : " + area());
        
    }
}

public class AreaOfCircle {
    public static void main(String args[]) {
        Circle circle = new Circle(6);
        circle.displayDetails();
    }
}