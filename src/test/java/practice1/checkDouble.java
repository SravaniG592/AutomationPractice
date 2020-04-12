package practice1;
import java.util.Scanner;
public class checkDouble {

    public static void main(String args[])
    {
Scanner in = new Scanner(System.in);
System.out.println("Enter first number:");
double num1= in.nextDouble();

System.out.println("Enter second number :");

double num2= in.nextDouble();

if(num1>0 && num1<1 && num2>0 && num2<1)
{
    System.out.println(true);
}
else
    System.out.println(false);



    }



}
