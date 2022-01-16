Feature: Add employees

  @regression
  Scenario: Adding one employee from feature file
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add employee button
    And user enters firstname and lastname
    And user clicks on save button
    Then employee added successfully

  @ddt
  Scenario Outline: Add employee
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add employee button
    And user enters "<firstName>" "<middleName>" and "<lastName>"
    And user clicks on save button
    Then employee added successfully

    Examples:
    |firstName|middleName|lastName|
    |test123  |MS        |test456 |
    |testabc  |MS        |testxyz |
    |test987  |MS        |test321 |

  @sampleCucumberScenario
  Scenario: Adding one employee using cucumber feature
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add employee button
    And user enters direct data "sebastianfn" "christinemn" and "yogitaln"
    And user clicks on save button
    Then employee added successfully

