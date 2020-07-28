package methods;

import environment.BaseTest;
import environment.DriverManager;
import environment.DriverManagerFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import logger.Log;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BrowserUtils extends SelectElementByType implements BaseTest {
    private WebElement element = null;
    private String old_win = null;
    private String lastWinHandle;
    private String urlToNavigate = null;
    private WebElement dropdown = null;
    private Select selectList = null;

    // initial web driver hardcoded
    //DriverManager driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);

    //initial web driver by user selection
    DriverManager driverManager = DriverManagerFactory.getManagerByUserSelection();

    //initial web driver according to user selection

    WebDriver driver;
    WebDriverWait wait;


    ////////////////////
    // NAVIGATION METHODS
    ////////////////////

    /**
     * Method to open link
     *
     * @param url
     *            : String : URL for navigation
     */

    public void navigateTo(String url) {

        driver = driverManager.getDriver();
        wait = new WebDriverWait(driver, 10);

        // get url from feature file
        if (url.contains("http")) {
            urlToNavigate = url;
        }

        // get url value from prop file
        else {
            urlToNavigate = props.getProperty(url);
        }

        Log.INFO("Navigate to: " + urlToNavigate);
        driver.get(urlToNavigate);

    }

    /**
     * Method to navigate back & forward
     *
     * @param direction
     *            : String : Navigate to forward or backward
     */
    public void navigate(String direction) {
        if (direction.equals("back"))
            driver.navigate().back();
        else
            driver.navigate().forward();
    }

    /** Method to quite webdriver instance */
    public void closeDriver() {
        // driver.quit();
        driverManager.quitDriver();

    }

    /** Method to refresh browser */
    public void refreshDriver() {
        driver.navigate().refresh();

    }


    /**
     * Method to hover on element
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void hoverOverElement(SelectorType selectorType, String accessName) {
        Actions action = new Actions(driver);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        action.moveToElement(element).perform();
    }

    /**
     * Method to scroll page to particular element
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void scrollToElement(SelectorType selectorType, String accessName) {
        element = wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
    }

    /**
     * Method to scroll page to top or end
     *
     * @param to
     *            : String : Scroll page to Top or End
     * @throws Exception
     */
    public void scrollPage(String to) throws Exception {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        if (to.equals("end"))
            executor.executeScript(
                    "window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
        else if (to.equals("top"))
            executor.executeScript(
                    "window.scrollTo(Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight),0);");
        else
            throw new Exception("Exception : Invalid Direction (only scroll \"top\" or \"end\")");
    }

    /** Method to switch to new window */
    public void switchToNewWindow() {
        old_win = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles())
            lastWinHandle = winHandle;
        driver.switchTo().window(lastWinHandle);
    }

    /** Method to switch to old window */
    public void switchToOldWindow() {
        driver.switchTo().window(old_win);
    }

    /**
     * Method to switch to window by title
     *
     * @param windowTitle
     *            : String : Name of window title to switch
     * @throws Exception
     */
    public void switchToWindowByTitle(String windowTitle) throws Exception {
        // System.out.println("++"+windowTitle+"++");
        old_win = driver.getWindowHandle();
        boolean winFound = false;
        for (String winHandle : driver.getWindowHandles()) {
            String str = driver.switchTo().window(winHandle).getTitle();
            // System.out.println("**"+str+"**");
            if (str.equals(windowTitle)) {
                winFound = true;
                break;
            }
        }
        if (!winFound)
            throw new Exception("Window having title " + windowTitle + " not found");
    }

    /** Method to close new window */
    public void closeNewWindow() {
        driver.close();
    }

    /**
     * Method to switch frame using web element frame
     *
     * @param selectorType
     *            : String : Locator type (index, id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void switchFrame(SelectorType selectorType, String accessName) {
        if (selectorType.toString().equalsIgnoreCase("index"))
            driver.switchTo().frame(accessName);
        else {
            element = wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
            driver.switchTo().frame(element);
        }
    }

    /** method to switch to default content */
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    ///////////////////
    // ASSERTION METHODS
    ///////////////////

    /**
     * Method to get page URL
     *
     * @return String
     */
    public String getPageUrl() {
        String pageUrl = driver.getCurrentUrl();
        Log.INFO("Page URL: " + pageUrl);
        return pageUrl;
    }

    /**
     * Method to get page title
     *
     * @return String
     */
    public String getPageTitle() {
        String pageTitle = driver.getTitle();
        Log.INFO("Page title: " + pageTitle);
        return pageTitle;
    }

    /**
     * Method to verify page title
     *
     * @param title
     *            : String : expected title
     */
    public void checkTitle(String title) throws TestCaseFailed {
        String pageTitle = getPageTitle();

        if (!pageTitle.equals(title)) {
            throw new TestCaseFailed(
                    "Page Title Not Matched, Expected Title: " + title + ", Actual Page Title : " + pageTitle);
        } else {
            Log.INFO("Page Title Matched, Actual Page Title : " + pageTitle);
        }

    }


    /**
     * Method to get element text
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     * @return String
     */
    public String getElementText(SelectorType selectorType, String accessName) {
        element = wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        return element.getText();

    }

    /**
     * Method to check element text
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param actualValue
     *            : String : Expected element text
     * @param accessName
     *            : String : Locator value
     */
    public void checkElementText(SelectorType selectorType, String actualValue, String accessName) throws TestCaseFailed {
        String elementText = getElementText(selectorType, accessName);

        if (!elementText.equals(actualValue)) {
            throw new TestCaseFailed("Expected Text: " + actualValue + " Not Matched the Actual One: " + elementText);
        } else {
            Log.INFO("Text Matched");
        }
    }

    /**
     * Method to return element status - enabled?
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     * @return Boolean
     */
    public boolean isElementEnabled(SelectorType selectorType, String accessName) {
        element = wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        return element.isEnabled();
    }

    /**
     * Element enabled checking
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void checkElementEnable(SelectorType selectorType, String accessName) throws TestCaseFailed {
        boolean result = isElementEnabled(selectorType, accessName);
        if (!result) {
            throw new TestCaseFailed("Element: " + accessName + " Not Enabled");
        } else {
            Log.INFO("Element Enabled");
        }
    }

    /**
     * method to get attribute value
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     * @param attributeName
     *            : String : attribute name
     * @return String
     */
    public String getElementAttribute(SelectorType selectorType, String accessName, String attributeName) {
        element = wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        return element.getAttribute(attributeName);
    }

    /**
     * method to check attribute value
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param attributeName
     *            : String : attribute name
     * @param attributeValue
     *            : String : attribute value
     * @param accessName
     *            : String : Locator value
     */
    public void checkElementAttribute(SelectorType selectorType, String attributeName, String attributeValue, String accessName)
            throws TestCaseFailed {
        String attrVal = getElementAttribute(selectorType, accessName, attributeName);
        if (!attrVal.equals(attributeValue)) {
            throw new TestCaseFailed(
                    "Actual Attribute Value: " + attrVal + " Not Matched The Expected One: " + attributeValue);
        } else {
            Log.INFO("Attribute Value Matched");
        }
    }

    /**
     * method to get element status - displayed?
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     * @return Boolean
     */
    public boolean isElementDisplayed(SelectorType selectorType, String accessName) {
        element = wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        return element.isDisplayed();
    }

    /**
     * method to check element presence
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void checkElementPresence(SelectorType selectorType, String accessName) throws TestCaseFailed {

        if (!isElementDisplayed(selectorType, accessName)) {
            throw new TestCaseFailed("Element: " + accessName + " Not Presented");
        } else

        {
            Log.INFO("Element Present");
        }
    }

    /**
     * method to check element not presence
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void checkElementNotDisplayed(SelectorType selectorType, String accessName) throws TestCaseFailed {

        if (isElementDisplayed(selectorType, accessName)) {
            throw new TestCaseFailed("Element: " + accessName + " Presented");
        } else

        {
            Log.INFO("Element Not Presented");
        }
    }

    /**
     * method to assert checkbox check/uncheck
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     * @param shouldBeChecked
     */
    public void isCheckboxChecked(SelectorType selectorType, String accessName, boolean shouldBeChecked) throws TestCaseFailed {
        WebElement checkbox = wait
                .until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        if ((!checkbox.isSelected()) && shouldBeChecked)
            throw new TestCaseFailed("Checkbox is not checked");
        else if (checkbox.isSelected() && !shouldBeChecked)
            throw new TestCaseFailed("Checkbox is checked");
    }

    /**
     * method to assert radio button selected/unselected
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     * @param shouldBeChecked
     */
    public void isRadioButtonSelected(SelectorType selectorType, String accessName, boolean shouldBeSelected)
            throws TestCaseFailed {
        WebElement radioButton = wait
                .until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        if ((!radioButton.isSelected()) && shouldBeSelected)
            throw new TestCaseFailed("Radio Button not selected");
        else if (radioButton.isSelected() && !shouldBeSelected)
            throw new TestCaseFailed("Radio Button is selected");
    }


    /**
     * method to get javascript pop-up alert text
     *
     * @return String
     */
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }



    ///////////////////////////
    // CLICK ON ELEMENTS METHODS
    ///////////////////////////

    /**
     * Method to click on an element
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void click(SelectorType selectorType, String accessName) {
        element = wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        element.click();
    }


    ////////////////
    // INPUT METHODS
    ///////////////

    /**
     * Method to enter text into text field, using send keys
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param text
     *            : String : Text value to enter in field
     * @param accessName
     *            : String : Locator value
     */
    public void enterTextBySendKeys(SelectorType selectorType, String text, String accessName) {
        wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        driver.findElement(getElementByType(selectorType, accessName)).sendKeys(text);
    }

    /**
     * Method to enter text into text field, using actions
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param text
     *            : String : Text value to enter in field
     * @param accessName
     *            : String : Locator value
     */

    public void enterTextByActions(SelectorType selectorType, String text, String accessName) {
        wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.click();
        actions.sendKeys(text);
        actions.build().perform();
    }

    /**
     * Method to clear text of text field
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void clearText(SelectorType selectorType, String accessName) {
        wait.until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        driver.findElement(getElementByType(selectorType, accessName)).clear();
    }


    /**
     * Method to check check-box
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void checkCheckbox(SelectorType selectorType, String accessName) {
        WebElement checkbox = wait
                .until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        if (!checkbox.isSelected())
            checkbox.click();
    }

    /**
     * Method to uncheck check-box
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void uncheckCheckbox(SelectorType selectorType, String accessName) {
        WebElement checkbox = wait
                .until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        if (checkbox.isSelected())
            checkbox.click();
    }

    /**
     * Method to select radio button
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     */
    public void selectRadioButton(SelectorType selectorType, String accessName) {
        WebElement radioButton = wait
                .until(ExpectedConditions.presenceOfElementLocated(getElementByType(selectorType, accessName)));
        if (!radioButton.isSelected())
            radioButton.click();
    }

    /////////////////////////
    // HANDLE ALLERTS METHODS
    ////////////////////////

    /**
     * Method to handle alert
     *
     * @param decision
     *            : String : Accept or dismiss alert
     */
    public void handleAlert(String decision) {
        if (decision.equals("accept"))
            driver.switchTo().alert().accept();
        else
            driver.switchTo().alert().dismiss();
    }

    ////////////////////////
    // DELETE COOKIES METHODS
    ////////////////////////
    /**
     * Method to delete cookie
     */
    public void deleteCookies() {

        driver.manage().deleteAllCookies();

    }

    //////////////////////////////
    // WAITING FOR ELEMENTS METHODS
    //////////////////////////////

    /**
     * Method to wait
     *
     * @param time
     *            : String : Time to wait
     * @param method
     *            : String : wait by sleep or implicit method
     * @throws NumberFormatException
     * @throws InterruptedException
     */
    public void wait(String time) throws NumberFormatException, InterruptedException {
        // sleep method takes parameter in milliseconds
        Log.INFO("Wait: " + time + " sec");
        Thread.sleep(Integer.parseInt(time) * 1000);
    }

    /**
     * Method to Explicitly wait for element to be displayed
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     * @param duration
     *            : String : Time to wait for element to be displayed
     */
    public void waitForElementToDisplay(SelectorType selectorType, String accessName, String duration) {
        By byEle = getElementByType(selectorType, accessName);
        WebDriverWait wait = (new WebDriverWait(driver, Integer.parseInt(duration) * 1000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byEle));
    }

    /**
     * Method to Explicitly wait for element to be enabled=click
     *
     * @param selectorType
     *            : String : Locator type (id, name, class, xpath, css)
     * @param accessName
     *            : String : Locator value
     * @param duration
     *            : String : Time to wait for element to be clickable
     */
    public void waitForElementToClick(SelectorType selectorType, String accessName, String duration) {
        By byEle = getElementByType(selectorType, accessName);
        WebDriverWait wait = (new WebDriverWait(driver, Integer.parseInt(duration) * 1000));
        wait.until(ExpectedConditions.elementToBeClickable(byEle));
    }

    ///////////////////////
    // SCREEN SHOTS METHODS
    ///////////////////////

    public String getSnapshotFolderPath() {
        File currentDirFile = new File("Screenshots");
        String path = currentDirFile.getAbsolutePath();

        return path;
    }

    /**
     * Method to take screen shot and save in ./Screenshots folder
     *
     * @return
     */
    public String takeScreenShot() throws IOException {

        Log.INFO("Taking snapshot");
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar cal = Calendar.getInstance();

        String snapshotFileName = "screenshot" + dateFormat.format(cal.getTime()) + ".png";
        String pathToSnapshot = getSnapshotFolderPath() + "/" + snapshotFileName;

        FileUtils.copyFile(scrFile, new File(pathToSnapshot));

        return snapshotFileName;

    }

    /**
     * Method to take screen shot to allure report
     *
     * @return
     */
    public byte[] embedScreenshotInReport() throws IOException {

        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        return screenshot;

    }


    @After
    public void tearDown(Scenario scenario) {

        Log.INFO("Scenario: " + scenario + ", failed taking snapshot");

        if (scenario.isFailed()) {
            // Take a screenshot if for failed scenario
            byte[] screenshot = null;
            try {
                screenshot = embedScreenshotInReport();
            } catch (IOException e) {
                e.printStackTrace();
            }

            scenario.embed(screenshot, "image/png");
        }
    }

}
