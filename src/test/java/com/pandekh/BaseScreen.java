package com.pandekh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseScreen {

  protected By accountMenu = new By.ByXPath("//div[@class='header__logged_in js-header__logged_in']");

  protected By accountMenuContainer = new By.ByClassName("popup_office__nav");

  protected By addApplicationButton = new By.ById("add");

  private static WebDriver driver;

  public abstract boolean isScreenLoaded();

  public static WebElement findElement(By locator) {
    return getWebDriver().findElement(locator);
  }

  public static WebDriver getWebDriver() {
    return driver;
  }

  public static void setUpWebDriver() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }

  public static void closeWebDriver() {
    driver.close();
  }

  public static boolean isElementPresent(By locator) {
    return getWebDriver().findElement(locator).isDisplayed();
  }

  public void setCurrentScreen(BaseScreen screen) {
    Session.setCurrentScreen(screen);
  }
}
