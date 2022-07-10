package BT3;

import BT_JavaOOP3.common.BaseTest3_textDialog;
import BT_JavaOOP3.common.BaseTest3_textPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckTextPage_Login_Suit extends BaseTest3_textPage {

    //Check text heading "Welcome to AT eCommerce"
    @Test
    public void TextHeading() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(15000);

        SoftAssert SA = new SoftAssert();

        String expText = "Welcome to AT eCommerce"; //Pass
//        String expText = "Welcome to Anh Tester"; //Fail
        String actText = driver.findElement(By.xpath("//h1[normalize-space()='Welcome to AT eCommerce']")).getText();

        System.out.println("Check Text Heading");
        System.out.println("Act:" + actText);
        System.out.println("Exp:" + expText);

        SA.assertEquals(actText,expText);
        Thread.sleep(1000);

        SA.assertAll();

    }

    //Check text  paragraphs "Login to your account."
    @Test
    public void TextPara() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(1000);

        SoftAssert SA = new SoftAssert();

        String expText = "Login to your account."; //Pass
//        String expText = "Login to account."; //Fail
        String actText = driver.findElement(By.xpath("//p[normalize-space()='Login to your account.']")).getText();

        System.out.println("Check Text Paragraphs");
        System.out.println("Act:" + actText);
        System.out.println("Exp:" + expText);

        SA.assertEquals(actText, expText);
        Thread.sleep(1000);

        SA.assertAll();
    }

    //Check text checkbox "Remember Me"
    @Test
    public void TextCheckbox_RememberMe() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(1000);

        SoftAssert SA = new SoftAssert();

        String expText = "Remember Me"; //Pass
//        String expText = "Remember Pass"; //Fail
        String actText = driver.findElement(By.xpath("//span[normalize-space()='Remember Me']")).getText();

        System.out.println("Check Text checkbox [Remember Me]:");
        System.out.println("Act:" + actText);
        System.out.println("Exp:" + expText);

        SA.assertEquals(actText, expText);
        Thread.sleep(1000);

        SA.assertAll();
    }

    //Check text hyperlink "Forgot password ?"
    @Test
    public void TextHyperlink_ForgotPass() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(1000);

        SoftAssert SA = new SoftAssert();

        String expText = "Forgot password ?"; //Pass
//        String expText = "Forgot pass ?"; //Fail
        String actText = driver.findElement(By.xpath("//a[normalize-space()='Forgot password ?']")).getText();

        System.out.println("Check Text Hyperlink [Forgot Password ?]:");
        System.out.println("Act:" + actText);
        System.out.println("Exp:" + expText);

        SA.assertEquals(actText, expText);
        Thread.sleep(1000);

        SA.assertAll();
    }

    //Check text button "Login"
    @Test
    public void TextButton_Login() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(1000);

        SoftAssert SA = new SoftAssert();

        String expText = "Login"; //Pass
//        String expText = "LOGIN"; //Fail
        String actText = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getText();

        System.out.println("Check Text Button [Login]:");
        System.out.println("Act:" + actText);
        System.out.println("Exp:" + expText);

        SA.assertEquals(actText, expText);
        Thread.sleep(1000);

        SA.assertAll();
    }



}
