package ConditionalStatementsPractice;

import java.util.Scanner;

public class ifExample4 {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number :");
        int x= in.nextInt();
        System.out.println("Enter second number :");
        int y= in.nextInt();
        System.out.println("Enter third number :");
        int z= in.nextInt();

        if(x<y && x<z)
        {
            System.out.println("Increasing order");
        }

         else if(x>y && x>z)
        {
            System.out.println("Decreasing order");
        }
         else
             System.out.println("neither increasing or decreasing order");
    }
}
