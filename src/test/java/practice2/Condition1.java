package practice2;
import java.util.Scanner;
public class Condition1 {

public static void main(String args[] ){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number :");
    int num = sc.nextInt();

    Condition1 c = new Condition1();
    c.checkNum(num);


}
public void checkNum(int n){

    if (n>0){
        System.out.println("Positive number");
    }
    else if(n==0)
        System.out.println("Zero");

    else
        System.out.println("Negative number");

}

}
