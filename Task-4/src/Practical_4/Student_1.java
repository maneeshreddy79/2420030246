package Practical_4;

public class Student_1 {
 public static void main(String[] args) {
   Access_Modifiers s1= new Access_Modifiers();

    
     s1.setDetails(101, 'A', "Maneesh");

 
     System.out.println("Public variable name (changed): " + s1.name);
     
     System.out.println("Protected variable grade (changed): " + s1.grade);
     //s1.rollNumber=13;

     s1.showDetails();
 }
}
