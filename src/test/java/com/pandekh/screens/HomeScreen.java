package com.pandekh.screens;

import com.pandekh.BaseScreen;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen {

  private By enterButton = new By.ByXPath("//a[@class=\"header__sign_in login_popup_init\"]");

  public HomeScreen() {
    setCurrentScreen(this);
  }

  @Override public boolean isScreenLoaded() {
    return isElementPresent(enterButton);
  }

  /**
   * used to open necessary web page
   * @return
   */
  public HomeScreen openHomePage() {
    getWebDriver().get("https://www.kufar.by");
    return this;
  }

  /**
   * used to open login dialog
   * @return
   */
  public LoginDialog clickLogin() {
    openHomePage().findElement(enterButton).click();
    return new LoginDialog();
  }
}
