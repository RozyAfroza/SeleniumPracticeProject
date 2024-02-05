import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/index.html");
        Thread.sleep(3000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        List<WebElement> webElements = driver.findElements(By.tagName("input"));
        System.out.println("Total Links: " +webElements.size());
        Thread.sleep(3000);
        driver.quit();
    }
}
