/*
Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
*/

class Course{
    String courseName;
    int duration;
    public Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}
class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount){
        super(courseName, duration, platform, isRecorded);
        
        this.discount = discount;
        this.fee = fee - discount;
    }
    public void displayInfo(){
        System.out.println("Course Name is : "+courseName);
        System.out.println("Duration of course in months  is : "+duration);
        System.out.println("Platform of Online course is : "+platform);
        System.out.println("Is course Recorded? : "+isRecorded);
        System.out.println("Fee after discoutn is : "+fee);
    }
    
}

public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse("Java", 3, "BridgeLabz", false, 5000, 800);
        p.displayInfo();
    }
    
}