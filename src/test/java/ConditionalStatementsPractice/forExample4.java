package ConditionalStatementsPractice;
import java.util.Scanner;
public class forExample4 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number :");
        int n= in.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("Number is " +i+ " and the cube of the number is :"+ (i*i*i));
        }



    }
}
