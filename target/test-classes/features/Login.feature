Feature: Login feature

  Background:
    Given user is navigated to HRMS application

  @smoke @regression
  Scenario: Valid admin login
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    Then user close the browser

  @regression @sprint2 @sprint3
  Scenario: Valid ess login
    When user enters valid ess username and password
    And user clicks on login button
    Then admin user is successfully logged in
    Then user close the browser










