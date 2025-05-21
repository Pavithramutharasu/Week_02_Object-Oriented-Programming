
public class Courses {
   String courseName;
   int duration;
   public Courses(String courseName,int duration){
       this.courseName = courseName;
       this.duration = duration;
   }
   public void displaydetails(){
       System.out.println("Course Name : "+courseName);
       System.out.println("Duration : "+duration);
   }
}
class OnlineCourse extends Courses{
   String platform;
   boolean isRecorded;
   public OnlineCourse(String courseName,int duration,String platform, boolean isRecorded){
       super(courseName,duration);
       this.platform = platform;
       this.isRecorded = isRecorded;
   }
   public void displaydetails(){
       System.out.println("Course Name : "+courseName);
       System.out.println("Duration : "+duration);
       System.out.println("Platform : "+platform);
       System.out.println("Is Recorded? : "+isRecorded);
   }
}
class PaidOnlineCourse extends OnlineCourse{
   int fee;
   int discount;
   public PaidOnlineCourse(String courseName,int duration,String platform, boolean isRecorded,int fee,int discount){
       super(courseName,duration,platform,isRecorded);
       this.fee = fee;
       this.discount = discount;
   }
   public void displaydetails(){
       System.out.println("Course Name : "+courseName);
       System.out.println("Duration : "+duration);
       System.out.println("Platform : "+platform);
       System.out.println("Is Recorded? : "+isRecorded);
       System.out.println("Fee : "+fee);
       System.out.println("Discount : "+discount);
   }
   public static void main(String[] args){
       Courses obj = new Courses("Data Science",2);
       obj.displaydetails();
       OnlineCourse obj1 = new OnlineCourse("Data Science",2,"Online",true);
       obj1.displaydetails();
       PaidOnlineCourse obj2 = new PaidOnlineCourse("Data Science",2,"Online",true,110000,5000);
       obj2.displaydetails();
   }
}

