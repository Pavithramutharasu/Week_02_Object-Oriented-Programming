
public class Person {
   String name;
   int age;
   String job;
   public Person(){
       name = "Anu";
       age = 23;
       job = "Teacher";
   }
   public Person(Person previousPerson){
       this.name = previousPerson.name;
       this.age = previousPerson.age;
       this.job = previousPerson.job;
   }
   public void display(){
       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
       System.out.println("Job : "+job);
   }
   public static void main(String[] args){
       Person obj = new Person();
       System.out.println("Person 1");
       obj.display();
       Person obj2 = new Person(obj);
       System.out.println("Person 2(Copy)");
       obj2.display();
   }
}

