package day2;
import javax.swing.*;
import java.util.Scanner;
public class twoDArray {

    public static void main(String args[])
    {
        boolean [] [] array ={{ true,false,true},
                             {false,true,false}};

        int row_lengths=array.length;
        int column_length=array[0].length;

        for(int i=0;i<row_lengths;i++){
            for(int j=0;j<column_length;j++)
            {
                if (array[i][j]) {
                System.out.print(" t");
            }
               else {
                   System.out.print("f");



            }
            }
        }
    System.out.println();

    }
}
