package ConditionalStatementsPractice;
import java.util.Scanner;
public class ifExample5 {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1= in.nextInt();
        System.out.println("Enter second number:");
        int n2= in.nextInt();

        if(Math.abs(n1-n2)<=0.01)
        {
            System.out.println("Numbers are same");
        }
        else
            System.out.println("They are different");


    }
}
