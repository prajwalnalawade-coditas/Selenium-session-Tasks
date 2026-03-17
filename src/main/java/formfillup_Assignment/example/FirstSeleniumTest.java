package formfillup_Assignment.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstSeleniumTest {
    WebDriver driver;
    public void setupbrowser(){
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver
driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
    }
    public void gotoregistration(){
        driver.findElement(By.className("ico-register")).click();
    }
    public void clickregister (){
        driver.findElement(By.id("register-button")).click();
    }
    public void filldetails(String fname, String lname,String email, String pwd){
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys(fname);
        driver.findElement(By.id("LastName")).sendKeys(lname);
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(pwd);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(pwd);
    }
    public static void main(String[] args){
        FirstSeleniumTest test=new FirstSeleniumTest();
      test.setupbrowser();
      test.gotoregistration();
    test.filldetails("praj","SDET","p@gmail.com","123456");
     test.clickregister();
    }
}


//protocols
//mai architecture
//        maven
