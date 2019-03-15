package com.pandekh;

public class Session {

  private static BaseScreen currentScreen;

  public static BaseScreen getCurrentScreen() {
    return currentScreen;
  }

  public static void setCurrentScreen(BaseScreen screen) {
    currentScreen = screen;
  }
}
