#Author Stefan Pandekh
Feature: Login screen
  As a CVA user
  I want to Logout successfully
  So that I can access the features in the application

  Scenario Outline: Successful login
    Given I am login to application
    When I click button Login on Home screen
    And I set eMail "<user_mail>" on dialog Login dialog
    And I set password "<password>" on dialog Login dialog
    And I click button Login on Login dialog
    Then I assert I am on My account screen
    When I navigate to Account menu
    And I click button Logout on My account screen
    Then I assert I am on Home screen

    Examples:
      | user_mail          | password   |
      | bfm39324@ebbob.com | 1234qwerty |