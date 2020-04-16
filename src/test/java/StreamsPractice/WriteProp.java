package StreamsPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProp {

    public static void main(String args[]) throws IOException {
String path = System.getProperty("user.dir")+ File.separator+"testData"+File.separator+"config.properties";
 FileOutputStream fos= new FileOutputStream(path);
        Properties prop = new Properties();
        prop.setProperty("url","www.google.com");
        prop.store(fos,"writing to a file");
        System.out.println(prop.getProperty("url"));




    }
}
