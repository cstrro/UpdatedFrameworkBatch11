Feature: US-12345 Employee search

  Scenario: Search employee by id
    Given user is navigated to HRMS application
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user navigates to employee list page
    When user enters valid employee id
    And user clicks on search button
    Then user see employee information is displayed
    Then user close the browser

  Scenario: Search employee by name
    Given user is navigated to HRMS application
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user navigates to employee list page
    When user enters valid employee name
    And user clicks on search button
    Then user see employee information is displayed
    Then user close the browser




