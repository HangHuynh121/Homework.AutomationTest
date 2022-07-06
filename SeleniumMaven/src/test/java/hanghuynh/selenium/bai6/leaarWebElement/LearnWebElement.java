package hanghuynh.selenium.bai6.leaarWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnWebElement {

    public static void main(String[] args) throws InterruptedException {
        //Khai báo driver chung
        WebDriver driver; //drider là trình điều khiển trình duyệt browser

        //Cài đặt driver cho tình duyệt cụ thể cần automation, kiểm tra phiên bản hiện tại là bao nhiêu, cài đặt phiên bản thích hợp lưu vào driver
        WebDriverManager.chromedriver().setup(); //cú pháp cài đặt driver cho chromebrowser thích hợp version

        driver = new ChromeDriver(); //Cú pháp khởi tạo (có "new" là khởi tạo)
        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.get("https://hrm.anhtester.com/");

        driver.findElement(By.xpath("//input[@id='iusername']"));
        driver.findElement(By.xpath("//input[@id = 'ipassword']"));
        driver.findElement(By.xpath("//button[@type = 'submit']"));


        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='iusername']"));
        WebElement inputPass = driver.findElement(By.xpath("//input[@id = 'ipassword']"));
        WebElement buttonSignin =   driver.findElement(By.xpath("//button[@type = 'submit']"));
        WebElement buttonSave =   driver.findElement(By.xpath("//button[@type = 'Save']"));

        //boolean inputUse = inputUsername.isEnabled();
        //boolean inputPa = inputPass.isEnabled();
        boolean dis = buttonSignin.isDisplayed();
        boolean save = buttonSave.isDisplayed();

        /*inputUsername.click();
        Thread.sleep(2000);
        inputUsername.sendKeys("hanghuynh121");

        inputUsername.click();
        Thread.sleep(2000);
        inputUsername.clear();

        inputUsername.click();
        Thread.sleep(2000);
        inputUsername.sendKeys("admin01");

        inputPass.click();
        Thread.sleep(2000);
        inputPass.sendKeys("123456");

        Thread.sleep(2000);
        buttonSignin.click();
         */

        Thread.sleep(2000);
        driver.quit();

    }
}
