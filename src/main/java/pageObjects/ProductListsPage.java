package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListsPage {
    public ProductListsPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"vue-root\"]/div[5]/div[3]/ul/li[2]/a/strong[1]")
    public WebElement specificItem;


    public void clickItem(String item)
    {
        specificItem.click();
    }


}
