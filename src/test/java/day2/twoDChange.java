package day2;

public class twoDChange {


    public static void main(String args[]) {
        int[][] twodm = {
                {10, 20, 30},
                {40, 50, 60}

        };
        System.out.print("Original array:\n");
        print_array(twodm);

        System.out.print("After changing rows and columns of array:");
        transpose(twodm);
    }
private static void transpose(int [] [] twodm){
 int [] [] newtwodm = new int[twodm[0].length][twodm.length];

 for(int i=0;i<twodm.length;i++){

     for(int j=0;j<twodm[0].length;j++){

            newtwodm[j][i]=twodm[i][j];
     }
 }
print_array(newtwodm);
}
private static void print_array(int[] [] twodm)
{
    for(int i =0;i<twodm.length;i++){
        for(int j=0;j<twodm[0].length;j++){
            System.out.println(twodm[i][j]+ " ");
        }
         System.out.println();
    }
}

}
