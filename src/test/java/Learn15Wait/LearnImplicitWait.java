package Learn15Wait;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class LearnImplicitWait extends BaseTest {

    @Test(priority = 1)
    public void ImplicitWaitDemo() throws InterruptedException {

        driver.get("https://hrm.anhtester.com/");

        driver.findElement(By.id("iusername")).sendKeys("admin01");
        driver.findElement(By.id("ipassword")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Click menu dự án
        driver.findElement(By.xpath("//span[contains(text(),'Dự án')]")).click();

    }

    @Test(priority = 2)
    public void ImplicitWaitDemo1() throws InterruptedException {


        driver.get("https://hrm.anhtester.com/");

        driver.findElement(By.id("iusername")).sendKeys("admin01");
        driver.findElement(By.id("ipassword")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Click menu dự án
        driver.findElement(By.xpath("//span[contains(text(),'Dự án')]")).click();

    }

}
