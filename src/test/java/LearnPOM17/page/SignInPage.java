package LearnPOM17.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    WebDriver driver;

    //Hàm xây dựng
    public  SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public String pageText = "Welcome to HRM System";
    private By inputEmail = By.xpath("//input[@id='iusername']");
    private By inputPassword = By.xpath("//input[@id='ipassword']");
    private By buttonSignIn = By.xpath("//button[@type='submit']");

    public void signIn(String email, String password) {
        driver.get("https://hrm.anhtester.com/");
        driver.findElement(inputEmail).sendKeys(email);
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(buttonSignIn).click();
    }
}
