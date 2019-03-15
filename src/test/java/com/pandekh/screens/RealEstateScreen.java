package com.pandekh.screens;

import com.pandekh.BaseScreen;
import org.openqa.selenium.By;

public class RealEstateScreen extends BaseScreen {

  protected By menuName = By.xpath("//div[@id=\"header\"]//div/div[2]//span");

  public RealEstateScreen() {
    setCurrentScreen(this);
  }

  /**
   * method checks that screen is opened
   * @return
   */
  @Override
  public boolean isScreenLoaded() {
    return findElement(menuName).getText().equals("Недвижимость");
  }
}
