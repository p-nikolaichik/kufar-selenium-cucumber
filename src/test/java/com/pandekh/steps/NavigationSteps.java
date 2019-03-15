package com.pandekh.steps;

import com.pandekh.BaseSteps;
import com.pandekh.screens.MyAccountScreen;
import cucumber.api.java.en.When;

public class NavigationSteps extends BaseSteps {

  @Override
  public MyAccountScreen getCurrentScreen() {
    return (MyAccountScreen) super.getCurrentScreen();
  }

  @When("^I navigate to Real estate menu on My account screen$")
  public void navigateToRealEstateMenu() {
    getCurrentScreen().openRealEstateMenuItem();
  }

  @When("^I navigate to Account menu$")
  public void navigateToAccountMenu() {
    getCurrentScreen().navigateToAccountMenu();
  }
}
