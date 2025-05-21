
public class Persons {
   String name;
   int age;
   public Persons(String name,int age) {
       this.name = name;
       this.age = age;
   }
   public void getdetails(){
       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
   }
}
class Teacher extends Persons{
   String subject;
   public Teacher(String name,int age,String subject){
       super(name,age);
       this.subject = subject;
   }
   public void displayRole(){
       System.out.println("Subject : "+subject);
   }
}
class Students extends Persons{
   String grade;
   public Students(String name,int age,String grade){
       super(name,age);
       this.grade = grade;
   }
   public void displayRole(){
       System.out.println("Grade : "+grade);
   }
}
class Staff extends Persons{
   String department;
   public Staff(String name,int age,String department){
       super(name,age);
       this.department = department;
   }
   public void displayRole(){
       System.out.println("Department : "+department);
   }
   public static void main(String[] args){
       Teacher obj = new Teacher("Janu",42,"Mathematics");
       obj.getdetails();
       obj.displayRole();

       Students obj1 = new Students("Anu",21,"A");
       obj1.getdetails();
       obj1.displayRole();

       Staff obj2 = new Staff("Riya",30,"HR");
       obj2.getdetails();
       obj2.displayRole();
   }
}

