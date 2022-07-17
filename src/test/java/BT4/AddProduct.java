package BT4;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;

public class AddProduct extends BaseTest {

    @Test
    public void Add_Product() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(1000);

        //Login
        //System.out.println("Login");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanghuynh121@gmail.com"); //input email
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456"); //input pas
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //click button login
        Thread.sleep(3000);

        //Select [Add New Product]  in [Product] submenu
        //System.out.println("Select [Add New Product] menu");

        driver.findElement(By.xpath("//a[normalize-space() ='Products']")).click(); //click [Product] submenu
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[normalize-space() ='Add New Product']")).click(); //click [Add New Product]
        Thread.sleep(5000);


    }
}
