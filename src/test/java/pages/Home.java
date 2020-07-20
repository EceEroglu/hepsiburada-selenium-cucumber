package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Home {

    public static final String url = "https://www.hepsiburada.com/";

    static WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='OldMyAccount-FUOWk user-info']")
    WebElement signInIcon;

    @FindBy(xpath = "//a[@id='login']")
    WebElement loginButton;

    @FindBy(xpath = "//input[contains(@placeholder,'Ürün, kategori veya marka ara')]")
    WebElement searchBar;

    @FindBy(xpath = " //div[contains(@class,'SearchBoxOld-buttonContainer')]")
    WebElement makeSearchIcon;

    @FindBy(xpath = "//span[contains(text(),'Hesab')]")
    WebElement account;

    @FindBy(xpath = "//img[@src='https://productimages.hepsiburada.net/s/30/280-413/10276888576050.jpg']")
    WebElement catProduct;

    @FindBy(xpath = "//img[@src='https://productimages.hepsiburada.net/s/32/280-413/10359128064050.jpg']")
    WebElement vacuumCleanerProduct;

    @FindBy(xpath = "//span[@id='shoppingCart']")
    WebElement goToCartIcon;

    public void navigateTo_Page(String url) {
        driver.get(url);
    }

    public void clickSignInIcon() {

        signInIcon.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void searchCatProduct() {

        searchBar.sendKeys("kedi");
        makeSearchIcon.click();

    }

    public void searchVacuumCleanerProduct() {

        searchBar.sendKeys("süpürge");
        makeSearchIcon.click();

    }

    public void validateTitle() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com");

    }

    public void accountisvisible() {

        account.isDisplayed();

    }

    public void selectCatProduct() {

        catProduct.click();
    }

    public void selectVacuumCleanerProduct() {

        vacuumCleanerProduct.click();
    }

    public void clickOnGoToCardIcon() {

        goToCartIcon.click();
    }

}
