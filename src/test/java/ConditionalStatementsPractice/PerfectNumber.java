package ConditionalStatementsPractice;
import java.util.Scanner;
public class PerfectNumber {

public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number :");
    int n= in.nextInt();
    boolean b= isPerfect(n);
    if(b)
        System.out.println("Is a perfect number");
    else
        System.out.println("Not a perfect number");

}

public static boolean isPerfect(int n)
{
    int sum=0;
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
            sum+=i;
    }
     if(n==sum)
         return true;
    return false;

}

}
