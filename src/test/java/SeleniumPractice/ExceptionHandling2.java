package SeleniumPractice;

public class ExceptionHandling2 {


    public static void main(String args[])
    {
        int i,j,k=0;
        int a[]= new int[4];
        i=8;
        j=0;
        try
        {
            k=i/j;
            for(int o=0;o<=4;o++)
            {
                a[o]=o+1;
            }
            for (int value : a)
            {
                System.out.println(value);
            }



        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero"+e);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Max values allowed is 4"+e);
        }

        catch(Exception e)
        {
            System.out.println("unknown exception");
        }
        System.out.println(k);
    }
}
