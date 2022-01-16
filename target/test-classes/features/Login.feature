Feature: Login feature

  Background:
    #Given user is navigated to HRMS application

  @smoke @sprint2
  Scenario: Valid admin login
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in


  @regression @smoke
  Scenario: Valid ess login
    When user enters valid ess username and password
    And user clicks on login button
    Then admin user is successfully logged in










