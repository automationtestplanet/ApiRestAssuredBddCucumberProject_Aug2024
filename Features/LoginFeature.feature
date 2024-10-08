Feature: Login feature

  Scenario: Login with valid credentials
    Given User is on Login Page
    When User enter username as "User123" and password as "Password@123" and click Login button
    Then Login should successful
    And User Image should be displayed
    But User Details should not be displayed