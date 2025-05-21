public class BankAccount1 {
   private static String BankName = "Indian Bank";
   private static int total_acc = 0;

   private String name;
   private final int acc_no;
   private double balance;


   public BankAccount1(String name, int acc_no, double balance){
       this.name  = name;
       this.acc_no = acc_no;
       this.balance = balance;
       total_acc++;
   }


   static void getTotalAccounts(){
       System.out.println("The total number of accounts created so far is : "+total_acc);
   }


   void display(){
       if(this instanceof BankAccount1){
           System.out.println("The account holder name is : "+this.name);
           System.out.println("The account number is : "+this.acc_no);
           System.out.println("The account balance is : "+this.balance);
       }
       else{
           System.out.println("Invalid object or instance");
       }
   }
   public static void main(String[] args){

       BankAccount1 obj1 = new BankAccount1("Janu",1236,45000);
       BankAccount1 obj2 = new BankAccount1("Anu",5478,8000);
       BankAccount1.getTotalAccounts();

       obj1.display();

       obj2.display();

   }
}

