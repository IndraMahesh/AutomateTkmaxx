package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    public SearchResultsPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//*[@id=\"vue-root\"]/div[3]/div[1]/div/div/div/p")
    public WebElement searchResult;
    public void validateSearch(String resultTxt)
    {
        Assert.assertTrue(searchResult.isDisplayed());
    }
}
