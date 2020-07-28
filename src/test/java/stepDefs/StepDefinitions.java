package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class StepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on MainPage$")
    public void given_i_am_on_mainpage() throws Throwable {

        homePage.isPageDisplayed();

    }

    @When("I click on Login$")

    public void when_i_click_on_login() throws Throwable {

        homePage.goToLogin();
        loginPage.isPageDisplayed();

    }



    @And("I enter email$")
    public void and_i_enter_email() throws Throwable {

        loginPage.enterEmail();

    }

    @And("I enter password$")
    public void and_i_enter_password() throws Throwable {

        loginPage.enterPassword();

    }

    @And("I click on login button$")
    public void and_i_click_on_login_button() throws Throwable {

        loginPage.clickLogin();

    }

    @Then("I logged in$")
    public void then_i_logged_in() throws Throwable {

        homePage.accountIsVisible();

    }

    @When("I search catproduct$")
    public void when_i_search_catproduct() throws Throwable {


        homePage.searchCatProduct();

    }

    @And("I click on the catproduct$")
    public void and_i_click_on_the_catproduct() throws Throwable {



    }

    @And("I add product to cart$")
    public void and_i_add_product_to_cart() throws Throwable {


    }

    @And("I go to cart$")
    public void and_i_go_to_cart() throws Throwable {


    }

    @Then("I verify catproduct is on the cart$")
    public void then_i_verify_catproduct_is_on_the_cart() throws Throwable {


    }

    @Then("I verify cargo is not free for catproduct$")
    public void then_i_verify_cargo_is_not_free_for_catproduct() throws Throwable {


    }

    @Then("I verify cargo free option price for catproduct$")
    public void then_i_verify_cargo_free_option_price_for_catproduct() throws Throwable {


    }

    @When("I search vacuumcleanerproduct$")
    public void when_i_search_vacuumcleanerproduct() throws Throwable {

    }

    @And("I click on the vacuumcleanerproduct$")
    public void and_i_click_on_the_vacuumcleanerproduct() throws Throwable {


    }

    @Then("I verify vacuumcleanerproduct is on the cart$")
    public void then_i_verify_vacuumcleanerproduct_is_on_the_cart() throws Throwable {

    }

    @Then("I verify cargo is free for vacuumcleanerproduct$")
    public void then_i_verify_cargo_is_free_for_vacuumcleanerproduct() throws Throwable {

    }



}
