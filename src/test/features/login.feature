Feature: Login Test
  As a registered user
  I should be able to login with my details

  @login
  Scenario: Validating login with valid email and password
    Given I'm on homepage "https://www.tkmaxx.co.uk"
    When I click on profile picture
    And I enter email "indrahere88@gmail.com"
    And I enter Password "My1stauto*"
    And I click on signin button
    Then I should get redirected to homepage with title as my name "Indra"


