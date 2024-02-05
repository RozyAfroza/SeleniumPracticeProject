package test1seleniumclass1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class LaunchChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.6.3");
        Thread.sleep(3000);
        driver.quit();
    }
}
