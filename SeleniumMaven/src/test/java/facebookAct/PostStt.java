package facebookAct;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PostStt {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.get("https://www.facebook.com/hang.huynh.332/");
        Thread.sleep(3000);

        //log in
        driver.findElement(By.xpath("//div[@class = '_5jb4']/descendant::input[@id = 'email']"));
        driver.findElement(By.xpath("//div[@class = '_5jb5']/descendant::input[@id = 'pass']"));
        driver.findElement(By.xpath("//div[@class = '_70g9']/descendant::button[@id = 'loginbutton']"));

        WebElement inputEmail = driver.findElement(By.xpath("//div[@class = '_5jb4']/descendant::input[@id = 'email']"));
        WebElement inputPass = driver.findElement(By.xpath("//div[@class = '_5jb5']/descendant::input[@id = 'pass']"));
        WebElement buttonLogin = driver.findElement(By.xpath("//div[@class = '_70g9']/descendant::button[@id = 'loginbutton']"));


        inputEmail.click();
        Thread.sleep(3000);
        inputEmail.sendKeys("hanghuynh121@gmail.com");
        Thread.sleep(3000);

        inputPass.click();
        Thread.sleep(3000);
        inputPass.sendKeys("123456");
        Thread.sleep(3000);

        buttonLogin.click();
        Thread.sleep(3000);



        //click on STT textbox
        driver.findElement(By.className("a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7"));
        WebElement inputStt = driver.findElement(By.className("a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7"));
        Thread.sleep(3000);
        inputStt.click();
        Thread.sleep(2000);

        Thread.sleep(5000);
        driver.quit();


    }
}
