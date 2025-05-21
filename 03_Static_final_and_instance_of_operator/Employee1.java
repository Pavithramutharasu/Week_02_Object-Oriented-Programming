 public class Employee1 {
   private static String companyName = "Tech Corp";
   private static int totalEmployees = 0;

   private final int id;
   private String name;
   private String designation;

   public Employee1(String name, int id, String designation) {
       this.name = name;
       this.id = id;
       this.designation = designation;
       totalEmployees++;
   }

   public static void displayTotalEmployees() {
       System.out.println("Total employees in " + companyName + ": " + totalEmployees);
   }

   public void display() {
       if (this instanceof Employee1) {
           System.out.println("Company: " + companyName);
           System.out.println("Employee Name: " + this.name);
           System.out.println("Employee ID: " + this.id);
           System.out.println("Designation: " + this.designation);
       }
   }
   public static void main(String[] args){

       Employee1 obj1 = new Employee1("rajesh",2134,"developer");
       Employee1 obj2 = new Employee1("sanjay",213443,"mobile developer");

       Employee1.displayTotalEmployees();
       obj1.display();

       obj2.display();



   }
}

