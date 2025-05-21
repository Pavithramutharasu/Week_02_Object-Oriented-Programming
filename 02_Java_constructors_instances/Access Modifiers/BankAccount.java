
public class BankAccount {
   public long accountNumber;
   protected String accountHolder;
   private long balance;
   public BankAccount(long accountNumber,String accountHolder,long balance){
       this.accountNumber = accountNumber;
       this.accountHolder = accountHolder;
       this.balance = balance;
   }
   public long getbalance(){
       return balance;
   }
   public void setbalance(long balance){
       this.balance = balance;
   }
}
class SavingsAccount extends BankAccount{
   private int credited;
   public SavingsAccount(long accountNumber,String accountHolder,long balance,int credited){
       super(accountNumber,accountHolder,balance);
       this.credited = credited;
       }
   public void display(){
       System.out.println("Account Number : "+accountNumber);
       System.out.println("Account Holder : "+accountHolder);
       System.out.println("Balance : "+getbalance());
       System.out.println("Amount Credited : "+credited);
   }
   public static void main(String[] args){
       SavingsAccount obj = new SavingsAccount(12365479,"Janu",45000,5000);
       obj.display();
       obj.setbalance(50000);
       obj.display();
   }
}

