package pageObjects;

import environment.BaseTest;
import logger.Log;
import org.junit.Assert;

import static methods.SelectorType.XPATH;

public class HomePage implements BaseTest {

    // elements
    String signInIconPath = "//span[@class='OldMyAccount-2BwAt'][contains(text(),'Yap')]";
    String loginButtonPath =  "//a[@id='login']";
    String searchBarPath = "//input[contains(@placeholder,'Ürün, kategori veya marka ara')]";
    String makeSearchIconPath = "//div[contains(@class,'SearchBoxOld-buttonContainer')]";
    String accountPath = "//span[contains(text(),'Hesab')]";
    String catProductPath = "//img[@src='https://productimages.hepsiburada.net/s/30/280-413/10276888576050.jpg']";
    String vacuumCleanerProductPath = "//img[@src='https://productimages.hepsiburada.net/s/32/280-413/10359128064050.jpg']";
    String goToCartIconPath = "//span[@id='shoppingCart']";


    public void isPageDisplayed() {

        Log.INFO("Verify page is displayed");
        browser.navigateTo("https://www.hepsiburada.com/");
        Log.INFO("Verify Title");
        String title =  browser.getPageTitle();
        Assert.assertEquals(title,"Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com");
    }


    public void goToLogin() throws InterruptedException {

        Log.INFO("Hover on SignIn Button");
        browser.hoverOverElement(XPATH,signInIconPath);
        Log.INFO("Click Login Button");
        browser.click(XPATH, loginButtonPath);

    }

    public void accountIsVisible() throws InterruptedException {

        Log.INFO("Check if account is displayed");
        browser.isElementDisplayed(XPATH,accountPath);

    }

    public void searchCatProduct() throws InterruptedException {


        Log.INFO("Search any cat product");
        browser.enterTextBySendKeys(XPATH,"kedi", searchBarPath);


    }


}

