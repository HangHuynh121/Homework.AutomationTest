package BT3;

import BT2.AddCategories_priority;
import BT2.AddCategories_suite_xml;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckTextAddCategories_suit extends AddCategories_priority {
    /*
    INFOR ADD NEW CATEGORY
    Name: HanghuynhCategory
    Parent Category: Laptop & Accessories
    Ordering Number: 5
    Meta Title: Pink
    Meta Description: Máy tính màu hồng
    Filtering Attributers: Fabric
    */

    //Check [#] colum
    @Test
    public  void TextNo() throws InterruptedException{

        driver.get("https://ecommerce.anhtester.com/admin/categories");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        String expNo = "1";
        String actNo = driver.findElement(By.xpath("//td[@class='footable-first-visible'][normalize-space()='1']")).getText();
        Thread.sleep(2000);

        System.out.println(" Check text [#] colum");
        System.out.println("Exp: " + expNo + "/ Act: " + actNo);

        SA.assertEquals(actNo,expNo);

        SA.assertAll();
    }

    //Check [Name] colum
    @Test
    public  void TextName() throws InterruptedException{

        driver.get("https://ecommerce.anhtester.com/admin/categories");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        String expName = "HanghuynhCategory";
        String actName = driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).getText();
        Thread.sleep(2000);

        System.out.println(" Check text [Name] colum");
        System.out.println("Exp: " + expName + "/ Act: " + actName);

        SA.assertEquals(actName,expName);

        SA.assertAll();
    }

    //Check [Parent Category] colum
    @Test
    public  void TextParentCa() throws InterruptedException{

        driver.get("https://ecommerce.anhtester.com/admin/categories");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        String expParentCa = "Laptop & Accessories";
        String actParentCa = driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
        Thread.sleep(2000);

        System.out.println(" Check text [Pảent Category] colum");
        System.out.println("Exp: " + expParentCa + "/ Act: " + actParentCa);

        SA.assertEquals(actParentCa,expParentCa);

        SA.assertAll();
    }

    //Check [Order Level] colum
    @Test
    public  void TextOrderLevel() throws InterruptedException{

        driver.get("https://ecommerce.anhtester.com/admin/categories");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        String expOrderLevel = "5";
        String actOrderLevel = driver.findElement(By.xpath("//tbody/tr[1]/td[4]")).getText();
        Thread.sleep(2000);

        System.out.println(" Check text [Order Level] colum");
        System.out.println("Exp: " + expOrderLevel + "/ Act: " + actOrderLevel);

        SA.assertEquals(actOrderLevel,expOrderLevel);

        SA.assertAll();
    }
//
//    //Check [ Meta Title] colum
//    @Test
//    public  void TextParentCa(){
//
//        SoftAssert SA = new SoftAssert();
//
//        String expParentCa = "Laptop & Accessories";
//        String actParentCa = driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
//        //Thread.sleep(4000);
//
//        SA.assertEquals(actParentCa,expParentCa);
//
//        SA.assertAll();
//    }
//
//    //Check [PMeta Description] colum
//    @Test
//    public  void TextParentCa(){
//
//        SoftAssert SA = new SoftAssert();
//
//        String expParentCa = "Laptop & Accessories";
//        String actParentCa = driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
//        Thread.sleep(1000);
//
//        SA.assertEquals(actParentCa,expParentCa);
//
//        SA.assertAll();
//    }
//
//    //Check [Filtering Attributers] colum
//    @Test
//    public  void TextParentCa(){
//
//        SoftAssert SA = new SoftAssert();
//
//        String expParentCa = "Laptop & Accessories";
//        String actParentCa = driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
//        Thread.sleep(1000);
//
//        SA.assertEquals(actParentCa,expParentCa);
//
//        SA.assertAll();
//    }
}
