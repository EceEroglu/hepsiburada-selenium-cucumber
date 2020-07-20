package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Cart extends Home {

    public Cart(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@src='https://productimages.hepsiburada.net/s/30/80/10276888576050.jpg']")
    WebElement catProduct;

    @FindBy(xpath = "//img[@src='https://productimages.hepsiburada.net/s/32/80/10359127932978.jpg']")
    WebElement vacuumCleanerProduct;

    @FindBy(xpath = "//p[contains(text(),\'Sepetinize 57.10 TL'lik ürün daha ekleyin kargo be\')]")
    WebElement cargoisNotFreeText;

    @FindBy(xpath = "//span[contains(text(),'Kargo Bedava')]")
    WebElement cargoIsFreeText;

    public void validateTitle() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "Sepetim");

    }

    public void isCatProductdisplayed() {

        Assert.assertTrue(catProduct.isDisplayed());

    }

    public void isVacuumCleanerProductdisplayed() {

        vacuumCleanerProduct.isDisplayed();
    }

    public void cargoIsNotFreeTextIsDisplayed() {

        Assert.assertTrue(cargoisNotFreeText.isDisplayed());

    }

    public String getCargoInfoText(String text) {

      return cargoisNotFreeText.getText();
    }

    public void verifyCargoInfoText() {

        String text = null;
        getCargoInfoText(text);
        Assert.assertTrue(text.contains("57.10"));

    }

    public void cargoIsFreeTextIsDisplayed() {

        Assert.assertTrue(cargoIsFreeText.isDisplayed());
    }

}
