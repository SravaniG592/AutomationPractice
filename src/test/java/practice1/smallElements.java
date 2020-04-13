package practice1;
import java.util.*;
public class smallElements {

public static void main(String args[])
{
    Integer [] arr= new Integer[] {1,4,17,725,3,100};
    int k=3;
    System.out.println("Original array :");
    System.out.println(Arrays.toString(arr));
    System.out.println(k+"smallest elements of array are");
    Arrays.sort(arr);
    for (int i=0;i<k;i++)
    {
        System.out.println(arr[i] + " ");
    }




}

}
