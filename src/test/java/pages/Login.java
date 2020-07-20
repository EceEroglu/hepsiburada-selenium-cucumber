package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Login extends Home{

    public Login(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "txtUserName")
    WebElement txtbx_Email;

    @FindBy(id = "txtPassword")
    WebElement txtbx_Password;

    @FindBy(xpath = "//button[@id='btnLogin']")
    WebElement Btn_Login;


    public WebElement get_Txtbx_Email() {
        return txtbx_Email;
    }

    public WebElement get_Txtbx_Password() {
        return txtbx_Password;
    }

    public void validateTitle() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "Üye Giriş Sayfası & Üye Ol - Hepsiburada");

    }

    public void click_On_LogIn_Button()  {
        Btn_Login.click();
    }

    public void enter_Email() {
        get_Txtbx_Email().clear();
        get_Txtbx_Email().sendKeys("eroglu.ece@yandex.com");
    }

    public void enter_Password() {
        get_Txtbx_Password().clear();
        get_Txtbx_Password().sendKeys("test12345");
    }

}
