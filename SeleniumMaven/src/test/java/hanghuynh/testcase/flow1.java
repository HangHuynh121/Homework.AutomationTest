package hanghuynh.testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flow1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize(); //mở lớn màn hình

        driver.get("http://hrm.anhtester.com");

        Thread.sleep(3000);

        // get id, timf element bằng thuộc tính
        driver.findElement(By.id("iusername")).sendKeys("admin01");

        Thread.sleep(1000);

        //get pass, tìm element bằng thuộc tính
        driver.findElement(By.name("password")).sendKeys("123456");

        //Click login button, tìm element bằng xpath
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[2]/button")).click();
        Thread.sleep(10000);

        //Click [Dự án] button
        driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a")).click();
        Thread.sleep(10000);

        /*Click on [Dự án] button, xpath, /html/body/nav/div/div/ul/li[5]/a
        driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a")).click();
        Thread.sleep(2000);*/

        //Click on [Thêm mới] button, xpath
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/div[1]/div/a[2]")).click();
        Thread.sleep(10000);

        //Nhập "ecomercy" vào [Tiêu đề] textbox
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[1]/div/input")).sendKeys("acomercy");


        Thread.sleep(10000);

        driver.quit();


    }
}