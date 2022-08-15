package Learn15Wait;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LearnExplicitWait extends BaseTest {

    @Test(priority = 1)
    public void EmplicitWaitDemo1() throws InterruptedException {

        driver.get("https://hrm.anhtester.com/");

        driver.findElement(By.id("iusername")).sendKeys("admin01");
        driver.findElement(By.id("ipassword")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        //Chờ đợi đến khi element tìm thấy tỏng DOm và sẵn sàng hiền thị để thao tác
        //Đối tượng By
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Dự án')]")));

        //Click menu dự án
        driver.findElement(By.xpath("//span[contains(text(),'Dự án')]")).click();

    }

    @Test(priority = 2)
    public void EmplicitWaitDemo2() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce.anhtester.com/");

        driver.findElement(By.xpath("//i[@class = 'la la-close fs-20']")).click();

        WebElement AutoMotoMenu = driver.findElement(By.xpath("//span[normalize-space()='Automobile & Motorcycle']"));

        AutoMotoMenu.click();
    }


    WebDriverWait wait;
    @Test(priority = 3)
    public void EmplicitWaitDemo3() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://ecommerce.anhtester.com/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class = 'la la-close fs-20']")));

        driver.findElement(By.xpath("//i[@class = 'la la-close fs-20']")).click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement AutoMotoMenu = driver.findElement(By.xpath("//span[normalize-space()='Automobile & Motorcycle']"));

        AutoMotoMenu.click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }



}
