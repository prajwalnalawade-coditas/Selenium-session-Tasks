package Practice.Dropdown_handling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Dropdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://practice.expandtesting.com/dropdown");
        WebElement dropdown= driver.findElement(By.id("country"));
        Select s=new Select(dropdown);
        s.selectByVisibleText("India");
    }
}
