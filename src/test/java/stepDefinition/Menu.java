package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibraray.CommonLibrary;
import pageObjects.HeaderPage;
import pageObjects.ProductResultsPage;

public class Menu extends CommonLibrary {

    HeaderPage headerPage = new HeaderPage(driver);
    ProductResultsPage productResultsPage = new ProductResultsPage(driver);
    @When("^I mouseover on \"([^\"]*)\"$")
    public void i_mouseover_on(String menuOption)
    {
        headerPage.mouseOverOnMenu(menuOption);

    }
    @When("^I click on menuIcon$")
    public void i_click_on_menuIcon()
    {
        headerPage.clickOnIcon();
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String subMenuOption)
    {
       headerPage.clickOnSubMenu(subMenuOption);
    }

    @When("^I click for \"([^\"]*)\"$")
    public void i_click_for(String innerSubMenu)
    {
       headerPage.clickOnInnerOption(innerSubMenu);
    }

    @Then("^I should get redirected to a specific product page with title \"([^\"]*)\"$")
    public void i_should_get_redirected_to_a_specific_product_page_with_title(String resultTitleExpected)
    {
        productResultsPage.validateTitle(resultTitleExpected);
    }

}
