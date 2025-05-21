
public class Book {
   String title;
   String author;
   int price;
   public Book(){
       title = "Room on the Roof";
       author = "Ruskin Bond";
       price = 500;
   }
   public Book(String title,String author,int price){
       this.title = title;
       this.author = author;
       this.price = price;
   }
   public void display(){
       System.out.println("Title : "+title);
       System.out.println("Author : "+author);
       System.out.println("Price : "+price);
   }
   public static void main(String[] args){
       Book obj1 = new Book();
       System.out.println("Book 1 Details");
       obj1.display();
       Book obj2 = new Book("Swami and Friends","R K Narayanan",450);
       System.out.println("Book 2 Details");
       obj2.display();
   }
}

