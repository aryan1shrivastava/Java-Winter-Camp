import java.util.*;
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LibraryFunctions lb= new LibFunctions();

        student st = new student("Aryan", 5885);
        System.out.println(" ");
        System.out.println("Student Name: "+ st.studentName + " "+"Student UID: "+ st.UID);
        System.out.println(" ");
        int choice = 0;
        do{
            System.out.println("<--Welcome to Library Management-->");

            System.out.println("1.Display Books");
            System.out.println("2.Return Book");
            System.out.println("3.Issue Book ");
            System.out.println("4.Exit:");
            System.out.print("Enter your choice: ");
            try{
                choice= sc.nextInt();
                if(choice<0){
                    throw new myexception("Wrong Entry, Please enter a valid choice");
                }
            }
            catch (myexception e){
                System.out.println(e.getMessage());
            }
            switch (choice){
                case 1:
                    lb.viewBooks();
                    break;
                case 2:
                    lb.returnBook();
                    break;
                case 3:
                    lb.issueBooks();
                    break;
            }
        }while(choice!=4);
    }
}
class student extends LibraryManagement{
    String studentName;
    int UID;

    public student(String studentName, int UID)
    {
        this.studentName = studentName;
        this.UID = UID;
    }
}
