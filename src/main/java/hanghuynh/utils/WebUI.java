package hanghuynh.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebUI {

    public static WebDriver driver;

    public WebUI(WebDriver driver){

        WebUI.driver = driver;

    }


    //openURL
    public static  void openURL(String url){

        driver.get(url);
        LogConsole("Open URL: " + url);
    }

    //Log console, ghi lại các bước
    public static void LogConsole(Object messeger){

        System.out.println(messeger);

    }

    //Đợi
    private static  int TIMEOUT = 10;
    public static void clickElement(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        driver.findElement(by).click();

        sleep(step_time);

        LogConsole("Click Element: " + by );
    }

    //click Element
    public static void clickElement(By by, long timeout){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        driver.findElement(by).click();

        sleep(step_time);

        LogConsole("Click Element: " + by );

    }
    //2 hàm đa hình

    //Nhập data
    public static void  setText(By by, String value){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        driver.findElement(by).sendKeys(value);

        sleep(step_time);

        LogConsole("Set Text : " + value + "  on  " + by);
    }

    //Lấy text verify
    public static String getElementText(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        String text =  driver.findElement(by).getText();

        LogConsole("Get Text of Element: " + text);

        return text ;//Trả về giá trị kiểu String

    }

    //Verify



    //Đợi phần tử hiển thị
    public static void  waitForElementVisible(By by, String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    //Move to element
    public static void moveToElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        Actions action = new  Actions(driver);

        action.moveToElement(element).build().perform();

        LogConsole("Move to element: " + element);

    }

    //Thead sleep

    private final static  int timeout = 10;
    private final static int step_time = 0;
    public  static void sleep (double second) {
        try {
            Thread.sleep((long) (1000 * second));
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }


}
