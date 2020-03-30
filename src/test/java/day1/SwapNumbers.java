package day1;

import java.util.Scanner;
public class SwapNumbers {
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter first number :");

int num1= sc.nextInt();

System.out.println("Enter second number :");

int num2= sc.nextInt();
System.out.println( "Numbers before swapping"+num1 +num2);
SwapNumbers sn = new SwapNumbers();

sn.SwappingNumbers(num1,num2);
System.out.println("Number after swapping " +num1 +num2);
    }

    public void SwappingNumbers(int n1, int n2){

       int temp =n1;
        n1=n2;

        n2= temp;


    }

}
