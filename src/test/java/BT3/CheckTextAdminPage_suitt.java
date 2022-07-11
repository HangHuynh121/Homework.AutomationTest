package BT3;

import BT_JavaOOP3.common.BaseTest3_TextAdminPage;
import BT_JavaOOP3.common.BaseTest3_textPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        SA.assertEquals(actText, expText);
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

        SA.assertEquals(actText, expText);
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

        SA.assertEquals(actText, expText);
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

        SA.assertEquals(actText, expText);
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

        SA.assertEquals(actText, expText);
        Thread.sleep(2000);

        SA.assertAll();
    }

    //Check Text Menu [Products]
    @Test
    public void TextProductMenu() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        WebElement ClickProduct = driver.findElement(By.xpath("//a[normalize-space() ='Products']"));
        ClickProduct.click();
        Thread.sleep(1000);

        //Check text [Products] Menu
        String expPro = "Products";
        String actPro = driver.findElement(By.xpath("//span[normalize-space()='Products']")).getText();
        System.out.println("CHECK Products] MENU");
        System.out.println("Exp: " + expPro);
        System.out.println("Act: " + actPro);

        SA.assertEquals(actPro, expPro);
        Thread.sleep(2000);

        //Check text [Add New Product]
        String expAddNewPro = "Add New Product";
        String actAddNewPro = driver.findElement(By.xpath("//span[normalize-space()='Add New Product']")).getText();
        System.out.println("1. Check Text Add New Products:");
        System.out.println("Exp: " + expAddNewPro);
        System.out.println("Act: " + actAddNewPro);

        SA.assertEquals(actAddNewPro, expAddNewPro);
        Thread.sleep(2000);

        //Check text [All Products]
        String expAllPro = "All products";
        String actAllPro = driver.findElement(By.xpath("//span[normalize-space()='All products']")).getText();
        System.out.println("2. Check Text All Products:");
        System.out.println("Exp: " + expAllPro);
        System.out.println("Act: " + actAllPro);

        SA.assertEquals(actAllPro, expAllPro);
        Thread.sleep(2000);

        //Check text [In House Products]
        String expInHouseProduct = "In House Products";
        String actInHouseProduct = driver.findElement(By.xpath("//span[normalize-space()='In House Products']")).getText();
        System.out.println("3. Check Text In House Product:");
        System.out.println("Exp: " + expInHouseProduct);
        System.out.println("Act: " + actInHouseProduct);

        SA.assertEquals(actInHouseProduct, expInHouseProduct);
        Thread.sleep(2000);

        //Check text [Seller Products]
        String expSellerPro = "Seller Products";
        String actSellerPro = driver.findElement(By.xpath("//span[normalize-space()='Seller Products']")).getText();
        System.out.println("4. Check Text Seller Products:");
        System.out.println("Exp: " + expSellerPro);
        System.out.println("Act: " + actSellerPro);

        SA.assertEquals(actSellerPro, expSellerPro);
        Thread.sleep(2000);

        //Check text [Digital Products]
        String expDigitalPro = "Digital Products";
        String actDigitalPro = driver.findElement(By.xpath("//span[normalize-space()='Digital Products']")).getText();
        System.out.println("5. Check Text Digital Products:");
        System.out.println("Exp: " + expDigitalPro);
        System.out.println("Act: " + actDigitalPro);

        SA.assertEquals(actDigitalPro, expDigitalPro);
        Thread.sleep(2000);

        //Check text [Bulk Import]
        String expBulkImport = "Bulk Import";
        String actBulkImport = driver.findElement(By.xpath("//span[normalize-space()='Bulk Import']")).getText();
        System.out.println("6. Check Text Bulk Import:");
        System.out.println("Exp: " + expBulkImport);
        System.out.println("Act: " + actBulkImport);

        SA.assertEquals(actBulkImport, expBulkImport);
        Thread.sleep(2000);

        //Check text [Bulk Export]
        String expBulkEx = "Bulk Export";
        String actBulkEx = driver.findElement(By.xpath("//span[normalize-space()='Bulk Export']")).getText();
        System.out.println("7. Check Text Bulk Export:");
        System.out.println("Exp: " + expBulkEx);
        System.out.println("Act: " + actBulkEx);

        SA.assertEquals(actBulkEx, expBulkEx);
        Thread.sleep(2000);

        //Check text [Category]
        String expCate = "Category";
        String actCate = driver.findElement(By.xpath("//span[normalize-space()='Category']")).getText();
        System.out.println("8. Check Text Category:");
        System.out.println("Exp: " + expCate);
        System.out.println("Act: " + actCate);

        SA.assertEquals(actCate, expCate);
        Thread.sleep(2000);

        //Check text [Brand]
        String expBrand = "Brand";
        String actBrand = driver.findElement(By.xpath("//span[normalize-space()='Brand']")).getText();
        System.out.println("9.C heck Text Brands:");
        System.out.println("Exp: " + expBrand);
        System.out.println("Act: " + actBrand);

        SA.assertEquals(actBrand, expBrand);
        Thread.sleep(2000);

        //Check text [Attribute]
        String expAttribute = "Attribute";
        String actAttribute = driver.findElement(By.xpath("//span[normalize-space()='Attribute']")).getText();
        System.out.println("10.Check Text Attribute:");
        System.out.println("Exp: " + expAttribute);
        System.out.println("Act: " + actAttribute);

        SA.assertEquals(actAttribute, expAttribute);
        Thread.sleep(2000);

        //Check text [Colors]
        String expColor = "Colors";
        String actColor = driver.findElement(By.xpath("//span[normalize-space()='Colors']")).getText();
        System.out.println("11. Check Text Colors:");
        System.out.println("Exp: " + expColor);
        System.out.println("Act: " + actColor);

        SA.assertEquals(actColor, expColor);
        Thread.sleep(2000);

        //Check text [Product Reviews]
        String expProReview = "Product Reviews";
        String actProReview = driver.findElement(By.xpath("//span[normalize-space()='Product Reviews']")).getText();
        System.out.println("12. Check Text Product Reviews:");
        System.out.println("Exp: " + expProReview);
        System.out.println("Act: " + actProReview);

        SA.assertEquals(actProReview, expProReview);
        Thread.sleep(2000);

        SA.assertAll();
    }


    //Check Text Menu [Sales]
    @Test
    public void TextSalesMenu() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        WebElement ClickProduct = driver.findElement(By.xpath("//a[normalize-space() = 'Sales']"));
        ClickProduct.click();
        Thread.sleep(1000);

        //Check text [Sales] Menu
        String expSale = "Sale";
        String actSale = driver.findElement(By.xpath("//span[normalize-space()='Sales']")).getText();
        System.out.println("CHECK [Sales] MENU");
        System.out.println("Exp: " + expSale);
        System.out.println("Act: " + actSale);

        SA.assertEquals(actSale, expSale); //Fail
        Thread.sleep(2000);

        //Check text [All Orders]
        String expAllOr = "All Orders";
        String actAllOr = driver.findElement(By.xpath("//span[normalize-space()='All Orders']")).getText();
        System.out.println("1. Check Text All Orders:");
        System.out.println("Exp: " + expAllOr);
        System.out.println("Act: " + actAllOr);

        SA.assertEquals(actAllOr, expAllOr);
        Thread.sleep(2000);

        //Check text [Inhouse orders]
        String expInOr = "Inhouse orders";
        String actInOr = driver.findElement(By.xpath("//span[normalize-space()='Inhouse orders']")).getText();
        System.out.println("2. Check Text Inhouse orders:");
        System.out.println("Exp: " + expInOr);
        System.out.println("Act: " + actInOr);

        SA.assertEquals(actInOr, expInOr); //pass
        Thread.sleep(2000);

        //Check text [Seller Orders]
        String expSellOr = "Seller Orders";
        String actSellOr = driver.findElement(By.xpath("//span[normalize-space()='Seller Orders']")).getText();
        System.out.println("3. Check Text Seller Orders:");
        System.out.println("Exp: " + expSellOr);
        System.out.println("Act: " + actSellOr);

        SA.assertEquals(actSellOr, expSellOr);//pass
        Thread.sleep(2000);

        //Check text [Pick-up Point Order]
        String expPickUpOr = "Pick-up Point Order";
        String actPickUpOr = driver.findElement(By.xpath("//span[normalize-space()='Pick-up Point Order']")).getText();
        System.out.println("4. Check Text Pick-up Point Order:");
        System.out.println("Exp: " + expPickUpOr);
        System.out.println("Act: " + actPickUpOr);

        SA.assertEquals(actPickUpOr, expPickUpOr);//pass
        Thread.sleep(2000);

        SA.assertAll();
    }


    //Check Text Menu [Customers]
    @Test
    public void TextCustomerMenu() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        WebElement ClickCus = driver.findElement(By.xpath("//a[normalize-space() = 'Customers']"));
        ClickCus.click();
        Thread.sleep(1000);

        //Check text [Customers] Menu
        String expCus = "Customers";
        String actCus = driver.findElement(By.xpath("//span[normalize-space()='Customers']")).getText();
        System.out.println("CHECK [Customers] MENU");
        System.out.println("Exp: " + expCus);
        System.out.println("Act: " + actCus);

        SA.assertEquals(actCus, expCus); //Fail
        Thread.sleep(2000);

        //Check text [Customer list]
        String expCusList = "Customer list";
        String actCusList = driver.findElement(By.xpath("//span[normalize-space()='Customer list']")).getText();
        System.out.println("1. Check Text Customer list:");
        System.out.println("Exp: " + expCusList);
        System.out.println("Act: " + actCusList);

        SA.assertEquals(actCusList, expCusList);
        Thread.sleep(2000);

        //Check text [Classified Products]
        String expClassPro = "Classified Products";
        String actClassPro = driver.findElement(By.xpath("//span[normalize-space()='Classified Products']")).getText();
        System.out.println("2. Check Text Classified Products:");
        System.out.println("Exp: " + expClassPro);
        System.out.println("Act: " + actClassPro);


        SA.assertEquals(actClassPro, expClassPro); //pass
        Thread.sleep(2000);

        //Check text [Classified Packages]
        String expClassPack = "Classified Packages";
        String actClassPack = driver.findElement(By.xpath("//span[normalize-space()='Classified Packages']")).getText();
        System.out.println("3. Check Text Classified Packages:");
        System.out.println("Exp: " + expClassPack);
        System.out.println("Act: " + actClassPack);

        SA.assertEquals(actClassPack, expClassPack);//pass
        Thread.sleep(2000);

        SA.assertAll();
    }

    //Check Text Menu [Sellers]
    //Check Text Menu [Uploaded Files]
    //Check Text Menu [Report]
    //Check Text Menu [Blog System]
    //Check Text Menu [Marketing
    // //Check Text Menu [Support]]



}










