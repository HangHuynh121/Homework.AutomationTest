package Learnalert.popupwindown.iFrame;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.swing.plaf.TableHeaderUI;

public class LearnAlert extends BaseTest {
    @Test
    public void HocAlert1 () throws InterruptedException {
        driver.get("https://demo.anhtester.com/javascript-alert-box-demo.html");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//p[normalize-space()=\"Let's try to see all the three examples below\"]//following-sibling::div[1]//div[2]/button")).click();
        Thread.sleep(1000);

        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);

//        driver.switchTo().alert().accept(); // nhấn nút ok submit
//        Thread.sleep(1000);

        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//p[normalize-space()=\"Let's try to see all the three examples below\"]//following-sibling::div[2]/div[2]/button")).click();
        Thread.sleep(1000);

        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);

        driver.switchTo().alert().accept(); // nhấn nút ok submit
        Thread.sleep(3000);

//        driver.switchTo().alert().dismiss();
//        Thread.sleep(2000);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Text under [click me] button on [Java Script Confirm Box] item:");
        System.out.println(driver.findElement(By.xpath("//p[normalize-space()=\"Let's try to see all the three examples below\"]//following-sibling::div[2]/div[2]/p[3]")).getText());
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("hanghuynh");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();


        String act = driver.findElement(By.xpath("//p[normalize-space()=\"Let's try to see all the three examples below\"]//following-sibling::div[3]/div[2]/p[3]")).getText();
        String exp = "You have entered 'hanghuynh' !";
        Thread.sleep(1000);

       SoftAssert SA = new SoftAssert();

       System.out.println("Act:" + act);
       System.out.println("Exp:" + exp);

       SA.assertEquals(act,exp);

       SA.assertAll();

       Thread.sleep(3000);
    }
}
