public class BankAccounts {
   int accountNumber;
   int balance;
   public BankAccounts(int accountNumber,int balance){
       this.accountNumber = accountNumber;
       this.balance = balance;
   }
   void getAccountDetails() {
       System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
   }
}
class SavingsAccounts extends BankAccounts{
   int interestRate;
   String acctype;
   public SavingsAccounts(int accountNumber,int balance,int interestRate,String acctype){
       super(accountNumber,balance);
       this.interestRate = interestRate;
       this.acctype = acctype;
   }
   public void displayAccountType(){
       System.out.println("Account Type : "+acctype);
   }
}
class CheckingAccount extends BankAccounts{
   int withdrawalLimit;
   String acc;
   public CheckingAccount(int accountNumber,int balance,int withdrawalLimit,String acc){
       super(accountNumber,balance);
       this.withdrawalLimit = withdrawalLimit;
       this.acc = acc;
   }
   public void displayAccountType(){
       System.out.println("Account Type : "+acc);
   }
}
class FixedDepositAccount extends BankAccounts{
   int fixedamount;
   String type;
   public FixedDepositAccount(int accountNumber,int balance,int fixedamount,String type){
       super(accountNumber,balance);
       this.fixedamount = fixedamount;
       this.type = type;
   }
   public void displayAccountType(){
       System.out.println("Account Type : "+type);
   }
   public static void main(String[] args){
       SavingsAccounts savings = new SavingsAccounts(101, 5000, 4,"Savings");
       savings.displayAccountType();
       savings.getAccountDetails();

       CheckingAccount checking = new CheckingAccount(102, 2000, 1000,"Checking Account");
       checking.displayAccountType();
       checking.getAccountDetails();

       FixedDepositAccount fixedDeposit = new FixedDepositAccount(103, 10000, 5000,"Fixed Deposit" );
       fixedDeposit.displayAccountType();
       fixedDeposit.getAccountDetails();
   }
}