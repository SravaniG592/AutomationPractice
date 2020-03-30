package practice1;
import java.util.Scanner;
public class Exercise53 {


   public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Input first number :");
int x = sc.nextInt();

System.out.print("Input second number :");
int y = sc.nextInt();

System.out.print("Input third number :");
int z = sc.nextInt();

   }
public static boolean test(int p,int q, int r, boolean xyz)
{
  if (xyz)
      return (r > q);
  return (q > p && r > q);

}

}
