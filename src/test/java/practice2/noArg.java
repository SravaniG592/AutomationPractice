package practice2;

public class noArg {

    int i;

    private noArg()
    {
         i=5;
         System.out.println("Object created and i=" +i);

    }
public static void main(String args[])
{
    noArg na= new noArg();


}



}
