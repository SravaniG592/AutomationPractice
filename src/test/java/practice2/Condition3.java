package practice2;
import java.util.Scanner;
public class Condition3 {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input a number less than ten billion :");

        if(sc.hasNextLong())
        {
            long n =sc.nextLong();
            if(n <0)
            {
                 n*=-1;
            }
            if (n>=10000000000L)
            {
                System.out.println("Number is greater or equals 1000000000!");
            }
            else
            {
                int digits=1;
                if(n>=10 && n<100)
                {
                    digits=2;
                }
                else if(n>=100 && n<=1000)
                {
                    digits= 3;
                }
                else if (n>=1000 && n<=100000)
                {
                    digits=4;
                }
                 else if(n>=100000 && n<=1000000)
                {
                    digits=5;
                }
                else if(n>=1000000 && n<=10000000)
                {
                    digits= 6;
                }
                 else if(n>=10000000 && n<=100000000)
                {
                    digits=7;
                }
                else if(n>=100000000 && n<=1000000000)
                {
                    digits=8;
                }
                

            }


        }
    }
}
