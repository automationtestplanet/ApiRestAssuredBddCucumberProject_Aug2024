@Users
Feature: Login Feature scenarios

  @ListOfUsers
  Scenario: Get List of Users
    Given Users endpoint
    When User get all user details with page no "2"
    Then user details must be fetched

  @SingleUser
  Scenario: Get Single User
    Given Users endpoint
    When User get single user details with id "2"
    Then user details must be fetched and id "2" should match

  @CreateUser
  Scenario: Create User
    Given Users endpoint
    When User creates the user with details with "CreateUser.json"
    Then User must be created
#
#  Scenario: Update User full details
#  Given
#  When
#  Then
#
#  Scenario: Update User partial details
#  Given
#  When
#  Then
#
#  Scenario: Delete User
#  Given
#  When
#    Then