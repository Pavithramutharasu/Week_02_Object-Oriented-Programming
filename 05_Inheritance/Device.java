
class Device{
   int deviceId;
   String status;
   public Device(String status,int deviceId){
       this.deviceId = deviceId;
       this.status = status;
   }
}
class Thermostat extends Device{
   int temperatureSetting;
   public Thermostat(String status,int deviceId,int temperatureSetting){
       super(status,deviceId);
       this.temperatureSetting = temperatureSetting;
   }
   public void displayStatus(){
       System.out.println("Device ID : "+deviceId);
       System.out.println("Status : "+status);
       System.out.println("Temperature in celsius : "+temperatureSetting);
   }
   public static void main(String[] args){
       Thermostat obj = new Thermostat("Active",1254,21);
       obj.displayStatus();
   }
}

