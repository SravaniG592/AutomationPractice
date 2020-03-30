
package day1;
import java.util.Scanner;


public class AddingStrings {



    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first name: ");


        String fName= sc.next();
        System.out.println("Enter last name: ");
        String lName= sc.next();
        AddingStrings ad= new AddingStrings();
        ad.Names(fName,lName);


    }
  public void Names(String a, String b){

      String fullName= a + b;

      System.out.println("Full name is and :" +fullName);

  }

}
