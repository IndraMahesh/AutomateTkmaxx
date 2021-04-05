package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductResultsPage {
    public WebDriver driver;

    public ProductResultsPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath = "//*[@id=\"product\"]/label[2]")
    public WebElement specificSize;

    @FindBy(xpath = "//*[@id=\"addToCartButton\"]")
    public WebElement addToBagBtn;

    public void clickSize(String size)
    {
        specificSize.click();
    }
    public void clickAddToBag()
    {
        addToBagBtn.click();
    }

    public void validateTitle(String resultTitle)
    {
        String actualResult=driver.findElement(By.xpath("//h1[@class='o-default-banner-section' or contains(text(),'"+resultTitle+"')]")).getText();
                ////h1[@class='o-default-banner-section' or contains(text(),'Gift Cards')]
        Assert.assertTrue(actualResult.contains(resultTitle));
    }
}
