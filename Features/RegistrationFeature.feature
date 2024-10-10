@RegistrationFeature
Feature: Registration Feature Scenarios

Background:
  Given Navigate to Register Page

  @RunStepMultipleTimes @RegressionTest @Database
  Scenario: Register multiple users
    Given User is on Registration Page
    When User enters multiple users details
      | Name    | Gender | Qualification | Designation       | Location      |
      | Raju    | Male   | BTech CSE     | Software Engineer | Hyderabad     |
      | Krishna | Male   | LLB           | Advocate          | Visakhapatnam |
      | Ganesh  | Male   | BTech   CIVIL | Civil Engineer    | Bangalore     |

    Then User registration should successful