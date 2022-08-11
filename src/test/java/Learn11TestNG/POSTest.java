package Learn11TestNG;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class POSTest extends BaseTest {

    @Test
    public void Login() throws InterruptedException {
        createDriver();
        driver.get("https://pos.anhtester.com/");

        //LOGIN

        driver.findElement(By.xpath("//input[@id='email']"));  //xpath email textbox
        driver.findElement(By.xpath("//input[@id='password']")); //xpath pass textbox
        driver.findElement(By.xpath("//button[normalize-space()='Login']")); //xpath login button

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']")); //Đặt tên Email theo UI
        WebElement inputPass = driver.findElement(By.xpath("//input[@id='password']")); //Đặt tên Password theo UI
        WebElement clickLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']")); //Đặt tên Login button theo UI
        Thread.sleep(2000);

        inputEmail.sendKeys("admin@mailinator.com"); //input email
        Thread.sleep(2000);

        inputPass.sendKeys("123456"); //input pass
        Thread.sleep(2000);

        clickLogin.submit(); //click Login button
        Thread.sleep(6000);
        closeDriver();
    }

    @Test
    public void AddCate() throws InterruptedException {
        createDriver();
        driver.get("https://pos.anhtester.com/");

        //LOGIN

        driver.findElement(By.xpath("//input[@id='email']"));  //xpath email textbox
        driver.findElement(By.xpath("//input[@id='password']")); //xpath pass textbox
        driver.findElement(By.xpath("//button[normalize-space()='Login']")); //xpath login button

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']")); //Đặt tên Email theo UI
        WebElement inputPass = driver.findElement(By.xpath("//input[@id='password']")); //Đặt tên Password theo UI
        WebElement clickLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']")); //Đặt tên Login button theo UI
        Thread.sleep(2000);

        inputEmail.sendKeys("admin@mailinator.com"); //input email
        Thread.sleep(2000);

        inputPass.sendKeys("123456"); //input pass
        Thread.sleep(2000);

        clickLogin.submit(); //click Login button
        Thread.sleep(6000);

        //addCategory
        driver.findElement(By.xpath("//ul[contains(@class,'sidebar-menu')]/li[position()=5]/a")); //xpath product subbar
        WebElement moveProduct = driver.findElement(By.xpath("//ul[contains(@class,'sidebar-menu')]/li[position()=5]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(moveProduct).build().perform();//move to product subbar
        Thread.sleep(2000);

        driver.findElement(By.xpath("//ul[contains(@class,'sidebar-menu')]/li[position()=5]/ul//a[@href='https://pos.anhtester.com/category_form']")); //xpath category submenu
        WebElement clickCategory = driver.findElement(By.xpath("//ul[contains(@class,'sidebar-menu')]/li[position()=5]/ul//a[@href='https://pos.anhtester.com/category_form']"));//Đặt tên Category theo UI
        actions.moveToElement(clickCategory).build().perform(); //move to New product
        Thread.sleep(2000);

        clickCategory.click();
        Thread.sleep(3000);

        //category form
        driver.findElement(By.xpath("//input[@id='category_name']")); // xpath category name texbox
        driver.findElement(By.xpath("//span[@role='presentation']")); // xpath status dropdown
        driver.findElement(By.xpath("//select[@id='status']")); // xpath active stt
        driver.findElement(By.xpath("//button[normalize-space()='Save']"));// xpath Save button

        WebElement inputCategoryName = driver.findElement(By.xpath("//input[@id='category_name']")); //Đặt tên category name tbox theo UI
        WebElement moveSTT = driver.findElement(By.xpath("//span[@role='presentation']"));// Đặt tên Status Drop theo UI
        Select selectSTT = new Select(driver.findElement(By.xpath("//select[@id='status']")));// Đặt tên Dropdown Status theo UI
        WebElement clickSave = driver.findElement(By.xpath("//button[normalize-space()='Save']"));// Đặt tên Save button theo UI
        Thread.sleep(2000);

        inputCategoryName.click();
        Thread.sleep(2000);
        inputCategoryName.sendKeys("beer");
        Thread.sleep(2000);

        moveSTT.click(); //show option Status dropdown
        Thread.sleep(2000);

        selectSTT.selectByVisibleText("Active");//select stt Active
        Thread.sleep(2000);

        moveSTT.click(); //hide option Status dropdown
        Thread.sleep(2000);

        clickSave.click(); //click Save button
        Thread.sleep(7000);
        closeDriver();

    }

//    @Test
//    public void Login() throws InterruptedException {
//        createDriver();
//        driver.get("https://pos.anhtester.com/");
//
//        //LOGIN
//
//        driver.findElement(By.xpath("//input[@id='email']"));  //xpath email textbox
//        driver.findElement(By.xpath("//input[@id='password']")); //xpath pass textbox
//        driver.findElement(By.xpath("//button[normalize-space()='Login']")); //xpath login button
//
//        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']")); //Đặt tên Email theo UI
//        WebElement inputPass = driver.findElement(By.xpath("//input[@id='password']")); //Đặt tên Password theo UI
//        WebElement clickLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']")); //Đặt tên Login button theo UI
//        Thread.sleep(2000);
//
//        inputEmail.sendKeys("admin@mailinator.com"); //input email
//        Thread.sleep(2000);
//
//        inputPass.sendKeys("123456"); //input pass
//        Thread.sleep(2000);
//
//        clickLogin.submit(); //click Login button
//        Thread.sleep(6000);
//        closeDriver();
//    }
}
