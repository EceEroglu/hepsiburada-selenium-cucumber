package pageObjects;

import environment.BaseTest;
import logger.Log;
import methods.SelectorType;
import org.junit.Assert;

public class CartPage implements BaseTest {

    String catProducTitlePath = "Milo Bebek Pudralı Kokulu topaklaşan İnce Kedi kumu 10 Lt";
    String vacuumCleanerProducTitlePath = "Samsung VC07R302MVP Toz Torbasız Elektrikli Süpürge (Mor)";
    String cargoTextFirstOptionPath = "//p[contains(text(),'daha ekleyin kargo bedava')]";
    String cargoTextFirstOptionPathForPrice = "//p[contains(text(),'50.10 TL')]";
    String freeShippingText = "#div.list-item free-shipping";

    public void isPageDisplayed() {

        Log.INFO("Verify Title");
        String title =  browser.getPageTitle();
        Assert.assertEquals(title,"Sepetim");

    }

    public void checkCatProductIsOnTheCart() {

        Log.INFO("Check if cat product is displayed on the cart");
        Assert.assertEquals((browser.isElementDisplayed(SelectorType.LINK_TEXT,catProducTitlePath)),true);

    }

    public void checkVacuumCleanerProductIsOnTheCart() {

        Log.INFO("Check if vacuum cleaner product is displayed on the cart");
        Assert.assertEquals((browser.isElementDisplayed(SelectorType.LINK_TEXT,vacuumCleanerProducTitlePath)),true);

    }

    public void checkCargoTextFirstOption() {

        Log.INFO("Checking cargo text option is not free");
        Assert.assertEquals((browser.isElementDisplayed(SelectorType.XPATH,cargoTextFirstOptionPath)),true);

    }

    public void checkCargoTextFirstOptionPrice() {

        Log.INFO("Checking cargo option price");
        Assert.assertEquals((browser.isElementDisplayed(SelectorType.XPATH,cargoTextFirstOptionPathForPrice)),true);

    }

    public void checkCargoSecondOption() {

        Assert.assertEquals((browser.isElementDisplayed(SelectorType.CSS,freeShippingText)),true);
    }

}
