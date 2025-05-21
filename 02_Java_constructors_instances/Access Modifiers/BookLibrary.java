
public class BookLibrary {
   public long ISBN;
   protected String title;
   private String author;
   public BookLibrary(long ISBN,String title,String author){
       this.ISBN = ISBN;
       this.title = title;
       this.author = author;
   }
   public String getauthor(){
       return author;
   }
   public void setauthor(String author){
       this.author = author;
   }
}
class Ebook extends BookLibrary{
   private String genre;
   public Ebook(long ISBN, String title,String author,String genre){
       super(ISBN,title,author);
       this.genre = genre;
   }
   public void display(){
       System.out.println("ISBN : "+ISBN);
       System.out.println("Title : "+title);
       System.out.println("Author : "+getauthor());
       System.out.println("Genre : "+genre);
   }
   public static void main(String[] args){
       Ebook obj = new Ebook(1236547891,"Blue Umbrella","Ruskin Bond","Children's Story");
       obj.display();
       obj.setauthor("Ruskin");
       obj.display();
   }
}

