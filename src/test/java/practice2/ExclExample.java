package practice2;

public class ExclExample {

    public static void main(String args[]) {

        System.out.println("Starting....");

        try {


            String name ="Sravani";
            int c=6;

            int noName = Integer.parseInt(name);
            System.out.println(name+c);


        }

        catch (Exception e)
        {
            e.printStackTrace();
        }


System.out.println("Ending..");

    }
}
