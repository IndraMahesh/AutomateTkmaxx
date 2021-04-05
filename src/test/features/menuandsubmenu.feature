Feature: Menu and submenu redirection
  As a user
  i should get redirected to the appropriate page by choosing the menu and submenu options
@menu
 Scenario Outline: Validating menu and submenu redirected to a specific product page
   Given I'm on homepage "https://tkmaxx.co.uk"
  When I click on menuIcon
   And I click on menu "<menuOption>"
   And I click on submenu "<submenuOption>"
   And I click for innerOption "<innerOption>"
   Then I should get redirected to a specific product page with title "<resultTitle>"

Examples:
   |menu|submenu|innerOption|resultTitle|

   |Women|Clothing |Dresses|Dresses|
   |Men|Clothing|Jeans|Jeans|
   |Kids & Baby|Girls|5 years|Clothing|
   |Beauty|Skincare|Serums|Serums|
   |Shoes|Clearance|Kids|Shoes Clearance|
   |Gifts|Gift Guides|Gift Cards|Gift Cards|
   |Clearance|Beauty|View All|Beauty Clearance|