Feature:  Search Test
  As a user
  I should be redirected to a appropriate page when I enter search term

  @search
  Scenario: Validating search with the search term
    Given I'm on homepage "https://www.tkmaxx.co.uk"
    When I click on menuIcon
    And I enter search term as "shirts" in the search field
    And I click on search Icon
    Then I should be presented with the appropriate result page with title as "shirts"