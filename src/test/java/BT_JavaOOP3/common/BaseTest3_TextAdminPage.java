package BT_JavaOOP3.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest3_TextAdminPage {

    public static WebDriver driver;

    @BeforeClass
    public static void createDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));


        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(5000);

        driver.findElement(By.id("email")).sendKeys("hanghuynh121@gmail.com"); // input [Email] textbox
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123456"); //input [Password] textbox
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //click [Login] button
        Thread.sleep(2000);
    }

    @AfterClass

    public static void  closeDriver(){
        if(driver != null){
            driver.quit();
        }
    }
}
