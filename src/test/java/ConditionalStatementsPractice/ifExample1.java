package ConditionalStatementsPractice;
import javax.swing.*;
import java.util.Scanner;
public class ifExample1 {

    public static void main(String args[])
    {
Scanner in = new Scanner(System.in);
System.out.println("Enter a number :");
int i = in.nextInt();

if(i==0)
{
    System.out.println("NUmber is zero");

}
else if(i>0)
        {
            System.out.println("Number is positive");
        }
else
{
    System.out.println("Number is negative");
}




    }


}
