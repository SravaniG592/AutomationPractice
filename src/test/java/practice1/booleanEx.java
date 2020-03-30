package practice1;
import java.util.Scanner;
public class booleanEx {


public static void main (String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter first number :");

int num1 = sc.nextInt();

System.out.println("Enter second number :");

int num2 = sc.nextInt();

System.out.println("Enter third number :");

int num3 = sc.nextInt();

System.out.println("The result is :"+sumoftwo(num1,num2,num3));
System.out.print("\n");


}

public static boolean sumoftwo(int p,int q, int r)
{
    return ((p+q)==r || (q+r)==p || (p+r)==q);

}

}
