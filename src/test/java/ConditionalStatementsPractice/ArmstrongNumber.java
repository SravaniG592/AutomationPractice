package ConditionalStatementsPractice;
import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= in.nextInt();
        int sum=0,r;
        int temp=n;

       while(n>0)
       {
           r= n%10;
           n=n/10;
           sum+=r*r*r;
       }
       if(temp==sum)
           System.out.println("Its an Armstrong number");
       else
           System.out.println("Not an Armstrong number");

    }

}
