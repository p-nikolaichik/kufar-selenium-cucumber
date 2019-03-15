package com.pandekh.screens;

import com.pandekh.BaseScreen;
import org.openqa.selenium.By;

public class LoginDialog extends BaseScreen {

  private By loginButton = new By.ByName("login");

  private By eMailInput = new By.ByName("email");

  private By passwordInput = new By.ByName("passwd");

  private By errorMessage = new By.ByXPath("//div[@class=\"form_error form_error_login\"]");

  @Override public boolean isScreenLoaded() {
    return isElementPresent(loginButton);
  }

  /**
   * used to set text in eMail field
   * @param mail
   * @return
   */
  public LoginDialog setMail(String mail) {
    findElement(eMailInput).sendKeys(mail);
    return this;
  }

  /**
   * used to set password in password field
   * @param password
   * @return
   */
  public LoginDialog setPassword(String password) {
    findElement(passwordInput).sendKeys(password);
    return this;
  }

  /**
   * used to authorise in account cabinet
   * @return
   */
  public MyAccountScreen clickLogin() {
    findElement(loginButton).click();
    return new MyAccountScreen();
  }

  /**
   * used to get errors messages on login dialog
   * @return error message on dialog
   */
  public String getErrorMessage() {
    return findElement(errorMessage).getText();
  }
}
