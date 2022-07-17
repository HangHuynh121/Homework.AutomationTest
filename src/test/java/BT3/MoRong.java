package BT3;

import BT2.AddCategories_priority;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;


public class MoRong extends AddCategories_priority {

    @Test (priority =  3)
    public void EditAddCategory() throws InterruptedException, AWTException{
        driver.get("https://ecommerce.anhtester.com/admin/categories");
        Thread.sleep(1000);

        Actions act = new Actions(driver);
        Robot RB = new Robot();

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Hanghuynh123"); //input [Search] textbox
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='box-inline pad-rgt pull-left']//div")).submit(); //submit [Search] textbox
        Thread.sleep(1000);

        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/a[1]")).click(); //click [Edit] button
        Thread.sleep(1000);


        //EDIT [NAME] TEXTBOX
            //click [Name] textbox
            driver.findElement(By.xpath("//label[contains(text(),'Name')]/following-sibling::div/input")).click();//input [Name] textbox
            Thread.sleep(1000);

           //Ctrl + a đôi đen test on [Name] Text box
            act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
            Thread.sleep(1000);

            //input "Hanghuynh456" on [Name] textbox
            driver.findElement(By.xpath("//label[contains(text(),'Name')]/following-sibling::div/input")).sendKeys("Hanghuynh456");
            Thread.sleep(1000);


        //EDIT [Ordering Number] TEXTBOX
            //click [Ordering Number] textbox
            driver.findElement(By.xpath("//input[@id='order_level']")).click();
            Thread.sleep(1000);

            //Ctrl + a đôi đen test on [Ordering Number] Text box
            act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
            Thread.sleep(1000);

            //input "3" on [Name] textbox
            driver.findElement(By.xpath("//input[@id='order_level']")).sendKeys("3");
            Thread.sleep(1000);

        //EDIT [Banner] Browser
            //Di chuyển trỏ đến [740,611]
            RB.mouseMove(740, 611);
            Thread.sleep(2000);
            RB.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            RB.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(2000);
            //Chọn Banner mới
            RB.mouseMove(656,354);
            RB.delay(1000);
            RB.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            RB.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(2000);
            //click [Add File] button
            RB.mouseMove(1380,770);
            RB.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            RB.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(2000);

        //CLICK [Save] BUTTON
            driver.findElement(By.xpath("//button[normalize-space()='Save']")).click(); //click [Save] button
            Thread.sleep(2000);

    }

    //Check text edit category success
    @Test (priority = 4)
    public void CheckTextEditCategory() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/admin/categories");
        Thread.sleep(1000);

        SoftAssert SA = new SoftAssert();

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Hanghuynh456"); //input [Search] textbox
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='box-inline pad-rgt pull-left']//div")).submit(); //submit [Search] textbox
        Thread.sleep(1000);

        //Check text [#] colum
        String expNo = "1";
        String actNo = driver.findElement(By.xpath("//td[@class='footable-first-visible'][normalize-space()='1']")).getText();
        Thread.sleep(1000);

        System.out.println("1. Check text [#] colum");
        System.out.println("Exp: " + expNo + "/ Act: " + actNo);
        System.out.println("_________________________________");

        SA.assertEquals(actNo,expNo);
        Thread.sleep(1000);

        //Check text [Name] colum
        String expName = "Hanghuynh456";
        String actName = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
        Thread.sleep(1000);

        System.out.println("2. Check text [Name] colum");
        System.out.println("Exp: " + expName + "/ Act: " + actName);
        System.out.println("_________________________________");

        SA.assertEquals(actName,expName);
        Thread.sleep(1000);

        //Check text [Parent Category] colum
        String expParentCa = "Laptop & Accessories";
        String actParentCa = driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
        Thread.sleep(1000);

        System.out.println("3. Check text [Parent Category] colum");
        System.out.println("Exp: " + expParentCa + "/ Act: " + actParentCa);
        System.out.println("_________________________________");

        SA.assertEquals(actParentCa,expParentCa);
        Thread.sleep(1000);

        //Check text [Order Level] colum
        String expOrderLevel = "3";
        String actOrderLevel = driver.findElement(By.xpath("//tbody/tr[1]/td[4]")).getText();
        Thread.sleep(1000);

        System.out.println("4. Check text [Order Level] colum");
        System.out.println("Exp: " + expOrderLevel + "/ Act: " + actOrderLevel);
        System.out.println("_________________________________");

        SA.assertEquals(actOrderLevel,expOrderLevel);
        Thread.sleep(1000);

        SA.assertAll();
    }

}
