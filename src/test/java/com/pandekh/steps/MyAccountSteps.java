package com.pandekh.steps;

import com.pandekh.BaseSteps;
import com.pandekh.screens.MyAccountScreen;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyAccountSteps extends BaseSteps {

  @Override
  public MyAccountScreen getCurrentScreen() {
    return (MyAccountScreen) super.getCurrentScreen();
  }

  @Then("^I assert I am on My account screen$")
  public void assertMeAccountScreenIsLoaded() {
    getCurrentScreen().isScreenLoaded();
  }

  @When("^I search Item \"(.*)\" on screen My account using search field$")
  public void searchItem(String item) {
    getCurrentScreen().searchItem(item);
  }

  @Then("^I assert Search list is not empty on My account screen$")
  public void assertSearchListIsNotEmpty() {
    Assert.assertFalse(getCurrentScreen().isListOfAddsEmpty());
  }

  @When("^I click button Logout on My account screen$")
  public void clickLogout() {
    getCurrentScreen().clickLogout();
  }
}
