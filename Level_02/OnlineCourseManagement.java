
class Course {

        String CourseName;
        int duration;
        int fees;

        // Static variable for institute name
        static String instituteName = "Technocrats Institute";
         
        // Constructor to initialize course details
        public Course(String CourseName, int duration, int fees){
            this.CourseName = CourseName;
            this.duration = duration;
            this.fees = fees;
        }
        // Method to display course details
        public void display(){
            System.out.println("Course Name is: "+CourseName);
            System.out.println("Duration of the course is : "+duration);
            System.out.println("Fees of the course is  "+fees);
            System.out.println("Institute Name is: "+instituteName);
        }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {

        // Creating a Course object for BTECH
        Course c1 = new Course("BTECH", 4,100000);
        c1.display();

        // Creating a Course object for MBA
        Course c2 = new Course("MBA", 2, 2500000);
        c2.display();

         System.out.println("Updating the institute name");

        Course.instituteName = "Rajiv Gandhi Proudyogiki Vishwavidyalaya";

        System.out.println();

        System.out.println("Now  Institute name for first Course is: "+c1.instituteName);

        System.out.println();

        System.out.println("Now  Institute name for first Course is: "+c2.instituteName);

       

    }
    
}
