// A class of name Vehicle is created
class Vehicle  {

       String ownerName;
       String vehicleType;
       static int registrationFees= 1000;

        
         public Vehicle(String ownerName, String vehicleType){
              this.ownerName = ownerName;
              this.vehicleType = vehicleType;
         }

            public void display(){
                System.out.println("Owner Name is: "+ownerName);
                System.out.println("Vehicle Type is : "+vehicleType);
                System.out.println("Registration Fees is  "+registrationFees);
            }
}

public class VehicleDetails {
public static void main(String[] args) {

    Vehicle v1 = new Vehicle("Vishal", "Car");
    v1.display();

    Vehicle v2 = new Vehicle("Sagar", "Bike");
    v2.display();

    System.out.println("Updating the registration fees");
    Vehicle.registrationFees = 1200;

    System.out.println();

    System.out.println("Now  Registration fees for this  Vehicle is: "+v1.registrationFees);

    System.out.println();

    System.out.println("Now  Registration fees for this Vehicle is: "+v2.registrationFees);
}

}
