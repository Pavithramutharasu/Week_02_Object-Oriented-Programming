
import java.util.Scanner;
public class Circle {
   double radius;
   public Circle(){
       radius = 2.5;
   }
   public Circle(double radius){
       this.radius = radius;
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       Circle obj1 = new Circle();
       System.out.println("The radius given is : "+obj1.radius);
       System.out.println("Enter the radius : ");
       double r = input.nextDouble();
       Circle obj2 = new Circle(r);
       System.out.println("The radius user gave is : "+obj2.radius);
   }
}

