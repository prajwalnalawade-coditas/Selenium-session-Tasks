package Practice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class abc {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
     //   wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn"))).click();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium webdriver");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
     //   driver.findElement(By.cssSelector("#email").findElement());
    }
}
