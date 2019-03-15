package com.pandekh.screens;

import com.pandekh.BaseScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class MyAccountScreen extends BaseScreen {

  private By searchInput = new By.ById("js_header_search");

  private By listOfAdds = new By.ByXPath("//div[@class=\"list_ads list_ads_type_line\"]");

  private By realEstateContainerMenuItem = new By.ByXPath("//*[@id=\"left_categories\"]/li[2]/a/i");

  public MyAccountScreen() {
    setCurrentScreen(this);
  }

  /**
   * method checks that screen is loaded
   * @return
   */
  @Override public boolean isScreenLoaded() {
    return isElementPresent(addApplicationButton);
  }

  /**
   * used to find item from all applications
   * @param nameOfItem
   */
  public void searchItem(String nameOfItem) {
    Actions builder = new Actions(getWebDriver());
    findElement(searchInput).sendKeys(nameOfItem);
    builder.sendKeys(Keys.chord(Keys.ENTER)).build().perform();
  }

  /**
   * method checks that list of adds is empty
   * @return
   */
  public boolean isListOfAddsEmpty() {
    return findElement(listOfAdds).findElements(By.tagName("article")).size() == 0;
  }

  /**
   * used to open real-estate menu
   * @return
   */
  public RealEstateScreen openRealEstateMenuItem() {
    Actions builder = new Actions(getWebDriver());
    builder.moveToElement(findElement(realEstateContainerMenuItem)).pause(200).click().build().perform();
    return new RealEstateScreen();
  }

  /**
   * used to logout from personal cabinet
   * @return
   */
  public HomeScreen clickLogout() {
    findElement(accountMenuContainer).findElements(By.className("popup_office__link")).get(10).click();
    return new HomeScreen();
  }

  /**
   * used to open personal account menu
   * @return
   */
  public MyAccountScreen navigateToAccountMenu() {
    findElement(accountMenu).click();
    return this;
  }
}
