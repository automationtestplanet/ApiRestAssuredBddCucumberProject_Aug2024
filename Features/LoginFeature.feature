@LoginFeature
Feature: Login feature scenarios

  Background:
    Given Navigate to Login Page


  @ValidCredentials @SmokeTest @SanityTest @RegressionTest
  Scenario: Login with valid credentials
    Given User is on Login Page
    When User enter username as "User123" and password as "Password@123" and click Login button
    Then Login should successful
    And User Image should be displayed
    But User Details should not be displayed

  @InvalidCredentials @SanityTest @RegressionTest
  Scenario: Login with invalid credentials
    Given User is on Login Page
    When User enter username as "User321" and password as "Password@321" and click Login button
    Then Login should fail

  @MultipleCredentials @RegressionTest
  Scenario Outline: Login with valid credentials with multiple users data "<UserName>" and "<Password>"
    Given User is on Login Page
    When User enter username as "<UserName>" and password as "<Password>" and click Login button
    Then Login should successful
    And User Image should be displayed
    But User Details should not be displayed

    Examples:
      | UserName | Password     |
      | User124  | Password@124 |
      | User125  | Password@125 |
      | User126  | Password@126 |
      | User127  | Password@127 |
