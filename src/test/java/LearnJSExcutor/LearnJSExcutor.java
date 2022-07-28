package LearnJSExcutor;

import BT_JavaOOP3.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LearnJSExcutor extends BaseTest {

    JavascriptExecutor js; //khai báo

    @Test
    public void jsExecutorDemo01() throws InterruptedException {
        // Creating the JavascriptExecutor interface object
        JavascriptExecutor js;

        driver.get("https://anhtester.com/");
        Thread.sleep(1000);

        js = (JavascriptExecutor) driver;

        // Click on "Website Testing" module using JavascriptExecutor
        WebElement button = driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']"));
        js.executeScript("arguments[0].click();", button);  //click ngầm
        Thread.sleep(1000);

        // Get page title and Domain using JavascriptExecutor
        String titleText = js.executeScript("return document.title;").toString();
        System.out.println("Page Title is: " + titleText);

        String domainName = js.executeScript("return document.URL;").toString();
        System.out.println("URL is: " + domainName);

        // Add Alert window using JavascriptExecutor
        js.executeScript("alert('Successfully Logged In');");

        //move to element, cuộn đến 1 đối tượng
        WebElement element = driver.findElement(By.xpath(""));

        js.executeScript("arguments[0].scrollIntoView(true);", element);

        Thread.sleep(2000);
    }

}
/*
JavascripExcutor
- scrip click để xử lí click ngầm (khỏi cuộn chuột)
- scrip scroll to element (True- trên, Fail - dưới)
- script để get text của element
- script getAttribute của element
 */
