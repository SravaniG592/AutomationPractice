package day1;

import java.nio.charset.*;

public class charSetObjct {

public static void main(String args[]){

    System.out.println("List of available charsets:");
    for (String str : Charset.availableCharsets().keySet()){

        System.out.println(str);

    }

}


}
