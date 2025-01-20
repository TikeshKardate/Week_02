class Patient {
    static String hospitalName = "AIIMS Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    // Constructor to initialize patient details
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void display() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID is: " + patientID);
        System.out.println("Name of the patient: " + name);
        System.out.println("Age of the patient is: " + age);
        System.out.println("Ailment: " + ailment);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        
        // Creating two Patient objects
        Patient patient1 = new Patient("Rahul", 25, "Fever", 101);
        Patient patient2 = new Patient("Shyam", 30, "Fracture", 102);

        // Displaying the hospital name and total patients admitted
        System.out.println("Our Hospital Name is: " + Patient.hospitalName);
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        System.out.println();

        // Checking if patient1 is an instance of Patient before displaying details
        if (patient1 instanceof Patient) {
            System.out.println();
            System.out.println("Patient1 is an instance of Patient");
            System.out.println("Displaying Patient1 details");
            patient1.display();
        }

        // Checking if patient2 is an instance of Patient before displaying details
        if (patient2 instanceof Patient) {
            System.out.println();
            System.out.println("Patient2 is an instance of Patient");
            System.out.println("Displaying Patient2 details");
            patient2.display();
        }
    }
}
