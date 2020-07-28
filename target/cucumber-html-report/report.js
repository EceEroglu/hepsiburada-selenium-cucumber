$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features/Steps.feature");
formatter.feature({
  "name": "Full scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add catproduct to cart less than 75",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@Positive"
    },
    {
      "name": "@Functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on MainPage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.given_i_am_on_mainpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.when_i_click_on_login()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d84.0.4147.89)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027DESKTOP-C0IFO17\u0027, ip: \u0027192.168.1.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d84.0.4147.30 (48b3e868b4cc0aa7e8149519690b6f6949e110a8-refs/branch-heads/4147@{#310}), userDataDir\u003dC:\\Users\\eceer\\AppData\\Local\\Temp\\scoped_dir21584_1225725738}, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dANY, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:50739}, acceptInsecureCerts\u003dfalse, browserVersion\u003d84.0.4147.89, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 4e894c6928ac37f7ac19b84a3e3088f8\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat methods.BrowserUtils.click(BrowserUtils.java:475)\r\n\tat pageObjects.HomePage.goToLogin(HomePage.java:37)\r\n\tat stepDefs.StepDefinitions.when_i_click_on_login(StepDefinitions.java:26)\r\n\tat ✽.I click on Login(classpath:Features/Steps.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_enter_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_enter_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I search catproduct",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.when_i_search_catproduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on the catproduct",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_click_on_the_catproduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I add product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_add_product_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I go to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_go_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify catproduct is on the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_verify_catproduct_is_on_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify cargo is not free for catproduct",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_verify_cargo_is_not_free_for_catproduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify cargo free option price for catproduct",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_verify_cargo_free_option_price_for_catproduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add vacuumcleanerproduct to cart greater than 75",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@Positive"
    },
    {
      "name": "@Functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on MainPage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.given_i_am_on_mainpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.when_i_click_on_login()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d84.0.4147.89)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027DESKTOP-C0IFO17\u0027, ip: \u0027192.168.1.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d84.0.4147.30 (48b3e868b4cc0aa7e8149519690b6f6949e110a8-refs/branch-heads/4147@{#310}), userDataDir\u003dC:\\Users\\eceer\\AppData\\Local\\Temp\\scoped_dir20348_772350780}, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dANY, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:50801}, acceptInsecureCerts\u003dfalse, browserVersion\u003d84.0.4147.89, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: cbb79c241979510b37b1bc9a25b8046e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat methods.BrowserUtils.click(BrowserUtils.java:475)\r\n\tat pageObjects.HomePage.goToLogin(HomePage.java:37)\r\n\tat stepDefs.StepDefinitions.when_i_click_on_login(StepDefinitions.java:26)\r\n\tat ✽.I click on Login(classpath:Features/Steps.feature:25)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_enter_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_enter_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I search vacuumcleanerproduct",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.when_i_search_vacuumcleanerproduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on the vacuumcleanerproduct",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_click_on_the_vacuumcleanerproduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I add product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_add_product_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I go to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_go_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify vacuumcleanerproduct is on the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_verify_vacuumcleanerproduct_is_on_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify cargo is free for vacuumcleanerproduct",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_verify_cargo_is_free_for_vacuumcleanerproduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});