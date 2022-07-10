package BT3;

import BT_JavaOOP3.common.BaseTest3_TextAdminPage;
import BT_JavaOOP3.common.BaseTest3_textPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckTextAdminPage_suitt extends BaseTest3_TextAdminPage {

    //Check Text hyperlink [Anh Tester]
    @Test
    public void TextHyperlinkClearCache() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        String expText = "Clear Cache";//True
        //String expText = "Clear Case";//False
        String actText = driver.findElement(By.xpath("//span[normalize-space()='Clear Cache']")).getText();

        System.out.println("Check Text Clear Cache <a> tab:");
        System.out.println("Exp: " + expText);
        System.out.println("Act: " + actText);

        SA.assertEquals(actText,expText);
        Thread.sleep(2000);

        SA.assertAll();
    }

    //Check Text span Admin Name
    @Test
    public void TextSpanAdminName() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        String expText = "Chị Hằng";//True
//        String expText = "Chị Lan";//False
        String actText = driver.findElement(By.xpath("//span[normalize-space()='Chị Hằng']")).getText();

        System.out.println("Check Text span Admin Name:");
        System.out.println("Exp: " + expText);
        System.out.println("Act: " + actText);

        SA.assertEquals(actText,expText);
        Thread.sleep(2000);

        SA.assertAll();
    }

    //Check Text heading Top 12 Products
    @Test
    public void TextHeadingTop12Pro() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        String expText = "Top 12 Products";//True
//        String expText = "Top 12 Product";//False
        String actText = driver.findElement(By.xpath("//h6[normalize-space()='Top 12 Products']")).getText();

        System.out.println("Check Text heading Top 12 Products:");
        System.out.println("Exp: " + expText);
        System.out.println("Act: " + actText);

        SA.assertEquals(actText,expText);
        Thread.sleep(2000);

        SA.assertAll();
    }

    //Check Text Search textbox
    @Test
    public void TextSearchTextbox() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        String expText = "Search in menu";//True
//        String expText = "Search in menus";//False
        String actText = driver.findElement(By.xpath("//input[@id='menu-search']")).getAttribute("placeholder");
        System.out.println("Check Text [Search in menu] textbox");
        System.out.println("Exp: " + expText);
        System.out.println("Act: " + actText);

        SA.assertEquals(actText,expText);
        Thread.sleep(2000);

        SA.assertAll();
    }

    //Check Text Hyperlink [Dashboard]
    @Test
    public void TextHyperlinkDashboard() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        String expText = "Dashboard";//True_ infor in Request
//        String expText = "Dashboards";//False
        String actText = driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).getText();
        System.out.println("Check Text Hyperlink Dashboard:");
        System.out.println("Exp: " + expText);
        System.out.println("Act: " + actText);

        SA.assertEquals(actText,expText);
        Thread.sleep(2000);

        SA.assertAll();
    }

    //Check Text Menu [Products]
    //Check Text Menu [Sales]
    //Check Text Menu [Customers]
    //Check Text Menu [Sellers]
    //Check Text Menu [Uploaded Files]
    //Check Text Menu [Report]
    //Check Text Menu [Blog System]
    //Check Text Menu [Marketing
    // //Check Text Menu [Support]]



}










