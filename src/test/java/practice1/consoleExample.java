package practice1;
import java.io.Console;
public class consoleExample {
    public static void main(String args[]){
      Console c= System.console();

      System.out.println("Enter Username :");
      String name = c.readLine();
      System.out.println("Welcome "+name);


    }

}
