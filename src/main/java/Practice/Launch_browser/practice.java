package Practice.Launch_browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class practice {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        String title= driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println("title"+title);
        System.out.println("url"+url);
        driver.close();

    }
}
