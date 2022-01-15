Feature: Add employees

  @regression
  Scenario: Adding one employee from feature file
    Given user is navigated to HRMS application
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add employee button
    And user enters firstname and lastname
    And user clicks on save button
    Then employee added successfully
    Then user close the browser