package practice1;
import java.util.Scanner;
public class Exercise54 {



    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Input the first number :");

int num1= sc.nextInt();

System.out.println("Input second number:");
int num2 = sc.nextInt();

System.out.println("Input third number :");
int num3= sc.nextInt();
System.out.print("The result is:"+test_last_digit(num1,num2,num3,true));


    }

public static boolean test_last_digit(int p, int q, int r,boolean xyz)
    {
       return (p% 10 ==q%10) || (p%10 == r%10) || (q%10 == r%10);
    }



}
