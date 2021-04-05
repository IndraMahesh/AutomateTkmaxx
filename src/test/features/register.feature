Feature: Registration Test
  As a new user
  I should be able to register with my details

  @register
  Scenario: Validating registration for new user
    Given I'm on homepage "https://tkmaxx.co.uk"
    When I click on profile picture
    And I click on register
    And I should redirected to New account Page
    And I enter Username "username"
    And I click on continue
    And I enter Password "password"
    And I click on next button
    And I click on no thanks option
    And I click on next button
    And I enter firstname "firstname"
    And I enter lastname "lastname"
    And I click create account button
    Then I should see my name in the home page


