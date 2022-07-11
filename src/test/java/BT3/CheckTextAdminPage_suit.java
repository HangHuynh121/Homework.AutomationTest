package BT3;

import BT_JavaOOP3.common.BaseTest3_TextAdminPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckTextAdminPage_suit extends BaseTest3_TextAdminPage {

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
    @Test
    public void TextSellerMenu() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        WebElement ClickSeller = driver.findElement(By.xpath("//a[normalize-space() = 'Sellers']"));
        ClickSeller.click();
        Thread.sleep(1000);

        //Check text [Sellers] Menu
        String expSell = "Sellers";
        String actSell = driver.findElement(By.xpath("//span[normalize-space()='Sellers']")).getText();
        System.out.println("CHECK [Sellers] MENU");
        System.out.println("Exp: " + expSell);
        System.out.println("Act: " + actSell);

        SA.assertEquals(actSell, expSell); //Fail
        Thread.sleep(2000);

        //Check text [All Seller]
        String expAllSell = "All Seller";
        String actAllSell = driver.findElement(By.xpath("//span[normalize-space()='All Seller']")).getText();
        System.out.println("1. Check Text All Seller:");
        System.out.println("Exp: " + expAllSell);
        System.out.println("Act: " + actAllSell);

        SA.assertEquals(actAllSell, expAllSell);
        Thread.sleep(2000);

        //Check text [Payouts]
        String expPay = "Payouts";
        String actPay = driver.findElement(By.xpath("//span[normalize-space()='Payouts']")).getText();
        System.out.println("2. Check Text Payouts:");
        System.out.println("Exp: " + expPay);
        System.out.println("Act: " + actPay);


        SA.assertEquals(actPay, expPay); //pass
        Thread.sleep(2000);

        //Check text [Payout Requests]
        String expPayRe = "Payout Requests";
        String actPayRe = driver.findElement(By.xpath("//span[normalize-space()='Payout Requests']")).getText();
        System.out.println("3. Check Text Payout Requests:");
        System.out.println("Exp: " + expPayRe);
        System.out.println("Act: " + actPayRe);

        SA.assertEquals(actPayRe, expPayRe);//pass
        Thread.sleep(2000);

        //Check text [Seller Commission]
        String expSellCom = "Seller Commission";
        String actSellCom = driver.findElement(By.xpath("//span[normalize-space()='Seller Commission']")).getText();
        System.out.println("4. Check Text Seller Commission:");
        System.out.println("Exp: " + expSellCom);
        System.out.println("Act: " + actSellCom);

        SA.assertEquals(actSellCom, expSellCom);//pass
        Thread.sleep(2000);


        //Check text [Seller Verification Form]
        String expSellForm = "Seller Verification Form";
        String actSellForm = driver.findElement(By.xpath("//span[normalize-space()='Seller Verification Form']")).getText();
        System.out.println("5. Check Text Seller Verification Form:");
        System.out.println("Exp: " + expSellForm);
        System.out.println("Act: " + actSellForm);


        SA.assertEquals(actSellForm, expSellForm);//pass
        Thread.sleep(2000);

        SA.assertAll();
    }

    //Check Text Menu [Uploaded Files]
    @Test
    public void TextUploadedFilesMenu() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();


        //Check text [Uploaded Files] Menu
        String expUp = "Uploaded Files";
        String actUp = driver.findElement(By.xpath("//a[normalize-space() = 'Uploaded Files']")).getText();
        System.out.println("CHECK [Uploaded Files] MENU");
        System.out.println("Exp: " + expUp);
        System.out.println("Act: " + actUp);

        SA.assertEquals(actUp, expUp); //Fail
        Thread.sleep(2000);

        SA.assertAll();
    }

    //Check Text Menu [Reports]
    @Test
    public void TextReportMenu() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        WebElement ClickReport = driver.findElement(By.xpath("//a[normalize-space() ='Reports']"));
        ClickReport.click();
        Thread.sleep(1000);

        //Check text [Reports] Menu
        String expReport = "Reports";
        String actReportr = driver.findElement(By.xpath("//span[normalize-space()='Reports']")).getText();
        System.out.println("CHECK [Report] MENU");
        System.out.println("Exp: " + expReport);
        System.out.println("Act: " + actReportr);

        SA.assertEquals(actReportr, expReport);
        Thread.sleep(2000);

        //Check text [In House Product Sale]
        String expInHousePro = "In House Product Sale";
        String actInhousePro = driver.findElement(By.xpath("//span[normalize-space()='In House Product Sale']")).getText();
        System.out.println("1. Check Text In House Product Sales:");
        System.out.println("Exp: " + expInHousePro);
        System.out.println("Act: " + actInhousePro);

        SA.assertEquals(actInhousePro, expInHousePro);
        Thread.sleep(2000);

        //Check text [Seller Products Sale]
        String expSellProSale = "Seller Products Sale";
        String actSellProSale = driver.findElement(By.xpath("//span[normalize-space()='Seller Products Sale']")).getText();
        System.out.println("2. Check Text Seller Products Sale:");
        System.out.println("Exp: " + expSellProSale);
        System.out.println("Act: " + actSellProSale);

        SA.assertEquals(actSellProSale, expSellProSale);
        Thread.sleep(2000);

        //Check text [Products Stock]
        String expProStock = "Products Stock";
        String actProStock = driver.findElement(By.xpath("//span[normalize-space()='Products Stock']")).getText();
        System.out.println("3. Check Text Products Stock:");
        System.out.println("Exp: " + expProStock);
        System.out.println("Act: " + actProStock);

        SA.assertEquals(actProStock, expProStock);
        Thread.sleep(2000);

        //Check text [Products wishlist]
        String expProWi = "Products wishlist";
        String actProWi = driver.findElement(By.xpath("//span[normalize-space()='Products wishlist']")).getText();
        System.out.println("4. Check Text Products wishlist:");
        System.out.println("Exp: " + expProWi);
        System.out.println("Act: " + actProWi);

        SA.assertEquals(actProWi, expProWi);
        Thread.sleep(2000);

        //Check text [User Searches]
        String expUseSearch = "User Searches";
        String actUserSearch = driver.findElement(By.xpath("//span[normalize-space()='User Searches']")).getText();
        System.out.println("5. Check Text User Searches:");
        System.out.println("Exp: " + expUseSearch);
        System.out.println("Act: " + actUserSearch);

        SA.assertEquals(actUserSearch, expUseSearch);
        Thread.sleep(2000);

        //Check text [Commission History]
        String expCusHis = "Commission History";
        String actCusHis = driver.findElement(By.xpath("//span[normalize-space()='Commission History']")).getText();
        System.out.println("6. Check Text Commission History:");
        System.out.println("Exp: " + expCusHis);
        System.out.println("Act: " + actCusHis);

        SA.assertEquals(actCusHis, expCusHis);
        Thread.sleep(2000);

        //Check text [Wallet Recharge History]
        String expWalletHis = "Wallet Recharge History";
        String actWalletHis = driver.findElement(By.xpath("//span[normalize-space()='Wallet Recharge History']")).getText();
        System.out.println("7. Check Text Wallet Recharge History:");
        System.out.println("Exp: " + expWalletHis);
        System.out.println("Act: " + actWalletHis);

        SA.assertEquals(actWalletHis, expWalletHis);
        Thread.sleep(2000);;

        SA.assertAll();
    }


    //Check Text Menu [Blog System]
    @Test
    public void TextBlogSystemMenu() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        WebElement ClickBlogS = driver.findElement(By.xpath("//a[normalize-space() ='Blog System']"));
        ClickBlogS.click();
        Thread.sleep(1000);

        //Check text [Blog System] Menu
        String expBlogS = "Blog System";
        String actBlogS = driver.findElement(By.xpath("//span[normalize-space()='Blog System']")).getText();
        System.out.println("CHECK [Blog System] MENU");
        System.out.println("Exp: " + expBlogS);
        System.out.println("Act: " + actBlogS);

        SA.assertEquals(actBlogS, expBlogS);
        Thread.sleep(2000);

        //Check text [All Posts]
        String expAllP = "All Posts";
        String actAllP = driver.findElement(By.xpath("//span[normalize-space()='All Posts']")).getText();
        System.out.println("1. Check Text All Postss:");
        System.out.println("Exp: " + expAllP);
        System.out.println("Act: " + actAllP);

        SA.assertEquals(actAllP, expAllP);
        Thread.sleep(2000);

        //Check text [Categories]
        String expCategory = "Categories";
        String actCategory = driver.findElement(By.xpath("//span[normalize-space()='Categories']")).getText();
        System.out.println("2. Check Text Categories:");
        System.out.println("Exp: " + expCategory);
        System.out.println("Act: " + actCategory);

        SA.assertEquals(actCategory, expCategory);
        Thread.sleep(2000);

        SA.assertAll();
    }

    //Check Text Menu [Marketing]
    @Test
    public void TextMarketingMenu() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        WebElement ClickMar = driver.findElement(By.xpath("//a[normalize-space() = 'Marketing']"));
        ClickMar.click();
        Thread.sleep(1000);

        //Check text [Marketing] Menu
        String expMar = "Marketing";
        String actMar = driver.findElement(By.xpath("//span[normalize-space()='Marketing']")).getText();
        System.out.println("CHECK [Marketing] MENU");
        System.out.println("Exp: " + expMar);
        System.out.println("Act: " + actMar);

        SA.assertEquals(actMar, expMar);
        Thread.sleep(2000);

        //Check text [Flash deals]
        String expFlashDeal = "Flash deals";
        String actFlashDeal = driver.findElement(By.xpath("//span[normalize-space()='Flash deals']")).getText();
        System.out.println("1. Check Text Flash deals:");
        System.out.println("Exp: " + expFlashDeal);
        System.out.println("Act: " + actFlashDeal);

        SA.assertEquals(actFlashDeal, expFlashDeal);
        Thread.sleep(2000);

        //Check text [Subscribers]
        String expSub = "Subscribers";
        String actSub = driver.findElement(By.xpath("//span[normalize-space()='Subscribers']")).getText();
        System.out.println("2. Check Text Subscribers:");
        System.out.println("Exp: " + expSub);
        System.out.println("Act: " + actSub);

        SA.assertEquals(actSub, expSub);
        Thread.sleep(2000);

        //Check text [Coupon]
        String expCoupon = "Coupon";
        String actCoupon = driver.findElement(By.xpath("//span[normalize-space()='Coupon']")).getText();
        System.out.println("2. Check Text Coupon:");
        System.out.println("Exp: " + expCoupon);
        System.out.println("Act: " + actCoupon);

        SA.assertEquals(actCoupon, expCoupon);
        Thread.sleep(2000);

        SA.assertAll();
    }


    //Check Text Menu [Support]
    @Test
    public void TextSupportMenu() throws InterruptedException {
        driver.get("https://ecommerce.anhtester.com/admin");
        Thread.sleep(2000);

        SoftAssert SA = new SoftAssert();

        WebElement ClickSupport = driver.findElement(By.xpath("//a[normalize-space() = 'Support']"));
        ClickSupport.click();
        Thread.sleep(1000);

        //Check text [Support] Menu
        String expSupport = "Support";
        String actSupport = driver.findElement(By.xpath("//span[normalize-space()='Support']")).getText();
        System.out.println("CHECK [Support] MENU");
        System.out.println("Exp: " + expSupport);
        System.out.println("Act: " + actSupport);

        SA.assertEquals(actSupport, expSupport);
        Thread.sleep(2000);

        //Check text [Ticket]
        String expTicket = "Ticket";
        String actTicket = driver.findElement(By.xpath("//span[normalize-space()='Ticket']")).getText();
        System.out.println("1. Check Text Ticket:");
        System.out.println("Exp: " + expTicket);
        System.out.println("Act: " + actTicket);

        SA.assertEquals(actTicket, expTicket);
        Thread.sleep(2000);

        //Check text [Product Queries]
        String expProQueries = "Product Queries";
        String actProQueries = driver.findElement(By.xpath("//span[normalize-space()='Product Queries']")).getText();
        System.out.println("2. Check Text Product Queries:");
        System.out.println("Exp: " + expProQueries);
        System.out.println("Act: " + actProQueries);

        SA.assertEquals(actProQueries, expProQueries);
        Thread.sleep(2000);

        SA.assertAll();
    }

}










