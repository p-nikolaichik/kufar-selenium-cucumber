#Author Stefan Pandekh
Feature: Login screen
  As a CVA user
  I want to set text into search field and click "find"
  So that I can see founded items

  Scenario Outline: Successful login
    Given I am login to application
    When I click button Login on Home screen
    And I set eMail "<user_mail>" on dialog Login dialog
    And I set password "<password>" on dialog Login dialog
    And I click button Login on Login dialog
    Then I assert I am on My account screen
    When I search Item "<item>" on screen My account using search field
    Then I assert Search list is not empty on My account screen

    Examples:
      | user_mail          | password   | item |
      | bfm39324@ebbob.com | 1234qwerty | car  |