Feature: Homepage verification
  Scenario: Enter some text in search page
    Given I am on home page
    When I enter some text
    Then Search results should be displayed