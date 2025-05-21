public class Vehicle1 {
   private static int registrationFee = 100;
   private final String registrationNumber;
   private String ownerName;
   private String vehicleType;

   public Vehicle1(String ownerName, String vehicleType, String registrationNumber) {
       this.registrationNumber = registrationNumber;
       this.ownerName = ownerName;
       this.vehicleType = vehicleType;
   }

   public static void updateRegistrationFee(int newFee) {
       registrationFee = newFee;
   }

   public void displayRegistrationDetails() {
       System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType +
               ", Registration Number: " + registrationNumber + ", Fee: $" + registrationFee);
   }
   public static void main(String[] args) {
       Vehicle1 v1 = new Vehicle1("John Doe", "Car", "REG123");
       Vehicle1 v2 = new Vehicle1("Jane Smith", "Bike", "REG456");

       if (v1 instanceof Vehicle1) v1.displayRegistrationDetails();
       if (v2 instanceof Vehicle1) v2.displayRegistrationDetails();

       Vehicle.updateRegistrationFee(200);
       v1.displayRegistrationDetails();
       v2.displayRegistrationDetails();
   }
}

