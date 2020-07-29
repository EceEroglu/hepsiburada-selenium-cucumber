package stepDefs;

import environment.BaseTest;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import logger.Log;
import java.io.IOException;


public class Hooks implements BaseTest {


    @Before(order=0)
    public void beforeScenario(Scenario scenario) throws IOException, InterruptedException {

        Log.INFO("Scenario: " + scenario.getName() + " started");

    }


    @After(order=0)
    public void afterScenarioFinish(Scenario scenario) throws IOException {
        Log.INFO("Scenario: " + scenario.getName() + " finished");
    }

    @After(order=1)
    public void afterScenario(Scenario scenario) {

        browser.closeDriver();
    }

}
