Feature: Basket Test
  As a user
  I should be able to add product in the bag

  @bag
  Scenario: Validating whether the item is added to the basket
    Given I'm on homepage "https://tkmaxx.co.uk"
    When I click on menuIcon
    And I mouseover on "Women"
    And I click on "Clothing"
    And I click for "Dresses"
    And I click on item "JANE DELANCEY"
    And I click on size "M"
    And I click on add to bag button
    And I click on view bag
    Then I should be presented with the product details with title as "result"
