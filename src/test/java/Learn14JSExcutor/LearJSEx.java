package Learn14JSExcutor;
/*
DÙNG KHI WEBELEMENT KHÔNG XỬ LÍ ĐƯỢC THÌ DÙNG JAVASCRIPTSEXECUTOR

1. 2 phương thức chính:
- excuteScript: thực thi script, uộc phải nghiên cứu rồi note lại dùng sau này khỏi phải tìm kiếm do ít script cần dùng
- executeAsyncScript: Hơi thiên về javascript, làm phức tạp vấn đề nhờ, không khuyên khích dùng

2. STEP:
- Import package: thuộc thư viện selenium
- Khởi tạo đối tượng cho class: không có từ khoá neww    JavascriptsExecutor js = (JavascriptExecutor) driver
- Gọi phương thức: js.executeScript(script, args)  ==> Giá trị trả lại boolean, Long, String, List, Map, Webelement,
        tìm kiếm script bằng ngôn ngữ lập trình javascript: search W3school => javascript ==> JS HTML DOM

3. HÀM CUỘN CHUỘT ĐẾN ELEMENT HAY NÊN DÙNG
WebElement element = driver.findElement(By.id("id_of_element"));
js.executeScript("arguments[0].scrollIntoView(true);", WebElement);
 */

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class LearJSEx extends BaseTest {

    JavascriptExecutor js; //Khai báo

    @Test
    public void jsExecutorDemo01() throws InterruptedException {
        // Creating the JavascriptExecutor interface object
       js = (JavascriptExecutor) driver;//Khởi tạo giá trị

        driver.get("https://anhtester.com/");
        Thread.sleep(1000);

        // Click on "Website Testing" module using JavascriptExecutor
        WebElement button = driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(1000);

        // Get page title, URL and Domain using JavascriptExecutor
        String titleText = js.executeScript("return document.title;").toString();
        System.out.println("Page Title is: " + titleText);

        String URLName = js.executeScript("return document.URL;").toString();
        System.out.println("URL is: " + URLName);

        String domainName = js.executeScript("return document.domain;").toString();
        System.out.println("Domain is: " + domainName);

        //Lấy chiều cao, rộng của trang web
        String Height = js.executeScript("return window.innerHeight;").toString();
        System.out.println("Height web: " + Height );
        String Width = js.executeScript("return window.innerWidth;").toString();
        System.out.println("Width web: " + Width );


        // Add Alert window using JavascriptExecutor
        js.executeScript("alert('Successfully Logged In');");

        Thread.sleep(2000);

    }

    @Test
    public void jsExecutorDemo02() throws InterruptedException {
        // Creating the JavascriptExecutor interface object
        js = (JavascriptExecutor) driver;//Khởi tạo giá trị

        driver.get("https://anhtester.com/");
        Thread.sleep(1000);

        //Cuộn đến element nào đó
        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Đăng ký học']"));
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(3000);


//        //Cuộn lên đầu trang
//        js.executeScript("window.scrollTo(0,0)");  // cuộn lên đầu trang
//        Thread.sleep(2000);

        //cuộn đến cuối trang
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);

        //Cuộn lên đầu trang
        js.executeScript("window.scrollTo(0,0)");  // cuộn lên đầu trang
        Thread.sleep(2000);

        //click [Selenium Java] button
        WebElement SJbutton = driver.findElement(By.xpath("//section[@class='slider-area']//div[6]//div[1]//a[1]"));
        js.executeScript("arguments[0].click();", SJbutton);
        Thread.sleep(2000);

        //click [Xem trước nội dung] button
        WebElement ReviewButton = driver.findElement(By.xpath("//a[@class='theme-btn w-100 theme-btn-light']"));
        js.executeScript("arguments[0].click();",ReviewButton);
        Thread.sleep(2000);

        //cuộn tới bài 14
        Actions act = new Actions(driver);
        WebElement cuonBai14 =driver.findElement(By.xpath("//button[@class='btn btn-link collapsed']"));
        act.moveToElement(cuonBai14);
        Thread.sleep(2000);


        //click [Bai14]
        WebElement Bai14 = driver.findElement(By.xpath("//button[@class='btn btn-link collapsed']"));
        js.executeScript("arguments[0].click();",Bai14);
        Thread.sleep(2000);

        //Click open [Bai14]
        WebElement OpenBai14 = driver.findElement(By.xpath("//li[@class='course-item-link']//a[@title='[Selenium Java] Bài 14: Cách dùng Javascript Executor để hành động']"));
        js.executeScript("arguments[0].click();",OpenBai14);
        Thread.sleep(2000);
    }
}



