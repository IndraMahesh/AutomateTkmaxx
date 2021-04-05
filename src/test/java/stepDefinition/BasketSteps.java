package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibraray.CommonLibrary;
import pageObjects.BasketPage;
import pageObjects.ProductListsPage;
import pageObjects.ProductResultsPage;

public class BasketSteps extends CommonLibrary {

    ProductListsPage productListsPage = new ProductListsPage(driver);
    ProductResultsPage productResultsPage = new ProductResultsPage(driver);
    BasketPage basketPage = new BasketPage(driver);

    @When("^I click on item \"([^\"]*)\"$")
    public void i_click_on_item(String item)
    {
        productListsPage.clickItem(item);
    }

    @When("^I click on size \"([^\"]*)\"$")
    public void i_click_on_size(String size)  {
        productResultsPage.clickSize(size);
    }

    @When("^I click on add to bag button$")
    public void i_click_on_add_to_bag_button()
    {
      productResultsPage.clickAddToBag();
    }

    @When("^I click on view bag$")
    public void i_click_on_view_bag()
    {
       basketPage.clickViewBag();
    }

    @Then("^I should be presented with the product details with title as \"([^\"]*)\"$")
    public void i_should_be_presented_with_the_product_details_with_title_as(String resultInBag)
    {
        basketPage.ValidateBag(resultInBag);
    }

}
