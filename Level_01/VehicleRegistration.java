class Vehicle {
    static double registrationFee = 250.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    // Constructor to initialize the vehicle details
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("Registration Number of vehicle is: " + registrationNumber);
        System.out.println("Owner Name of vehicle is: " + ownerName);
        System.out.println("Type of vehicle is: " + vehicleType);
        System.out.println("Registration Fee is: " + registrationFee);
    }
}

public class VehicleRegistration{
    public static void main(String[] args) {
        // Displaying the initial registration fee
        System.out.println("Initially, the registration fee is: " + Vehicle.registrationFee);
        
        // Updating the registration fee
        Vehicle.updateRegistrationFee(500.0);
        System.out.println("Updated registration fee is: " + Vehicle.registrationFee);

        // Creating two Vehicle objects
        Vehicle obj1 = new Vehicle("Tikesh", "Bike", "MP480000");
        Vehicle obj2 = new Vehicle("Abhay", "Car", "MP481111");

        // Checking if obj1 is an instance of Vehicle before displaying details
        if (obj1 instanceof Vehicle) {
            System.out.println();
            System.out.println("This is an instance of Vehicle");
            System.out.println("Displaying Vehicle 1 details");
            obj1.display();
        }

        // Checking if obj2 is an instance of Vehicle before displaying details
        if (obj2 instanceof Vehicle) {
            System.out.println();
            System.out.println("This is an instance of Vehicle");
            System.out.println("Displaying Vehicle 2 details");
            obj2.display();
        }
    }
}
