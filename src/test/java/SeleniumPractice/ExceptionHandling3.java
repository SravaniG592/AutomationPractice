package SeleniumPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling3 {


    public static void main(String args[]) throws IOException {
        int i,j=1,k=0;



        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        i=0;


        try
        {
            System.out.println("Enter a number ");
            k=i/j;

            j=Integer.parseInt(br.readLine());
        }

        catch(IOException e)
        {
            System.out.println("Some IO errors"+e);
        }


        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by 0"+e);
        }


        catch(Exception e)
        {
            System.out.println("Unknown exception "+e);
        }


        finally
        {
            br.close();
            System.out.println("Finally bye");

        }
        System.out.println(k);
    }
}
