 public class Student1 {
   private static String universityName = "Global University";
   private static int totalStudents = 0;
   private final int rollNumber;
   private String name;
   private String grade;

   public Student1(String name, int rollNumber, String grade) {
       this.rollNumber = rollNumber;
       this.name = name;
       this.grade = grade;
       totalStudents++;
   }
   public static void displayTotalStudents() {
       System.out.println("Total Students Enrolled: " + totalStudents);
   }
   public void displayStudentDetails() {
       System.out.println("University: " + universityName + ", Roll Number: " + rollNumber +
               ", Name: " + name + ", Grade: " + grade);
   }
   public static void main(String[] args) {
       Student1 s1 = new Student1("Alice", 101, "A");
       Student1 s2 = new Student1("Bob", 102, "B");

       if (s1 instanceof Student1) s1.displayStudentDetails();
       if (s2 instanceof Student1) s2.displayStudentDetails();

       Student1.displayTotalStudents();
   }
}

