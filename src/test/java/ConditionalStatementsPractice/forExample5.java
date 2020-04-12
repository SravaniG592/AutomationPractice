package ConditionalStatementsPractice;
import java.util.Scanner;
public class forExample5 {

public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n= in.nextInt();


    for(int i=0;i<=10;i++)
    {
        System.out.println(n+" X" +i+ "="+n*i);
    }
}


}
