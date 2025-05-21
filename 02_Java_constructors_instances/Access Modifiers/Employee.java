
public class Employee {
   public int employeeID;
   protected String department;
   private int salary;
   public Employee(int employeeID,String department,int salary){
       this.employeeID = employeeID;
       this.department = department;
       this.salary = salary;
   }
   public int getsalary(){
       return salary;
   }
   public void setsalary(int salary){
       this.salary = salary;
   }
}
class Manager extends Employee{
   private int experience;
   public Manager(int employeeID,String department,int salary,int experience){
       super(employeeID,department,salary);
       this.experience = experience;
   }
   public void display(){
       System.out.println("Employee ID : "+employeeID);
       System.out.println("Department : "+department);
       System.out.println("Salary : "+getsalary());
       System.out.println("Experience : "+experience);
   }
   public static void main(String[] args){
       Manager obj = new Manager(123,"IT",45000,4);
       obj.display();
       obj.setsalary(60000);
       obj.display();
   }
}

