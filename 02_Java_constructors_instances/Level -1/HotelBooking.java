
public class HotelBooking {
   String guestName;
   String roomType;
   int nights;
   public HotelBooking(){
       guestName = "Guru";
       roomType = "Single";
       nights = 2;
   }
   public HotelBooking(String guestName,String roomType,int nights){
       this.guestName = guestName;
       this.roomType = roomType;
       this.nights = nights;
   }
   public HotelBooking(HotelBooking previousGuest){
       this.guestName = previousGuest.guestName;
       this.roomType = previousGuest.roomType;
       this.nights = previousGuest.nights;
   }
   public void display(){
       System.out.println("Guest Name : "+guestName);
       System.out.println("Room Type : "+roomType);
       System.out.println("No.of.nights : "+nights);
   }
   public static void main(String[] args){
       HotelBooking obj1 = new HotelBooking();
       System.out.println("Guest No : 1");
       obj1.display();
       System.out.println("Guest No : 2");
       HotelBooking obj2 = new HotelBooking("Ram","Single",4);
       obj2.display();
       System.out.println("Copy of Guest 2");
       HotelBooking obj3 = new HotelBooking(obj2);
       obj3.display();
   }
}

