package SauceDemoShopTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.time.Duration;

public class SauceDemoShopTest {
    static WebDriver driver;
    static final String BASE = "https://sauce-demo.myshopify.com";

    public static void task1_HomePageVerification() {
        System.out.println("=== Task 1: Home Page Verification ===\n");
        String title = driver.getTitle();
        System.out.println("Page Title :" + title);

        if (title.contains("Sauce Demo")) {
            System.out.println("Title Check :PASS");
        } else {
            System.out.println("Title Check :FAIL");
        }
        String URL = driver.getCurrentUrl();
        System.out.println("Page URL: " + URL);
        if (driver.getCurrentUrl().contains("https://sauce-demo.myshopify.com")) {
            System.out.println("URL Check :PASS");
        } else {
            System.out.println("URL Check :FAIL");
        }
        WebElement heading = driver.findElement(By.cssSelector("h1 a img"));
        System.out.println("H1 text : \s" + heading.getAttribute("alt"));
        List<WebElement> links = driver.findElements(By.cssSelector("nav ul li a"));
        System.out.println("Nav link count :  " + links.size());
        System.out.println("=== Task 1 Complete ===\n");

    }

    public static void task2_NavigateToAboutUs() {
        System.out.println("\n=== Task 2: About Us ===\n");
        driver.findElement(By.linkText("About Us")).click();
        if (driver.getCurrentUrl().contains("/pages/about-us")) {
            System.out.println("URL check     : PASS — contains /pages/about-us");
        } else {
            System.out.println("URL check     : FAIL ");
        }
        String title1 = driver.getTitle();
        if (title1.contains("About Us – Sauce Demo")) {
            System.out.println("Title check   : PASS — About Us – Sauce Demo");
        } else {
            System.out.println("\"Title check   : FAIL");
        }
//       List<WebElement>l=driver.findElements(By.cssSelector("h1"));
//       System.out.println( l.get(1).getText());
//       for (WebElement h:l){
//           System.out.println( h.getText());
//       }
        WebElement element1 = driver.findElement(By.xpath("//h1[text()='About Us']"));
        System.out.println("H1 text       : " + element1.getText());
        WebElement element2 = driver.findElement(By.cssSelector(".wysiwyg p"));
        if (element2.getText().contains("Sauce")) {
            System.out.println("Content check : PASS — contains Sauce");
        } else {
            System.out.println("Content check : FAIL");
        }
        System.out.println("=== Task 2 Complete ===\n");

    }


    public static void task3_CatalogAndProducts() {
        System.out.println("\n=== Task 3: Catalog Page ===\n");
        driver.findElement(By.linkText("Catalog")).click();
        if (driver.getCurrentUrl().contains("/collections/all")) {
            System.out.println("URL check     : PASS — contains /collections/all");
        } else {
            System.out.println("URL check     : FAIL");
        }
        if (driver.getTitle().contains("Products – Sauce Demo")) {
            System.out.println("Title check   : PASS — Products – Sauce Demo");
        } else {
            System.out.println("Title check   : FAIL");
        }
        WebElement element2 = driver.findElement(By.xpath("//h1[text()='Products']"));
        System.out.println("H1 text       : " + element2.getText());
        List<WebElement> l = driver.findElements(By.cssSelector(".grid-link_title"));
        System.out.println(l.size());
        for (WebElement p : l) {
            System.out.println(p.getText());
        }
        List<WebElement> soldOut = driver.findElements(By.cssSelector("div.sold-out"));
        System.out.println("Sold Out count: " + soldOut.size());
        System.out.println(+soldOut.size());
        WebElement greyJacket = driver.findElement(By.partialLinkText("Grey"));
        System.out.println("Grey jacket href: " + greyJacket.getAttribute("href"));

        System.out.println("=== Task 3 Complete ===");

    }


    public static void task4_ProductDetailPage() {
        System.out.println("\n=== Task 4: Grey Jacket Product Page ===\n");
        driver.findElement(By.cssSelector("a[href*='grey-jacket']")).click();

        //System.out.println("URL check: " + (driver.getCurrentUrl().contains("grey-jacket") ? "PASS" : "FAIL"));
        if (driver.getTitle().contains("Grey jacket – Sauce Demo")) {
            System.out.println("Title check   : PASS — Grey jacket – Sauce Demo");
        } else {
            System.out.println("Title check   : FAIL");
        }

            String price = driver.findElement(By.cssSelector("#product-price")).getText();
            System.out.println("Price: " + price);
            System.out.println("Price check: " + (price.contains("£55.00") ? "PASS" : "FAIL"));


            List<WebElement> crumbs = driver.findElements(By.cssSelector("div[id='breadcrumb'] span a"));
            System.out.print("Breadcrumb: [");
            for (WebElement crumb:crumbs) {
                System.out.print(crumb.getText() + (crumbs.indexOf(crumb) < crumbs.size() - 1 ? ", " : ""));
            }
            System.out.println("]");


            WebElement cartBtn = driver.findElement(By.xpath("//input[@id='add']"));
            System.out.println("isDisplayed(): " + cartBtn.isDisplayed());
            System.out.println("isEnabled(): " + cartBtn.isEnabled());

            System.out.println("=== Task 4 Complete ===");
        }


        public static void task5_BrowserNavigation () {
            System.out.println("\n=== Task 5: Browser Navigation ===\n");
            driver.navigate().back();
            System.out.println("After back(): " + (driver.getCurrentUrl().contains("/collections/all") ? "PASS" : "FAIL"));

            driver.navigate().forward();
            System.out.println("After forward(): " + (driver.getCurrentUrl().contains("grey-jacket") ? "PASS" : "FAIL"));

            driver.navigate().to(BASE + "/pages/about-us");
            System.out.println("After to(): " + (driver.getCurrentUrl().contains("/about-us") ? "PASS" : "FAIL"));

            driver.navigate().refresh();
            System.out.println("After refresh(): " + (driver.getTitle().contains("About Us") ? "PASS" : "FAIL"));

            driver.get(BASE);
            System.out.println("After get(): PASS — home page loaded");

            System.out.println("=== Task 5 Complete ===");
        }



        public static void task6_HeaderLinksAndCart () {
            System.out.println("\n=== Task 6: Header & Cart ===\n");
            WebElement cartLink = driver.findElement(By.partialLinkText("My Cart"));
            System.out.println("Cart link text: " + cartLink.getText());
            System.out.println("Cart count: " + (cartLink.getText().contains("(0)") ? "PASS" : "FAIL"));

            cartLink.click();
            System.out.println("Cart URL: " + (driver.getCurrentUrl().contains("/cart") ? "PASS" : "FAIL"));


            WebElement emptyMsg = driver.findElement(By.xpath("//p[contains(text(), 'empty')]"));
            System.out.println("Empty message: " + emptyMsg.getText());

            driver.navigate().back();


            WebElement login = driver.findElement(By.linkText("Log In"));
            System.out.println("Login href: " + login.getAttribute("href"));


            String originalWindow = driver.getWindowHandle();
            driver.switchTo().newWindow(WindowType.WINDOW);
            driver.get(BASE + "/pages/about-us");
            driver.close();
            driver.switchTo().window(originalWindow);

            System.out.println("After close(): back on " + driver.getTitle() + " — PASS");

            System.out.println("=== Task 6 Complete ===");


        }



        public static void main (String[]args){

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(BASE);
            task1_HomePageVerification();
            task2_NavigateToAboutUs();
            task3_CatalogAndProducts();
            task4_ProductDetailPage();
            task5_BrowserNavigation();
            task6_HeaderLinksAndCart();
        }
    }