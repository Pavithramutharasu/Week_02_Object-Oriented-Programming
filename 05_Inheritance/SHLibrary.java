
public class SHLibrary {
   String title;
   int year;
   public SHLibrary(String title,int year){
       this.title = title;
       this.year = year;
   }
}
class Author3 extends SHLibrary{
   String name;
   String bio;
   public Author3(String title,int year,String name,String bio){
       super(title,year);
       this.name = name;
       this.bio = bio;
   }
   public void displayInfo(){
       System.out.println("Title : "+title);
       System.out.println("Year of publication : "+year);
       System.out.println("Author Name : "+name);
       System.out.println("Bio : "+bio);
   }
   public static void main(String[] args){
       Author3 obj = new Author3("Room on the roof",1995,"Ruskin bond","Author");
       obj.displayInfo();
   }
}

