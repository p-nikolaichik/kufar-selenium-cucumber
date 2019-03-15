package com.pandekh.steps;

import com.pandekh.BaseSteps;
import com.pandekh.screens.LoginDialog;
import com.pandekh.screens.HomeScreen;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.pandekh.BaseScreen.closeWebDriver;
import static com.pandekh.BaseScreen.setUpWebDriver;

public class LoginSteps extends BaseSteps {

  LoginDialog loginDialog;

  @Override
  public HomeScreen getCurrentScreen() {
    return (HomeScreen) super.getCurrentScreen();
  }

  @When("^I am login to application$")
  public void login() {
    new HomeScreen().openHomePage();
  }

  @When("^I click button Login on Home screen$")
  public void clickLoginOnHomePage() {
    loginDialog = getCurrentScreen().clickLogin();
  }

  @When("^I click button Login on Login dialog")
  public void clickLoginOnLoginDialog() {
    loginDialog.clickLogin();
  }

  @When("^I set eMail \"(.*)\" on dialog Login dialog$")
  public void setEmail(String email) {
    loginDialog.setMail(email);
  }

  @When("^I set password \"(.*)\" on dialog Login dialog$")
  public void setPassword(String password) {
    loginDialog.setPassword(password);
  }


  @Then("^I assert error message \"(.*)\" is presented on Login dialog$")
  public void assertWarningMessageIsPresented(String message) {
    Assert.assertEquals(message, loginDialog.getErrorMessage());
  }

  @Then("^I assert I am on Home screen$")
  public void assertHomeScreen() {
    Assert.assertTrue(getCurrentScreen().isScreenLoaded());
  }

  @Before
  /**
   * Starts new webdriver session before execution of feature file
   */
  public void setUp() {
    setUpWebDriver();
  }

  @After
  /**
   * Ends webdriver session after feature file is processed
   */
  public void tearDown() {
    closeWebDriver();
  }
}
