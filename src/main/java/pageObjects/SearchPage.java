package pageObjects;

import environment.BaseTest;
import logger.Log;
import methods.SelectorType;
import org.junit.Assert;

import static methods.SelectorType.XPATH;

public class SearchPage implements BaseTest {

    String catProductPath = "//img[@src='https://productimages.hepsiburada.net/s/30/280-413/10276888641586.jpg']";
    String vacuumCleanerPath ="//img[@src='https://productimages.hepsiburada.net/s/32/280-413/10359127932978.jpg']";


    public void clickOnCatProduct() {

        Log.INFO("Click on cat product");
        browser.waitForElementToDisplay(XPATH,catProductPath,"5000");
        browser.click(SelectorType.XPATH,catProductPath);

    }

    public void clickOnVacuumCleanerProduct() {

        Log.INFO("Click on vacuum cleaner product");
        browser.waitForElementToDisplay(XPATH,vacuumCleanerPath,"5000");
        browser.click(SelectorType.XPATH,vacuumCleanerPath);

    }


}
