package StringsPractice;

public class Example1 {

    public static void main(String args[])
    {
        String str= "Java Exercises";
        System.out.println("Original string: "+str);

        int index1= str.charAt(1);
        int index2= str.charAt(10);

        System.out.println("The character at position 1 is :"+(char)index1);
        System.out.println("The character at position 10 is :"+(char)index2);
    }

}
