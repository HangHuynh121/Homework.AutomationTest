package hanghuynh.selenium.bai5.LearnLocator;

import com.sun.tools.javac.Main;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://hrm.anhtester.com");

        // Bắt locator login form
        driver.findElement(By.id("iusername"));
        driver.findElement(By.id("ipassword"));

        //BẮT XPATH FORM ADD NEW PROJECT
        driver.findElement(By.xpath("//a[@href='https://hrm.anhtester.com/erp/projects-list']"));
        driver.findElement(By.xpath("(//a[@class='collapsed btn waves-effect waves-light btn-primary btn-sm m-0'][1]")); // bắt button thêm mới

        //WebElement inputuser = driver.findElement(By.id("iusername"));
        //WebElement inputpass = driver.findElement(By.id("ipassword"));

        //Bắt Xpath hết Form của Add New Project
        driver.findElement(By.xpath("//input[@placeholder ='Tiêu đề']"));  //Tiêu đề textbox
        driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-client_id-container']")); //Khách hàng
        driver.findElement(By.xpath("//input[@placeholder='Giờ ước tính']")); // Giờ ước tính
        driver.findElement(By.xpath("//span[@title='Cao nhất']")); //priority
        driver.findElement(By.xpath("//input[@class='form-control date' and @placeholder='Ngày bắt đầu']")); //Ngày bắt đầu
        driver.findElement(By.xpath("//input[@class='form-control date' and @placeholder='Ngày kết thúc']"));//Ngày kết thúc
        driver.findElement(By.xpath("//textarea[@class='form-control' and @placeholder='Tóm tắt']"));//Tóm tắt
        driver.findElement(By.xpath("//li[@class ='select2-search select2-search--inline']"));//Nhóm
        driver.findElement(By.xpath("//span[@title = 'Format']/span[@unselectable='on']);//Mô tả Format"));
        driver.findElement(By.xpath("//button[@title='Bold']"));//Mô tả B
        driver.findElement(By.xpath("//button[@title='Italic']"));//Mô tả I
        driver.findElement(By.xpath("//button[@title='Underline']"));//Mô tả U
        driver.findElement(By.xpath("//button[@title='Align text left']"));//Mô tả_Canh lề trái
        driver.findElement(By.xpath("//button[@title='Center text']"));//Mô tả_Canh lề giữa
        driver.findElement(By.xpath("//button[@title='Align text right']"));//Mô tả_Canh lề phải
        driver.findElement(By.xpath("//button[@title='Copy format']"));//Mô tả_Copy formart
        driver.findElement(By.xpath("//button[@title='Apply format']"));//Mô tả_Apply Format
        driver.findElement(By.xpath("//button[@title='Insert unordered list']"));// Mô tả Insert unordered list
        driver.findElement(By.xpath("//button[@title='Insert ordered list']"));// Mô tả Insert oddered list
        driver.findElement(By.xpath("//button[@title='Indent']"));// Mô tả Indent
        driver.findElement(By.xpath("//button[@title='Outdent']")); //Mô tả outdent
        driver.findElement(By.xpath("//button[@title='Insert hyperlink']")); //Mô tả chèn link
        driver.findElement(By.xpath("//button[@title='Remove hyperlink']")); //Mô tả remove link
        driver.findElement(By.xpath("//button[@title='Insert image']")); //Mô tả chèn ảnh
        driver.findElement(By.xpath("//button[@aria-label='Create a table']"));//Mô tả tạo bản
        driver.findElement(By.xpath("//body[@contenteditable='true']"));//bắt text
        driver.findElement(By.xpath("//button[@href='#add_form']"));//Đặt lại button
        driver.findElement(By.xpath("//div[@class ='card-footer text-right']//button[@class='btn btn-primary ladda-button' and @type = 'submit']"));//Lưu button

        //BẮT XPATH FORM ADD NEW EMPLOYEE
        driver.findElement(By.xpath("//li[@class='pc-item active']//a[contains(@class,'pc-link')]"));
        driver.findElement(By.xpath("//a[@class='collapsed btn waves-effect waves-light btn-primary btn-sm m-0']")); //button thêm mới

        //Bắt xpath hết form của add new employee
        driver.findElement(By.xpath("//form[@id='xin-form']//a[@href='#add_form']"));//Ẩn button
        driver.findElement(By.xpath("//form[@id='xin-form']//input[@placeholder='Tên']")); // bắt textbox Tên
        driver.findElement(By.xpath("//form[@id='xin-form']//input[@placeholder='Họ']")); // bắt textbox Họ
        driver.findElement(By.xpath("//form[@id='xin-form']//input[@placeholder='ID nhân viên']")); //Bắt ID nhân viên
        driver.findElement(By.xpath("//form[@id='xin-form']//input[@placeholder='Số liên lạc']"));//Bắt ID Số liên lạc
        driver.findElement(By.xpath("//form[@id='xin-form']//span[@id='select2-gender-8w-container']"));//Bắt Gender bombobox/textbox
        driver.findElement(By.xpath("//form[@id='xin-form']//span[@id='select2-gender-8w-container']")); //Bắt Email textbox






        Thread.sleep(3000);






    }
}
