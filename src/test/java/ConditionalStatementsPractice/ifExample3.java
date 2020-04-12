package ConditionalStatementsPractice;
import java.util.Scanner;
public class ifExample3 {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1= in.nextInt();
        System.out.println("Enter second number:");
        int n2= in.nextInt();
        System.out.println("Enter third number:");
        int n3= in.nextInt();

     if(n1==n2 && n1==n3)
     {
         System.out.println("All numbers are equal");
     }
     else if(n1==n2 || n1==n3||n2==n3)
     {
         System.out.println("neither all are equal or different");
     }
     else
         System.out.println("All numbers are different");
    }
}
