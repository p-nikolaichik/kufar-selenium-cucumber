#Author Stefan Pandekh
Feature: Login screen
  As a CVA user
  I want to Login successfully
  So that I can access the features in the application

  Scenario Outline: Successful login
    Given I am login to application
    When I click button Login on Home screen
    And I set eMail "<user_mail>" on dialog Login dialog
    And I set password "<password>" on dialog Login dialog
    And I click button Login on Login dialog
    Then I assert I am on My account screen

    Examples:
      | user_mail          | password   |
      | bfm39324@ebbob.com | 1234qwerty |

  Scenario Outline: Login with correct login and incorrect password
    Given I am login to application
    When I click button Login on Home screen
    And I set eMail "<user_mail>" on dialog Login dialog
    And I set password "<incorrect_password>" on dialog Login dialog
    And I click button Login on Login dialog
    Then I assert error message "Введен неверный пароль или профиль для данного e-mail не существует." is presented on Login dialog

    Examples:
      | user_mail          | incorrect_password |
      | bfm39324@ebbob.com | 123123123          |

  Scenario Outline: Login with correct login and empty password
    Given I am login to application
    When I click button Login on Home screen
    And I set eMail "<user_mail>" on dialog Login dialog
    When I set password "<empty_password>" on dialog Login dialog
    And I click button Login on Login dialog
    Then I assert error message "Введите пароль" is presented on Login dialog

    Examples:
      | user_mail          | empty_password |
      | bfm39324@ebbob.com |                |