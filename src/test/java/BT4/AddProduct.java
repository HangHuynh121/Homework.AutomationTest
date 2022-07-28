package BT4;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import javax.swing.plaf.TableHeaderUI;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class AddProduct extends BaseTest {

    @Test (priority = 1)
    public void ClickAdd_Product() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(1000);

        //Login
        //System.out.println("Login");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanghuynh121@gmail.com"); //input email
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456"); //input pas
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //click button login
        Thread.sleep(2000);

        //Select [Add New Product]  in [Product] submenu
        //System.out.println("Select [Add New Product] menu");

        driver.findElement(By.xpath("//a[normalize-space() ='Products']")).click(); //click [Product] submenu
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[normalize-space() ='Add New Product']")).click(); //click [Add New Product]
        Thread.sleep(1000);

    }

    //Add New Product
    @Test (priority = 2)
    public void AddNewProduct() throws InterruptedException, AWTException {

        driver.get("https://ecommerce.anhtester.com/admin/products/create");
        Thread.sleep(1000);

        Robot robot = new Robot();
        Actions act = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Input [Product Name] combobox
        driver.findElement(By.xpath("//label[contains(text(),'Product Name')]//following-sibling::div//input")).sendKeys("Hang");
        Thread.sleep(1000);

        //Input [Category] combobox
        driver.findElement(By.xpath("//button[@title='Computer & Accessories']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']")).sendKeys("Hang");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-1-17']")).click();

        Thread.sleep(1000);

        //Input [Branch] combobox
        driver.findElement(By.xpath("//button[@title='Select Brand']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']")).sendKeys("Dell");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[.='DELL']")).click();

        Thread.sleep(1000);

        //input [Unit] textbox
        driver.findElement(By.xpath("//input[@placeholder='Unit (e.g. KG, Pc etc)']")).sendKeys("KG");
        Thread.sleep(1000);

        //Input [Minimum Purchase Qty] textbox
        robot.mouseMove(560,556);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        driver.findElement(By.xpath("//input[@name='min_qty']")).sendKeys("5");
        Thread.sleep(1000);

        //Input [Tags] textbox
        robot.mouseMove(560,616);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyPress(KeyEvent.VK_M);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        //choose [Gallery Images] browser

        driver.findElement(By.xpath("//div[@data-multiple='true']//div[@class='input-group-text bg-soft-secondary font-weight-medium'][normalize-space()='Browse']")).click();
        //open browser
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Upload New']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Browse']")).click();
        Thread.sleep(2000);

        robot.mouseMove(26,356); //click [D] disk
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);


        robot.mouseMove(78,138); ///click [anh] folder
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);


        robot.mouseMove(234,418); //click Search image
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_C);
        Thread.sleep(1000);
        robot.mouseMove(234,445);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);

        robot.mouseMove(602,449);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[normalize-space()='Select File']")).click();//Click [Select File] button
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("machong"); //input [Search your file] textbox
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='aiz-select-file']//div[1]//div[1]//div[1]//div[1]//img[1]")).click(); //click chọn image
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click(); //click [Add Files] button
        Thread.sleep(2000);

        //Choose[Thumbnail Image] image
        driver.findElement(By.xpath("//label[.='Thumbnail Image (300x300)']/following-sibling::div[1]//div[1]//div[1]")).click();
        //open browser
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("machong");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@src='//ecommerce.anhtester.com/public/uploads/all/fFiyZNhIwLA7vlIAQTwlMQCEpV2CKosHOsvVes1Z.jpg']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click(); //click [Add Files] button
        Thread.sleep(1000);

        //choose [Video Provider] combobox
        driver.findElement(By.xpath("//div//label[normalize-space()='Video Provider']//following-sibling::div//div//button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div//label[normalize-space()='Video Provider']//following-sibling::div//div//select//option[1]")).click();
        Thread.sleep(5000);

        //Input [Video Link] textbox
        driver.findElement(By.xpath("//input[@placeholder='Video Link']")).sendKeys("https://www.youtube.com/watch?v=viYqkJw2jCI");
        Thread.sleep(1000);

        //checck [color] checkbox
        robot.mouseMove(1038,650); // move mouse đến mũi tên xuống scroll
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);

        // choose [Color] combobox
        driver.findElement(By.xpath("//body/div[@class='aiz-main-wrapper']/div[@class='aiz-content-wrapper']/div[@class='aiz-main-content']/div[@class='px-15px px-lg-25px']/div/form[@id='choice_form']/div[@class='row gutters-5']/div[@class='col-lg-8']/div[@class='card']/div[@class='card-body']/div[1]/div[2]/div[1]/button[1]")).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']")).sendKeys("pink");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'HotPink')]")).click();
        Thread.sleep(1000);

        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']")).sendKeys("greenyellow");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'GreenYellow')]")).click();
        Thread.sleep(1000);


        //Select [Attributes] comboboxd
        driver.findElement(By.xpath("//button[@data-id='choice_attributes']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']")).sendKeys("F");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Fabric']")).click();
        Thread.sleep(1000);

        //Slect [Fabric] combobox
        driver.findElement(By.xpath("//button[@title='Nothing selected']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Big']")).click();
        Thread.sleep(1000);

        //input [Unit price] textbox
        driver.findElement(By.xpath("//input[@placeholder='Unit price']")).sendKeys("100");
        Thread.sleep(1000);

        //Select [Discount Date Range]
        driver.findElement(By.xpath("//input[@placeholder='Select Date']")).click();
        Thread.sleep(1000);
        act.doubleClick(driver.findElement(By.xpath("//td[@class='weekend available'][normalize-space()='24']"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='applyBtn btn btn-sm btn-primary']")).click();
        Thread.sleep(2000);

        //Input [Discount] texbox
        driver.findElement(By.xpath("//input[@placeholder='Discount']")).sendKeys("20");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='col-md-3']//button[@title='Flat']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Percent']")).click();
        Thread.sleep(1000);


        //input [External link] textbox
        driver.findElement(By.xpath("//input[@placeholder='External link']")).sendKeys("https://www.youtube.com/watch?v=C46PciIHX-k&list=RDC46PciIHX-k&start_radio=1");
        Thread.sleep(1000);

        //Input [External link button text] textbox
        driver.findElement(By.xpath("//input[@placeholder='External link button text']")).sendKeys("https://www.youtube.com/watch?v=C46PciIHX-k&list=RDC46PciIHX-k&start_radio=1");
        Thread.sleep(2000);

        //cuộn xuống [Greenyellow] item
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//td[@class='text-center footable-first-visible']")));

        /*
        //Input [Greenyellow]
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='price_GreenYellow']")).sendKeys("100");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='sku_GreenYellow']")).sendKeys("200");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='qty_GreenYellow']")).sendKeys("300");
        Thread.sleep(1000);

        /*
        driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]//div[normalize-space()='Choose File']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Upload New']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Browse']")).click();
        Thread.sleep(2000);

        robot.mouseMove(26,356); //click [D] disk
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);


        robot.mouseMove(78,138); ///click [anh] folder
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);


        robot.mouseMove(234,418); //click Search image
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_K);
        Thread.sleep(1000);
        robot.mouseMove(234,445);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);

        robot.mouseMove(602,449);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[normalize-space()='Select File']")).click();//Click [Select File] button
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("hotpink"); //input [Search your file] textbox
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='aiz-select-file']//div[1]//div[1]//div[1]//div[1]//img[1]")).click(); //click chọn image
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click(); //click [Add Files] button
        Thread.sleep(2000);
        */







        Thread.sleep(5000);



    }
}
