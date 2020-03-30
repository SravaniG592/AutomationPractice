package practice1;
import java.util.Scanner;
public class checkEvenOdd {

    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");

int n = sc.nextInt();
checkEvenOdd ce = new checkEvenOdd();
ce.checkEO(n);
    }

    public void checkEO(int n){
        String even ="1";
        String odd ="0";
        if (n%2 ==0){

            System.out.println("Number is even"+even);
        }
        if (n%2 !=0){
            System.out.println("Number is odd "+odd);
        }
    }
}
