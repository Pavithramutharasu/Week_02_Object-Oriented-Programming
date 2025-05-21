
public class CarRental {
   String customerName;
   String carModel;
   int rentalDays;
   public CarRental(String customerName,String carModel,int rentalDays){
       this.customerName = customerName;
       this.carModel = carModel;
       this.rentalDays = rentalDays;
   }
   public void calculate(){
       int cost_per_day = 450;
       int totalcost = rentalDays * cost_per_day;
       System.out.println("Total Cost :"+totalcost);
   }
   public void display(){
       System.out.println("Customer Name : "+customerName);
       System.out.println("Car Model : "+carModel);
       System.out.println("Rental Days"+rentalDays);
   }
   public static void main(String[] args){
       CarRental obj = new CarRental("Harry","Audi",3);
       obj.display();
       obj.calculate();
   }
}

