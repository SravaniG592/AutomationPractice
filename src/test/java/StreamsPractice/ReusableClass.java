package StreamsPractice;

import java.io.*;
import java.util.Properties;

public class ReusableClass {

    public static void setVal(String key,String value) throws IOException {
        String path= System.getProperty("user.dir")+ File.separator+"testData"+File.separator+"fileName"+ ".properties";//        try {
 try {


     File f = new File(path);

     if (!f.exists()) {
         f.createNewFile();
     }
     FileOutputStream fos = new FileOutputStream(path);
     Properties prop = new Properties();
     prop.setProperty(key, value);
     prop.store(fos, "Test Data");

 }
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }

//public static void getVal(String key,String fileName)
//{
//String value = " ";
//
//
//    try
//    {
//
//        FileInputStream fin = new FileInputStream(path);
//        Properties prop = new Properties();
//        prop.load(fin);
//
//        value = prop.getProperty(key);
//
//
//
//
//

//    }
//    catch(FileNotFoundException fe)
//    {
//        fe.printStackTrace();
//    }
//          return value;
//
//}
//
//
//
//
//
//
//
//}
