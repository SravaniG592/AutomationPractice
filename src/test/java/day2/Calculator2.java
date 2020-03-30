package day2;
import java.util.Scanner;
public class Calculator2 {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Calculator2 cal = new Calculator2();



        cal.addTwoNumbers(num1, num2);
        cal.sub(num1, num2);
        cal.mul(num1, num2);
        cal.div(num1, num2);
        cal.mod(num1, num2);

    }

    public void addTwoNumbers(int a, int b) {

        int sum = a + b;
        System.out.println("The Sum of " + a + "and" + b +"is :"+sum);

    }

    public void sub(int a, int b) {

        int sub = b - a;
        System.out.println("The difference of " + a + "and" + b + "is :" + sub);
    }

    public void mul(int a, int b) {

        int mul = a * b;
        System.out.println("The Mul of " + a + "and" + b + "is :" + mul);
    }

    public float div(int a, int b) {

        int div = b / a;
        System.out.println("The div of " + a + "and" + b + "is :" + div);
        return div;
    }

    public void mod(int a, int b) {
        int mod = b % a;
        System.out.println("The Mod of " + a + "and" + b + "is :" + mod);

    }

}

