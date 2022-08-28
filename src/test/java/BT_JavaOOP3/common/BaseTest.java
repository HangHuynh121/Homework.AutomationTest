package BT_JavaOOP3.common;


import hanghuynh.utils.WebUI;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeTest
    public static void createDriver() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        //Set timeout chờ đợi ngầm định 10s
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Bổ trợ code chạy ổn định hơn
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));

//        WebUI UI = new WebUI();
//        UI.LogConsole("creatDriver");
*/
    }
    @AfterTest

    public static void  closeDriver(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); //reset timeout

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(driver != null){
            driver.quit();
        }
    }

}



