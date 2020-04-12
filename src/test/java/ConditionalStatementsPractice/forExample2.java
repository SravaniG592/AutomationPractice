package ConditionalStatementsPractice;

import java.util.Scanner;

public class forExample2 {

public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n= in.nextInt();
    int sum=0;
for (int i=0;i<n;i++)
{
    System.out.println(i);
    sum+=i;
}

    System.out.println("The sum of is :"+sum);

}

}
