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
  "status": "passed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_enter_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search catproduct",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.when_i_search_catproduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the catproduct",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_click_on_the_catproduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_add_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_go_to_cart()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: element click intercepted: Element \u003cspan id\u003d\"cartItemCount\" class\u003d\"OldMyAccount-3Gvfd OldMyAccount-2Nhg2\"\u003e...\u003c/span\u003e is not clickable at point (1462, 153). Other element would receive the click: \u003cdiv class\u003d\"ReactModal__Overlay ReactModal__Overlay--after-open\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d84.0.4147.89)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027DESKTOP-C0IFO17\u0027, ip: \u0027192.168.1.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d84.0.4147.30 (48b3e868b4cc0aa7e8149519690b6f6949e110a8-refs/branch-heads/4147@{#310}), userDataDir\u003dC:\\Users\\eceer\\AppData\\Local\\Temp\\scoped_dir21316_1718608869}, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dANY, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:51948}, acceptInsecureCerts\u003dfalse, browserVersion\u003d84.0.4147.89, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 038ed17e8122921e7b50d4db54519dc9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat methods.BrowserUtils.click(BrowserUtils.java:475)\r\n\tat pageObjects.ProductPage.goToCart(ProductPage.java:29)\r\n\tat stepDefs.StepDefinitions.and_i_go_to_cart(StepDefinitions.java:89)\r\n\tat ✽.I go to cart(classpath:Features/Steps.feature:15)\r\n",
  "status": "failed"
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
  "status": "passed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_enter_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search vacuumcleanerproduct",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.when_i_search_vacuumcleanerproduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the vacuumcleanerproduct",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_click_on_the_vacuumcleanerproduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_add_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_go_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify vacuumcleanerproduct is on the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_verify_vacuumcleanerproduct_is_on_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify cargo is free for vacuumcleanerproduct",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_verify_cargo_is_free_for_vacuumcleanerproduct()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: #div.list-item free-shipping (tried for 10 second(s) with 500 MILLISECONDS interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat methods.BrowserUtils.isElementDisplayed(BrowserUtils.java:370)\r\n\tat pageObjects.CartPage.checkCargoSecondOption(CartPage.java:54)\r\n\tat stepDefs.StepDefinitions.then_i_verify_cargo_is_free_for_vacuumcleanerproduct(StepDefinitions.java:139)\r\n\tat ✽.I verify cargo is free for vacuumcleanerproduct(classpath:Features/Steps.feature:35)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.cssSelector: #div.list-item free-shipping\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027DESKTOP-C0IFO17\u0027, ip: \u0027192.168.1.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:883)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:882)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\r\n\tat methods.BrowserUtils.isElementDisplayed(BrowserUtils.java:370)\r\n\tat pageObjects.CartPage.checkCargoSecondOption(CartPage.java:54)\r\n\tat stepDefs.StepDefinitions.then_i_verify_cargo_is_free_for_vacuumcleanerproduct(StepDefinitions.java:139)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.testng.junit.JUnit4TestRunner.start(JUnit4TestRunner.java:74)\r\n\tat org.testng.junit.JUnit4TestRunner.run(JUnit4TestRunner.java:65)\r\n\tat org.testng.TestRunner$1.run(TestRunner.java:656)\r\n\tat java.util.ArrayList.forEach(ArrayList.java:1257)\r\n\tat org.testng.TestRunner.runJUnitWorkers(TestRunner.java:847)\r\n\tat org.testng.TestRunner.privateRunJUnit(TestRunner.java:685)\r\n\tat org.testng.TestRunner.run(TestRunner.java:589)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:115)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:129)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:113)\r\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:111)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:203)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:155)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});