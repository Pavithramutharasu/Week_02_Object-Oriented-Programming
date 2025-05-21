
public class LibraryBook {
   String title;
   String author;
   double price;
   boolean availability;
   LibraryBook(String title,String author,double price){
       this.title = title;
       this.author = author;
       this.price = price;
       availability = true;
   }
   String borrow(){
       if(availability){
           availability = false;
           return ("Book borrowed successfully");
       }
       return("Book not available");
   }
   public static void main(String[] args){
       LibraryBook obj = new LibraryBook("Children OmniBus","Ruskin Bond",750);
       System.out.println(obj.borrow());
   }
}

