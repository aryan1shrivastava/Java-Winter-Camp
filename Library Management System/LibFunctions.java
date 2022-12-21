import java.util.*;
public class LibFunctions implements LibraryFunctions {
   public void viewBooks(){
       System.out.println("Available books:");
       System.out.println("Do Epic Shit");
       System.out.println("Atomic Habits");
       System.out.println("DSA in Java");
   }
   public void returnBook(){
       System.out.println("Enter the book you want to return: ");
       Scanner sc= new Scanner(System.in);
       String s= sc.nextLine();
       System.out.println("Return Successful");
   }
   public void issueBooks(){
       System.out.println("Enter the book you want to issue:");
       Scanner sc= new Scanner(System.in);
       String s= sc.nextLine();

       System.out.println("Book Issued!");
   }


}
