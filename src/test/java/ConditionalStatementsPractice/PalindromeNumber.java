package ConditionalStatementsPractice;
import java.util.Scanner;
public class PalindromeNumber {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");

        int n=in.nextInt();

        int s=0,r;
        int t=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
         if(t==s)
         {
             System.out.println("Palindrome number");

         }
         else
             System.out.println("Not a palindrome");
    }
}
