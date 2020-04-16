package StreamsPractice;

import java.io.*;

public class FileHandling1 {

    public static void main(String args[]) throws IOException {
       // C:\Users\Sravani_Admin\Ferrari\testData

          String path= System.getProperty("user.dir")+File.separator+"testData"+File.separator+"Test.txt";
          System.out.println("Current directory :"+path);





//        String path= System.getProperty("user.dir")+ File.separator+ "testData "+File.separator+ "Test.txt";
    File f= new File(path);

            f.createNewFile();
            System.out.println("File successfully created");

//        Writer w= new FileWriter(path);
//        BufferedWriter bw= new BufferedWriter(w);
//
//        bw.write("Hello all happy learning");
//        bw.newLine();
//        for(int i=0;i<=10;i++)
//        {
//            bw.write(i+ "Go Corona");
//            bw.newLine();
//        }
//
//
//        for(int i=0;i<10;i++)
//        {
//            bw.write(i);
//        }
//
//        bw.flush();
//        bw.close();
//
//        Reader r = new FileReader(path);
//        BufferedReader br= new BufferedReader(r);
//
//        String x= " ";
//        while((x= br.readLine()!=null))
//        {
//            System.out.println(x);
//        }
//
//
//
//        br.close();
//


    }
}
