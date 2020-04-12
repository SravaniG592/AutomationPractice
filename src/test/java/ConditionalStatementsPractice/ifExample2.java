package ConditionalStatementsPractice;
import java.util.Scanner;
public class ifExample2 {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number:");
        double n= in.nextDouble();


        if (n>0 )
        {
            if (n<1)
            {
                System.out.println("Number is positive small");

            }
            else if(n>1000000)
            {
                System.out.println("Number is positive large");
            }
            else
                System.out.println("Number is a positive number");


        }
        else if(n<0)
        {
            if(Math.abs(n)<1)
            {
                System.out.println("Negative small");
            }
            else if(Math.abs(n)>1000000)
            {
                System.out.println("Negative large");
            }

            else
                System.out.println("Negative number");



        }



    }
}
