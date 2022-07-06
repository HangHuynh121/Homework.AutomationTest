package hanghuynh.selenium.bai7.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.sql.Driver;

public class LearnWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        Thread.sleep(4000);
        //driver.manage().window().maximize();
        Thread.sleep(4000);

        driver.get("https://hrm.anhtester.com/");
        Thread.sleep(5000);

        driver.manage().window().maximize();
        driver.navigate().to("https://hrm.anhtester.com/");
        Thread.sleep(4000);


        driver.quit();


        Thread.sleep(3000);

    }
}
