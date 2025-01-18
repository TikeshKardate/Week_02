 class CarRental {
     String customerName;
     String carModel;
     int rentalDays;
     static double RentPerDay= 100.0; 

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * RentPerDay;
    }

    public void showDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost for "+rentalDays+" days is " + calculateTotalCost());
    }
}

public class Cars {
    public static void main(String[] args) {
        CarRental rental = new CarRental("Tikesh", "Land Rover", 5);
        rental.showDetails();
    }
}