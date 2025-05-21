
public class Vehicle {
   private String ownerName;
   private String vehicleType;
   static int registrationFee = 200;
   public Vehicle(String ownerName,String vehicleType){
       this.ownerName = ownerName;
       this.vehicleType = vehicleType;
   }
   public void displayVehicleDetails(){
       System.out.println("Owner : "+ownerName+" Vehicle Type : "+vehicleType+"Registration Fee : "+registrationFee);
   }
   public static void updateRegistrationFee(int newfee){
       registrationFee = newfee;
   }
   public static void main(String[] args){
       Vehicle obj = new Vehicle("Janu","Scooty");
       obj.displayVehicleDetails();
       updateRegistrationFee(300);
       obj.displayVehicleDetails();
   }
}

