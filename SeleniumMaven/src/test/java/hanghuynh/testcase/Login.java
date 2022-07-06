package hanghuynh.testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

    public static void main(String[] args) throws InterruptedException { //gọi hàm main vì chưa dùng framework
        System.out.println("Hello");

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();

        //2 - Đi đến 1 url

        driver.navigate().to("https://hrm.anhtester.com");

        Thread.sleep(10000);
        //3 - Lấy Title và in ra console

        System.out.println(driver.getTitle());

        // Thoát hẳn Browser

        driver.quit();
    }

}
