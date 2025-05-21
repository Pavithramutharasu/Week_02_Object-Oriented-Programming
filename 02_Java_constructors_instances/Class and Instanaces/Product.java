
import java.util.*;
public class Product {
   String productName;
   private int price;
   static int totalProducts = 0;
   public Product(String productName,int price){
       this.productName =  productName;
       this.price = price;
       totalProducts++;
   }
   public void displayProductDetails(){
       System.out.println("Product Name : "+productName+" Price : "+price);
   }
   public void displayTotalProducts(){
       System.out.println("Total Products : "+totalProducts);
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the product name : ");
       String productName = input.nextLine();
       System.out.println("Enter the price : ");
       int price = input.nextInt();
       Product obj = new Product(productName,price);
       obj.displayProductDetails();
       obj.displayTotalProducts();
   }
}

