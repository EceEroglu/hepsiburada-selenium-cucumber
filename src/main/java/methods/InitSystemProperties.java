package methods;

import environment.BaseTest;
import environment.WebDriverSetup;

public class InitSystemProperties implements BaseTest {

    WebDriverSetup chromeDriverSetup = new WebDriverSetup();

    public void setWebdriverSystemProperty() {
        System.setProperty("webdriver.chrome.driver", chromeDriverSetup.getChromeDriverPath());
        System.setProperty("webdriver.gecko.driver", chromeDriverSetup.getfirefoxDriverPath());
    }

}
