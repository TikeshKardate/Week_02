/*
Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
*/

// Superclass: Device
class Device {

    // Attributes for deviceId and status
    String deviceId;
    String status;

    // Constructor to initialize the attributes
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display the status of the device
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    // Additional attribute for Thermostat
    int temperatureSetting;

    // Constructor to initialize attributes of Device and Thermostat
    public Thermostat(String deviceId, String status, int temperatureSetting) {

        // Call the superclass constructor
        super(deviceId, status); 
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus() method to include thermostat settings
    @Override
    public void displayStatus() {
        super.displayStatus(); // Display device status
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test the smart home system
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Creating an instance of Thermostat
        Thermostat thermostat = new Thermostat("Thermo_01", "Active", 22);

        // Displaying the status of the thermostat
        thermostat.displayStatus();
    }
}
