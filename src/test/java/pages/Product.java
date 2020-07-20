package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Product extends Home {

    public Product(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@id='addToCart']")
    WebElement addToCartIcon;

    public void clickOnAddToCart() {

       addToCartIcon.click();

    }

}
