package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ExceptionHandling {

    WebDriver driver;


    public void example()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.get("https://www.hdfcbank.com/");
driver.findElement(By.xpath(("//button[text()='Login'])[2]"))).click();

driver.close();



    }


}
