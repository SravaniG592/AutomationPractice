

package day1;
import java.util.Scanner;
public class ReverseAWord {


    public static void main(String args[]) {
Scanner sc= new Scanner(System.in);
System.out.println("\n Input a word :");

String word = sc.nextLine();
word = word.trim();
char ch[] = word.toCharArray();
    String result = " " ;
for ( int i = ch.length; i>=0; i--){
       result += ch[i];
    
        }
System.out.println("Reversed word :" +result.trim());
    }
}