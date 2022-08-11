package Learn13alert.popupwindown.iFrame;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class popupMenu extends BaseTest {
    @Test
    public void TestPopup() throws InterruptedException {

        driver.get("http://demo.guru99.com/popup.php");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("hanghuynh121@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        Thread.sleep(30000);

    }
}
