
import java.util.*;
public class Course {
   String courseName;
   private int duration;
   private int fee;
   static String instituteName = "SRM University";
   public Course(String courseName,int duration,int fee){
       this.courseName = courseName;
       this.duration = duration;
       this.fee = fee;
   }
   public void displayCourseDetails(){
       System.out.println("Course Name : "+courseName+" Duration(in years) : "+duration+" Fee : "+fee+" Institute Name : "+instituteName);
   }
   public static void updateInstituteName(String newName){
       instituteName = newName;
   }
   public static void main(String[] args){
       Course obj = new Course("ads",2,110000);
       obj.displayCourseDetails();

       updateInstituteName("Anna Institute");

       obj.displayCourseDetails();
   }
}

