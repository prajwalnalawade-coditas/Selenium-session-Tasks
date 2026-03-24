package Practice.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.id("Email")).sendKeys("praj");
        driver.findElement(By.id("Password")).sendKeys("praj1234");
        driver.findElement(By.id("Log in")).click();

    }

}
