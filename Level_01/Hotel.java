import java.util.Scanner;

class  HotelBooking{
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    public HotelBooking(){
        this.guestName="Tikesh";
        this.roomType="Deluxe";
        this.nights=1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking h){
        this.guestName=h.guestName;
        this.roomType=h.roomType;
        this.nights=h.nights;
    }

    // A method is cretaed to show details
    public void showDetails(){
        System.out.println("Guest name is : "+guestName);
        System.out.println("Room type is : "+roomType);
        System.out.println("Number of nights is : "+nights);
    }

}

// A main class Hotel is defined 
public class Hotel {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in); 

        System.out.println("Enter the guest name: ");
        String name=sc.nextLine();

        System.out.println("Enter the room type: ");
        String roomType=sc.nextLine();

        System.out.println("Enter the number of nights: ");
        int nights=sc.nextInt();
        
        // Calling the default constructor
        HotelBooking h= new HotelBooking();
        h.showDetails();
        
        // Calling the parameterized constructor
        HotelBooking h2=new HotelBooking(name,roomType,nights);
        h2.showDetails();

        // Calling the copy constructor
        HotelBooking h3=new HotelBooking(h);
        h3.showDetails();
    }
    
}