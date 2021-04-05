package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
    public BasketPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/main/div[3]/div[3]/div[5]/div[1]/div[3]/div[2]/h5/a")
    public WebElement itemDisplay;

    @FindBy(xpath = "/html/body/main/div[3]/div[3]/div[5]/div[1]/div[3]/div[2]/h5/a")
    public WebElement viewBag;

    public void clickViewBag()
    {
        viewBag.click();
    }
    public void ValidateBag(String itemNameExp)
    {
        String actual=itemDisplay.getText();
        Assert.assertEquals(actual,itemNameExp);
    }
}
