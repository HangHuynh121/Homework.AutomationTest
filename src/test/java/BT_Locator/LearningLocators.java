package BT_Locator;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public  class LearningLocators extends BaseTest {
        public static void NewPro(){
        createDriver();

        driver.get("https://hrm.anhtester.com/");

        //LOGIN
        driver.findElement(By.xpath("//input[@id='iusername']"));//xpath username textbox
        driver.findElement(By.xpath("//input[@id='ipassword']")); //xpath pass textbox
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]"));//xpath Login button

        WebElement inputuser = driver.findElement(By.xpath("//input[@id='iusername']")); //tạo biến user textbox theo UI
        WebElement inputpass = driver.findElement(By.xpath("//input[@id='ipassword']")); //tạo biến pass textbox theo UI
        WebElement clickLogin =  driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")); //tạo biến Login button theo UI


        //PROJECT
        driver.findElement(By.xpath("//li[@class='pc-item']//a[@href='https://hrm.anhtester.com/erp/projects-list']")); //Xpath project menu theo UI
        driver.findElement(By.xpath("//a[contains(.,'Thêm mới')]")); //xpath Thêm mới button theo UI

        WebElement clickProject =  driver.findElement(By.xpath("//li[@class='pc-item']//a[@href='https://hrm.anhtester.com/erp/projects-list']"));
        WebElement clickAddProject = driver.findElement(By.xpath("//a[contains(.,'Thêm mới')]"));

        //xpath Thêm mới dự án form
        driver.findElement(By.xpath("//div[@id='accordion']//input[@placeholder='Tiêu đề']")); //xpath Tiêu đề textbox theo UI
        driver.findElement(By.xpath("//select[@id='client_id']")); //xpath Khach hàng combobox (động)
        driver.findElement(By.xpath("//div[@id='accordion']//input[@placeholder='Giờ ước tính']")); //xpath Giờ ước tính textbox
        driver.findElement(By.xpath("//div[@id='accordion']//select[@name= 'priority']")); // xpath Priority combobox (tĩnh)
        driver.findElement(By.xpath("//input[@placeholder='Ngày bắt đầu']")); //xpath Ngày bắt đầu textbox
        driver.findElement(By.xpath("//input[@placeholder='Ngày kết thúc']")); //xpath Ngày kết thúc textbox
        driver.findElement(By.xpath("//textarea[@id='summary']")); //xpath Tóm tắt textbox
        driver.findElement(By.xpath("//select[@data-placeholder = 'Nhóm']")); //xpath Nhóm combobox

            //Mô tả
        driver.findElement(By.xpath("//span[@class='k-dropdown-wrap k-state-default']/following-sibling::select")); //xpath Format combobox
        driver.findElement(By.xpath("//button[@title='Bold']")); //xpath B button
        driver.findElement(By.xpath("//button[@title='Italic']")); //xpath I button
        driver.findElement(By.xpath("//button[@title='Underline']")); //xpath U button
        driver.findElement(By.xpath("//button[@title='Align text left']")); //xpath Canh lề trái button
        driver.findElement(By.xpath("//button[@title='Center text']")); //xpath canh giữa button
        driver.findElement(By.xpath("//button[@title='Align text right']")); //xpath canh lề phải button
        driver.findElement(By.xpath("//button[@title='Copy format']")); //xpath copy format button
        driver.findElement(By.xpath("//button[@title='Apply format']")); //xpath apply format button
        driver.findElement(By.xpath("//button[@title='Insert unordered list']")); //xpath unordered list  button
        driver.findElement(By.xpath("//button[@title='Insert ordered list']")); //Xpath ordered list
        driver.findElement(By.xpath("//button[@title='Indent']")); //xpath lề trong button
        driver.findElement(By.xpath("//button[@title='Outdent']")); //xpath lề ngoài button
        driver.findElement(By.xpath("//button[@title='Insert hyperlink']")); //xpath insert link button
        driver.findElement(By.xpath("//button[@title='Remove hyperlink']")); //xpath remove link button
        driver.findElement(By.xpath("//button[@title='Insert image']")); //xpath insert image button
        driver.findElement(By.xpath("//button[@title='Create a table']")); //xpath tạo bảng button
        driver.findElement(By.xpath("//body/p[1]")); //xpath text1 textbox, 1-n
        driver.findElement(By.xpath("//button[contains(text(),'Đặt lại')]")); //xpath Đặt lại button
        driver.findElement(By.xpath("//div[@class='card-footer text-right']//button[@type='submit']")); //xpath Lưu butoon

        //EMPLOYEE
        driver.findElement(By.xpath("//a[contains(.,'Nhân viên')]")); //xpath Nhân viên menu
        driver.findElement(By.xpath("//a[contains(.,'Thêm mới')]")); //xpath thêm mới button

        //xpath thêm mới nhân viên
        driver.findElement(By.xpath("//a[contains(.,'Ẩn')]")); //Xpath Ẩn button
        driver.findElement(By.xpath("//input[@placeholder='Tên']")); //xpath Tên textbox
        driver.findElement(By.xpath("//input[@placeholder='Họ']")); //xpath Họ textbox
        driver.findElement(By.xpath("//input[@placeholder='ID nhân viên']")); //xpath ID nhân viên textbox
        driver.findElement(By.xpath("//input[@placeholder='Số liên lạc']")); //xpath Số liên lạc textbox
        driver.findElement(By.xpath("//select[@name='gender']")); //xpath Gender combobox, select
        driver.findElement(By.xpath("//input[@placeholder='Email']")); //Email textbox
        driver.findElement(By.xpath("//input[@placeholder='Tên người dùng']")); //Tên người dùng textbox
        driver.findElement(By.xpath("//input[@placeholder='Mật khẩu']")); //Mật khẩu textbox
        driver.findElement(By.xpath("//select[@name='office_shift_id']"));// ofice shift combobox, select
        driver.findElement(By.xpath("//select[@data-placeholder='Vai trò']")); //Vai trò combobox, select
        driver.findElement(By.xpath("//select[@id='department_id']"));//Khoa combobox, select
        driver.findElement(By.xpath("//input[@placeholder='Tổng lương']")); //Tổng lương textbox
        driver.findElement(By.xpath("//input[@placeholder='Tỷ lệ hàng giờ']")); //Tỷ lệ hàng giờ textbox
        driver.findElement(By.xpath("//select[@id='salay_type']")); //Loại Páylip combobox, select
        driver.findElement(By.xpath("//button[contains(text(),'Đặt lại')]"));// đặt lại button
        driver.findElement(By.xpath("//div[@class='card-footer text-right']//button[@type='submit']"));// lưu button

        driver.findElement(By.xpath("//input[@name='file']")); //Ảnh hồ sơ

        closeDriver();

    }
}
