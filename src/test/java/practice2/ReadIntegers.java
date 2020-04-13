

package practice2;
import java.util.Scanner;
public class ReadIntegers {

    public static void main (String args[])
    {
Scanner in = new Scanner(System.in);

int count =0;
String tmp = "0";
System.out.println("input a sentence :");

char ch[] = in.nextLine().toCharArray();

for (int i=0; i<ch.length; i++)
{
    while(i<ch.length && (Character.isDigit(ch[i])))
    {
        tmp += ch[i];
        i++;
    }
count += Integer.valueOf(tmp);
    tmp="0";

}
    System.out.println("\n The sum value is :");
System.out.println(count);


    }


}

