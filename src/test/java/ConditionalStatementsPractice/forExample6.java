package ConditionalStatementsPractice;
import java.util.Scanner;
public class forExample6 {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2 !=0)
            {
                System.out.println("The odd numbers are : "+i);
                sum+=i;
             }
                    }

        System.out.println("The sum upto"+n+ "are :" +sum);


    }
}
