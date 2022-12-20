import java.util.*;
public class Assign1_Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str1= sc.nextLine();

        System.out.println("Enter start index: ");
        int s = sc.nextInt();
        System.out.println("Enter end index: ");
        int e = sc.nextInt();

        String subStr1 = str1.substring(s,e);

        System.out.println("Substring is: " + subStr1);
    }
}
