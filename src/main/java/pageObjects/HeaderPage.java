package pageObjects;

import gherkin.lexer.He;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    public WebDriver driver;
    public static String menu;
    public static String submenuOpt;

    public HeaderPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    @FindBy(xpath = "//*[@id=\"dtAccountMenuContainer\"]/span/a[1]")
    public WebElement profilePic;

    @FindBy(xpath="//input[@class='gigya-input-text' and @id='gigya-loginID-105546605193738530']")
    public WebElement emailId;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[1]/div[4]/input")
    public WebElement signInBtn;

    @FindBy(xpath="//*[@id=\"dtAccountMenuContainer\"]/div/div/span/span")
    public WebElement name;

    @FindBy(xpath="//i[@class='icon icon-search-mobile']")
    public WebElement menuIcon;

    @FindBy(xpath = "//*[@id=\"mobileSearch\"]/form/input")
    public WebElement searchTxtFld;

    @FindBy(xpath = "//*[@id=\"mobileSearch\"]/form/button[2]/i")
    public WebElement searchIcon;


    public void clickOnProfilePic()
    {
        profilePic.click();
    }
    public void enterEmail(String email)
    {
        emailId.sendKeys(email);
    }
    public void enterPassword(String pwd)
    {
        password.sendKeys(pwd);
    }
    public void clickSignIn()
    {
        signInBtn.click();
    }
    public void validate(String nameExp)
    {
        Assert.assertEquals(nameExp,name.getText());
    }
    public void clickOnIcon()
    {
        menuIcon.click();
    }
    public void mouseOverOnMenu(String menuOption)
    {
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div/nav/li/a[@title='"+menuOption+"']"))).build().perform();
        //driver.findElement(By.xpath("//div/nav/li/a[@title='Kids & Baby']"))
        menu=menuOption;
    }
    public void clickOnSubMenu(String submenu)
    {
        driver.findElement(By.xpath("//div/nav/li/a[@title='"+menu+"']/following::div[2]/div/div/div/ul/li/a[text()='"+submenu+"']"));
        submenuOpt= submenu;
    }
    public void clickOnInnerOption(String innerOption)
    {

        driver.findElement(By.xpath("//div/nav/li/a[@title='"+menu+"']/following::div[2]/div/div/div/ul/li/a[text()='"+submenuOpt+"']/following::div[2]/div/div/div/div/ul/li/a[text()='"+innerOption+"']")).click();
     ////div/nav/li/a[@title='Women']/following::div[2]/div/div/div/ul/li/a[text()='Clothing']/following::div[2]/div/div/div/div/ul/li/a[@title='Dresses']
        ////div/nav/li/a[@title='Women']/following::div[2]/div/div/div/ul/li/a[text()='Clothing']/following::div[2]/div/div/div/div/ul/li/a[text()='Dresses']
    }
public void enterSearchTerm(String searchTerm)
{
   searchTxtFld.sendKeys(searchTerm);
}
public void clickSearchIcon()
{
  searchIcon.click();
}
}
