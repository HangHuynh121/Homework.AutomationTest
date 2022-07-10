package BT3;

import BT_JavaOOP3.common.BaseTest3;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class checkTextDialog_Login_Suit extends BaseTest3 {

    //no input data [Email] textbox and [Password] textbox
        @Test
        public void Login_noDataEmail_noDataPass() throws InterruptedException {

            driver.get("https://ecommerce.anhtester.com/login");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //click [Login] button
            Thread.sleep(2000);


            //Check Text Dialog
            SoftAssert SA = new SoftAssert();
            Actions act = new Actions(driver);
            Thread.sleep(1000);


            String expMsg = "Please fill out this field.";
            String actMsg = driver.findElement(By.id("email")).getAttribute("validationMessage");
            Thread.sleep(4000);

            System.out.println("Print Text Msg Login_noDataEmail_noDataPass");
            System.out.println(expMsg);
            System.out.println(actMsg);

            SA.assertEquals(actMsg,expMsg);
            Thread.sleep(2000);

            SA.assertAll();
        }




    //no input data [Email] textbox and unvalid [Password] textbox
    @Test
    public void Login_noDataEmail_UnvalidPass() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(3000);

        driver.findElement(By.id("email")); // input [Email] textbox
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("abcd"); //no input [Password] textbox
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //click [Login] button
        Thread.sleep(2000);

        //Check Text Dialog
        SoftAssert SA = new SoftAssert();
        Actions act = new Actions(driver);
        Thread.sleep(1000);


        String expMsg = "Please fill out this field.";
        String actMsg = driver.findElement(By.id("email")).getAttribute("validationMessage");
        Thread.sleep(4000);

        System.out.println("Print Text Msg Login_noDataEmail_UnvalidPass");
        System.out.println(expMsg);
        System.out.println(actMsg);

        SA.assertEquals(actMsg,expMsg);
        Thread.sleep(2000);

        SA.assertAll();

        //Check Text trên page

    }




    // input valid data [Email] textbox and no input [Password] textbox
    @Test
    public void Login_ValidEmail_NoDataPass() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(3000);

        driver.findElement(By.id("email")).sendKeys("hanghuynh121@gmail.com"); // input [Email] textbox
        Thread.sleep(1000);
        driver.findElement(By.id("password")); //no input [Password] textbox
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //click [Login] button
        Thread.sleep(2000);


        //Check Text Dialog
        SoftAssert SA = new SoftAssert();
        Actions act = new Actions(driver);
        Thread.sleep(1000);

        act.moveToElement(driver.findElement(By.id("email"))).perform();
        Thread.sleep(10000);

        String expMsg1 = "Please fill out this field.";
        String actMsg1 = driver.findElement(By.id("password")).getAttribute("validationMessage");
        Thread.sleep(4000);

        System.out.println("Print Text Msg Login_ValidEmail_NoDataPass");
        System.out.println(expMsg1);
        System.out.println(actMsg1);

        SA.assertEquals(actMsg1,expMsg1);
        Thread.sleep(2000);

        SA.assertAll();
    }




    // input valid data [Email] textbox and  input unvalid [Password] textbox
//    @Test
//    public void Login3() throws InterruptedException {
//
//        driver.get("https://ecommerce.anhtester.com/login");
//        Thread.sleep(3000);
//
//        driver.findElement(By.id("email")).sendKeys("hanghuynh121@gmail.com"); // input [Email] textbox
//        Thread.sleep(1000);
//        driver.findElement(By.id("password")).sendKeys("abcd"); //no input [Password] textbox
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //click [Login] button
//        Thread.sleep(1000);
//
//
//        //Check Text Dialog
//        SoftAssert SA = new SoftAssert();
//        Actions act = new Actions(driver);
//        Thread.sleep(1000);
//
//
//        String expMsg2 = "Invalid login credentials";
//        String actMsg2 = driver.findElement(By.id("//body[1]/script[4]")).getText("Invalid login credentials");
//        Thread.sleep(4000);
//
//        System.out.println("Print Text Msg");
//        System.out.println(expMsg2);
//        System.out.println(actMsg2);
//
//        SA.assertEquals(actMsg2,expMsg2);
//        Thread.sleep(2000);
//
//        SA.assertAll();
//    }





    // input unvalid data [Email] textbox and input unvalid [Password] textbox
    @Test
    public void Login_UnvalidEmail_UnvalidPass() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(3000);

        driver.findElement(By.id("email")).sendKeys("hanghuynh121"); // input [Email] textbox
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123456"); //no input [Password] textbox
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //click [Login] button
        Thread.sleep(2000);


        //Check Text Dialog
        SoftAssert SA = new SoftAssert();
        Actions act = new Actions(driver);
        Thread.sleep(1000);


        String expMsg4 = "Please include an '@' in the email address. 'hanghuynh121' is missing an '@'.";
        String actMsg4 = driver.findElement(By.id("email")).getAttribute("validationMessage");
        Thread.sleep(4000);

        System.out.println("Print Text Msg Login_UnvalidEmail_UnvalidPass");
        System.out.println(expMsg4);
        System.out.println(actMsg4);

        SA.assertEquals(actMsg4,expMsg4);
        Thread.sleep(2000);

        SA.assertAll();

    }




    // input unvalid data [Email] textbox and no input [Password] textbox
    @Test
    public void Login_UnvalidEmail_NoDataPass() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(3000);

        driver.findElement(By.id("email")).sendKeys("hanghuynh121"); // input [Email] textbox
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123456"); //no input [Password] textbox
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //click [Login] button
        Thread.sleep(2000);


        //Check Text Dialog
        SoftAssert SA = new SoftAssert();
        Actions act = new Actions(driver);
        Thread.sleep(1000);


        String expMsg5 = "Please include an '@' in the email address. 'hanghuynh121' is missing an '@'.";
        String actMsg5 = driver.findElement(By.id("email")).getAttribute("validationMessage");
        Thread.sleep(4000);

        System.out.println("Print Text Msg Login_UnvalidEmail_NoDataPass");
        System.out.println(expMsg5);
        System.out.println(actMsg5);

        SA.assertEquals(actMsg5,expMsg5);
        Thread.sleep(2000);

        SA.assertAll();
    }


}
