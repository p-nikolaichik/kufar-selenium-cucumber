package com.pandekh.steps;

import com.pandekh.BaseSteps;
import com.pandekh.screens.RealEstateScreen;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class RealEstateSteps extends BaseSteps {

  @Override
  public RealEstateScreen getCurrentScreen() {
    return (RealEstateScreen) super.getCurrentScreen();
  }

  @Then("^I assert I am on Real estate screen$")
  public void assertRealEstateScreenIsOpened() {
    Assert.assertTrue(getCurrentScreen().isScreenLoaded());
  }
}
