package pageObjects;

import environment.BaseTest;
import logger.Log;
import methods.SelectorType;
import org.junit.Assert;

import static methods.SelectorType.ID;
import static methods.SelectorType.XPATH;

public class ProductPage implements BaseTest {

    String addToCartID = "addToCart";
    String goToCartPath = "//span[@id='cartItemCount']";


    public void addProductToCart() {

        Log.INFO("Click on add to cart icon for cat product");
        browser.waitForElementToClick(ID,addToCartID,"5000");
        browser.click(SelectorType.ID,addToCartID);

    }

    public void goToCart() {

        Log.INFO("Click on go to cart icon");
        browser.waitForElementToClick(XPATH,goToCartPath,"5000");
        browser.click(SelectorType.XPATH,goToCartPath);
    }

}
