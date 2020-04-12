package ConditionalStatementsPractice;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= in.nextInt();

        boolean isPrime=true;

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(n+"is a prime number");
        }
        else
            System.out.println(n+" not a prime number");



    }
}
