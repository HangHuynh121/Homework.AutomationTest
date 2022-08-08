package LearnPOM17.test;

import BT_JavaOOP3.common.BaseTest;
import LearnPOM17.page.SignInPage;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    public SignInPage signinpage;

    @Test
    public void TestSignInValid1() throws InterruptedException {
        signinpage = new SignInPage(driver); //Truyền Driver từ Basetest sang các class Page
        signinpage.signIn("client01","123456");
    }

    @Test
    public void TestSignInValid2() throws InterruptedException {
        signinpage = new SignInPage(driver); //Truyền Driver từ Basetest sang các class Page
        signinpage.signIn("admin01","123456");
           }

    @Test
    public void TestSignInValid3() throws InterruptedException {
        signinpage = new SignInPage(driver); //Truyền Driver từ Basetest sang các class Page
        signinpage.signIn("leader01","123456");
    }

    @Test
    public void TestSignInValid4() throws InterruptedException {
        signinpage = new SignInPage(driver); //Truyền Driver từ Basetest sang các class Page
        signinpage.signIn("employee01","123456");
    }

}
