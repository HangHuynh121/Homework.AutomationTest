package Learn11Assert;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHardAssertion extends BaseTest {
    @Test(priority = 1)
    public void RunTest() {

        driver.get("https://anhtester.com");

        String expectedTitle = "Anh Tester - Automation Testing";
        String actualTitle = driver.getTitle();

        System.out.println("*** Checking For The Title ***");

        Assert.assertTrue( driver.findElement(By.id("btn-login")).isEnabled(),"Button Login is not enable");
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.id("btn-login")).click();
    }
}
