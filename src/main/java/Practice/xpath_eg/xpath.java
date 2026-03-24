package Practice.xpath_eg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class xpath {
    public static void main(String[] args) {
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc");
        //WebElement exactVisa = By.xpath("//*[contains(text(),'Visa')]").findElement(driver);
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
    }
}