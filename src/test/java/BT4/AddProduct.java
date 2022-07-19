package BT4;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

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
        Thread.sleep(4000);
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
        Thread.sleep(5000);

        //




    }
}
