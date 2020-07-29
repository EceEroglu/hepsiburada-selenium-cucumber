package pageObjects;

import environment.BaseTest;
import logger.Log;
import methods.SelectorType;
import org.junit.Assert;

public class LoginPage implements BaseTest {

    String txtbx_Email = "txtUserName";
    String txtbx_Password = "txtPassword";
    String Btn_Login = "//button[@id='btnLogin']";


    public void isPageDisplayed() {

        Log.INFO("Verify Title");
        String title =  browser.getPageTitle();
        Assert.assertEquals(title,"Üye Giriş Sayfası & Üye Ol - Hepsiburada");
    }

    public void enterEmail() throws InterruptedException {

        Log.INFO("Type E-mail");
        browser.enterTextBySendKeys(SelectorType.ID,"eroglu.ece@yandex.com", txtbx_Email);

    }

    public void enterPassword() throws InterruptedException {

        Log.INFO("Type Password");
        browser.enterTextBySendKeys(SelectorType.ID,"test12345",txtbx_Password);

    }

    public void clickLogin() {

        Log.INFO("Click Login");
        browser.waitForElementToClick(SelectorType.XPATH,Btn_Login,"5000");
        browser.click(SelectorType.XPATH,Btn_Login);

    }


}

