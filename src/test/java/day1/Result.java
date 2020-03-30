package day1;
import java.util.Scanner;
public class Result {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Result r = new Result();
r.mul(num1,num2);


    }

    public int mul(int n1, int n2) {
        int multiply = n1 * n2;

        System.out.println("The multiplication of" + n1 +"and " + n2 +":" + multiply);
        return multiply;

    }
}