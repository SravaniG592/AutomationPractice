package day1;
import java.util.Scanner;

public class Product {

    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter first number :");
System.out.println("Enter second number :");

int num1= sc.nextInt();
int num2= sc.nextInt();

Product p = new Product();

p.product(num1,num2);


    }

    public void product(int x, int y)
    {
        int mul= x * y;
        System.out.println("Multiplication of the numbers :"+mul);

    }

}
