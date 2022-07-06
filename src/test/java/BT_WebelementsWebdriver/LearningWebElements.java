package BT_WebelementsWebdriver;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LearningWebElements extends BaseTest {

        @Test
            public void Login() throws InterruptedException {

            createDriver();

            driver.get("https://hrm.anhtester.com/");
            Thread.sleep(3000);

            //Xpath
            //LOGIN
            driver.findElement(By.xpath("//input[@id='iusername']"));//xpath username textbox
            driver.findElement(By.xpath("//input[@id='ipassword']")); //xpath pass textbox
            driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]"));//xpath Login button

            WebElement inputuser = driver.findElement(By.xpath("//input[@id='iusername']")); //tạo biến user textbox theo UI
            WebElement inputPass = driver.findElement(By.xpath("//input[@id='ipassword']")); //tạo biến pass textbox theo UI
            WebElement clickLogin = driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")); //tạo biến Login button theo U

            inputuser.sendKeys("admin01");
            Thread.sleep(3000);
            inputPass.sendKeys("123456");
            Thread.sleep(3000);
            clickLogin.click();
            Thread.sleep(7000);

            closeDriver();
        }

        @Test
            public void AddNewProject() throws InterruptedException {

            createDriver();

            driver.get("https://hrm.anhtester.com/");

            Thread.sleep(3000);

            //LOGIN
            driver.findElement(By.xpath("//input[@id='iusername']"));//xpath username textbox
            driver.findElement(By.xpath("//input[@id='ipassword']")); //xpath pass textbox
            driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]"));//xpath Login button

            WebElement inputuser = driver.findElement(By.xpath("//input[@id='iusername']")); //tạo biến user textbox theo UI
            WebElement inputPass = driver.findElement(By.xpath("//input[@id='ipassword']")); //tạo biến pass textbox theo UI
            WebElement clickLogin = driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")); //tạo biến Login button theo U

            inputuser.sendKeys("admin01");
            Thread.sleep(3000);
            inputPass.sendKeys("123456");
            Thread.sleep(3000);
            clickLogin.click();
            Thread.sleep(4000);

            //PROJECT MENU

            driver.findElement(By.xpath("//a[@href='https://hrm.anhtester.com/erp/projects-list']")); //Xpath project menu
            WebElement clickProject = driver.findElement(By.xpath("//a[@href='https://hrm.anhtester.com/erp/projects-list']"));
            clickProject.click();
            Thread.sleep(4000);

            driver.findElement(By.xpath("//a[contains(normalize-space(),'Thêm mới')]")); //xpath Thêm mới button theo UI
            WebElement clickAddProject = driver.findElement(By.xpath("//a[contains(normalize-space(),'Thêm mới')]"));
            clickAddProject.click();
            Thread.sleep(4000);


            //ADD NEW PROJECT

            driver.findElement(By.xpath("//div[@id='accordion']//input[@placeholder='Tiêu đề']")); //xpath Tiêu đề textbox theo UI
            WebElement inputTieude = driver.findElement(By.xpath("//div[@id='accordion']//input[@placeholder='Tiêu đề']"));
            inputTieude.sendKeys("Hanghuynh");
            Thread.sleep(2000);


            driver.findElement(By.xpath("//span[@id='select2-client_id-container']")).click(); //xpath Khach hàng combobox (động)
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[@role='searchbox']")).sendKeys("Client 02");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[contains(normalize-space(),'Client 02')]")).click();
            Thread.sleep(1000);


            driver.findElement(By.xpath("//div[@id='accordion']//input[@placeholder='Giờ ước tính']")).sendKeys("5000"); //xpath Giờ ước tính textbox
            //WebElement selectTime = driver.findElement(By.xpath("//div[@id='accordion']//input[@placeholder='Giờ ước tính']"));//selectTime.sendKeys();
            Thread.sleep(000);

            driver.findElement(By.xpath("//select[@name = 'priority']//following::span[1]")).click(); /// xpath Priority combobox (tĩnh)
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[@role='searchbox']")).sendKeys("Cao");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[normalize-space()='Cao']")).click();
            Thread.sleep(1000);


            driver.findElement(By.xpath("//textarea[@id='summary']")).sendKeys("Food & Beverage");// xpath Tóm Tắt

            driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).click(); //xpath Nhóm combobox
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Nhóm']")).sendKeys("Hai Mai");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[normalize-space()='Hai Mai']")).click();
            Thread.sleep(5000);

            //Ngày bắt đầu, và ngày kết thúc thêm thủ công

            driver.findElement(By.xpath("//div[@class='card-footer text-right']//button[@type='submit']")). click();
            Thread.sleep(5000);

            closeDriver();

           }


           @Test
            public void AddNewTask() throws InterruptedException {

            createDriver();

            driver.get("https://hrm.anhtester.com/erp/tasks-list");
            Thread.sleep(3000);

               //LOGIN
               driver.findElement(By.xpath("//input[@id='iusername']"));//xpath username textbox
               driver.findElement(By.xpath("//input[@id='ipassword']")); //xpath pass textbox
               driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]"));//xpath Login button

               WebElement inputuser = driver.findElement(By.xpath("//input[@id='iusername']")); //tạo biến user textbox theo UI
               Thread.sleep(1000);
               WebElement inputPass = driver.findElement(By.xpath("//input[@id='ipassword']")); //tạo biến pass textbox theo UI
               Thread.sleep(1000);
               WebElement clickLogin = driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")); //tạo biến Login button theo U
               Thread.sleep(1000);

               inputuser.sendKeys("admin01");
               Thread.sleep(3000);
               inputPass.sendKeys("123456");
               Thread.sleep(3000);
               clickLogin.click();
               Thread.sleep(4000);



               // TASK MENU

               driver.findElement(By.xpath("//a[@href='https://hrm.anhtester.com/erp/tasks-list']")).click(); //xpath [Task] menu
               Thread.sleep(1000);

               driver.findElement(By.xpath("//a[contains(normalize-space(),'Thêm mới')]")).click(); // xpath [Thêm mới] button
               Thread.sleep(1000);

               // ADD NEW TASK

               driver.findElement(By.xpath("//input[@placeholder='Tiêu đề']")).sendKeys("HangHuynh"); //xpath [Tiêu để] textbox
               Thread.sleep(2000);

               driver.findElement(By.xpath("//input[@placeholder='Giờ ước tính']")).sendKeys("3"); //xpath [Giờ ước tính] textbox
               Thread.sleep(2000);

               driver.findElement(By.xpath("//span[@class='selection']")).click(); //xpath [Dự Án] combobox
               Thread.sleep(1000);
               driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Hanghuynh"); //nhập tìm kiếm
               Thread.sleep(1000);
               driver.findElement(By.xpath("//li[normalize-space()='Hanghuynh']")).click();
               Thread.sleep(2000);

               driver.findElement(By.xpath("//textarea[@placeholder='Tóm tắt']")).sendKeys("Hoàn thành task 03.07.2022, khi hoàn thành thì push source lên git");
               Thread.sleep(4000);

               //10'' [Ngày bắt đầu], [Ngày kết thúc]
               Thread.sleep(6000);

               driver.findElement(By.xpath("//button[normalize-space()='Lưu']")).click();
               Thread.sleep(5000);


            closeDriver();
           }


    }


