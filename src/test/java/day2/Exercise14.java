package day2;

public class Exercise14 {



    public static void main(String args[])
    {
        String col1= "Stephen edwin king";
        String col2= "walter winchell";
        String col3= "stephen edwin king";

        boolean equals1=col1.equalsIgnoreCase(col2);
        boolean equals2=col1.equalsIgnoreCase(col3);


        System.out.println("\"" +col1 + "\" equals \""+ col2+"\"?" +equals1);
        System.out.println("\""+col1+ "\" equals \"" +col3 +"\"?" +equals2);

    }
}
