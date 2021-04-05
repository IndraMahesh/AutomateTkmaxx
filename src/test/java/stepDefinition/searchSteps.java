package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibraray.CommonLibrary;
import pageObjects.HeaderPage;
import pageObjects.SearchResultsPage;

public class searchSteps extends CommonLibrary {

    HeaderPage headerPage = new HeaderPage(driver);
    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

    @When("^I enter search term as \"([^\"]*)\" in the search field$")
    public void i_enter_search_term_as_in_the_search_field(String searchTerm) throws Exception
    {
         headerPage.enterSearchTerm(readPropertyFile("searchTerm"));
    }

    @When("^I click on search Icon$")
    public void i_click_on_search_Icon()
    {
        headerPage.clickSearchIcon();
    }

    @Then("^I should be presented with the appropriate result page with title as \"([^\"]*)\"$")
    public void i_should_be_presented_with_the_appropriate_result_page_with_title_as(String resultExpected)
    {
      searchResultsPage.validateSearch(resultExpected);
    }

}
