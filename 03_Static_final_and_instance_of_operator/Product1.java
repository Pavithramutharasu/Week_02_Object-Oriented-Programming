public class Product1 {
   private static double discount = 0.0;
   private final int productID;
   private String productName;
   private double price;
   private int quantity;
   private static int idCounter = 1;

   public Product1(String productName, double price, int quantity) {
       this.productID = idCounter++;
       this.productName = productName;
       this.price = price;
       this.quantity = quantity;
   }

   public static void updateDiscount(double newDiscount) {
       discount = newDiscount;
   }

   public double getFinalPrice() {
       return price * quantity * (1 - discount / 100);
   }

   public void displayProductDetails() {
       System.out.println("Product ID: " + productID + ", Name: " + productName + ", Price: $" + price +
               ", Quantity: " + quantity + ", Discount: " + discount + "%, Final Price: $" + getFinalPrice());
   }
   public static void main(String[] args) {
       Product1 p1 = new Product1("Laptop", 1000, 2);
       Product1 p2 = new Product1("Smartphone", 800, 1);

       if (p1 instanceof Product1) p1.displayProductDetails();
       if (p2 instanceof Product1) p2.displayProductDetails();

       Product1.updateDiscount(10);
       p1.displayProductDetails();
       p2.displayProductDetails();
   }
}

