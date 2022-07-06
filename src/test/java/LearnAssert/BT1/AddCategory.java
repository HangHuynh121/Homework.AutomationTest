package LearnAssert.BT1;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;


public class AddCategory extends BaseTest {
    //LOGIN
    @Test
    public void Login() throws InterruptedException {

        driver.get("https://ecommerce.anhtester.com/login");
        Thread.sleep(5000);

        driver.findElement(By.id("email")).sendKeys("hanghuynh121@gmail.com"); // input [Email] textbox
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123456"); //input [Password] textbox
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //click [Login] button
        Thread.sleep(2000);

        //PRODUCT MENU

        driver.findElement(By.xpath("//a[normalize-space()='Products']")).click();// click [Product] menu
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='https://ecommerce.anhtester.com/admin/categories']")).click();// Click[category] menu
        Thread.sleep(8000);

        driver.findElement(By.xpath("//a[@href='https://ecommerce.anhtester.com/admin/categories/create']")).click(); //click [Add New Category] button
        Thread.sleep(4000);


        //ADD NEW CATEGORY

//        SoftAssert sa = new SoftAssert();
//        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("laptopCategory"); //input [Name] textbox
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select select2 form-control aiz-']")).click(); //select [Parent Category] dropdown
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']")).sendKeys("Laptop");// input [Search] box
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='-- Laptop & Accessories']")).click();// click chọn "-- Laptop & Accessories" data
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='order_level']")).sendKeys("5"); // input [Ordering Number] textbox
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[text()='Banner ']//following::div[1]")).click(); //click [Banner] combobox
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@title='asushong.jpg']//div[@class='card-file-thumb']")).click(); //Select image
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click(); //click [Add Files] button

        driver.findElement(By.xpath("//label[text()='Icon ']//following::div[1]")).click(); //click [icon] combobox
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@title='207616073_10219201734410426_437637566408527171_n.jpg']")).click(); //Select image
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click(); //click [Add Files] button

        driver.findElement(By.xpath("//input[@placeholder='Meta Title']")).sendKeys("Pink"); //input [Meta Title] textbox
        Thread.sleep(1000);

        driver.findElement(By.xpath("//textarea[@name='meta_description']")).sendKeys("Máy tính màu hồng"); //Input [Meta Description] texbox
        Thread.sleep(1000);

        driver.findElement(By.xpath("//label[normalize-space()='Filtering Attributes']//following::div[1]")).click();//click [Filtering Attribution] combobox
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']")).sendKeys("F");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-3-1']")).click(); //select "Fabric" data
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click(); //click [Save] button
        Thread.sleep(2000);

        //SEARCH NAME VỪA ADD
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Hanghuynh"); //input [Search] textbox
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='box-inline pad-rgt pull-left']//div")).submit(); //submit [Search] textbox
        Thread.sleep(5000);

        //CHECK TEXT CATEGORY VỪA ADD Ở CỘT NAME TẠI [CATEGORY] SCREEN
//        WebElement nameSearch = driver.findElement(By.xpath("//td[normalize-space()='HanghuynhCategory']"));
//
//        sa.assertTrue(nameSearch.getText().equals("HanghuynhCategory"));
//        Thread.sleep(3000);
//        sa.assertAll();

    }
}

