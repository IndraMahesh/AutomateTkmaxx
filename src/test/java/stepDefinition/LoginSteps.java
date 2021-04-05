package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibraray.CommonLibrary;
import org.openqa.selenium.JavascriptExecutor;
import pageObjects.HeaderPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends CommonLibrary {

    HeaderPage headerPage = new HeaderPage(driver);

    @Given("^I'm on homepage \"([^\"]*)\"$")
    public void i_m_on_homepage(String url)  {
             driver.get(url);
             driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

    }

    @When("^I click on profile picture$")
    public void i_click_on_profile_picture()
    {
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click();",headerPage.profilePic);

        jsExecutor("arguments[0].click();",headerPage.profilePic);
        //headerPage.clickOnProfilePic();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    }
    @When("^I enter email \"([^\"]*)\"$")
    public void i_enter_email(String email)
    {
        //JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        //javascriptExecutor.executeScript("window.scrollBy(0,330)");

        jsExecutor("window.scrollBy(0,330)");
        headerPage.enterEmail(email);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);


    }



    @When("^I enter Password \"([^\"]*)\"$")
    public void i_enter_Password(String password)
    {
         headerPage.enterPassword(password);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @When("^I click on signin button$")
    public void i_click_on_signin_button()
    {
         headerPage.clickSignIn();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @Then("^I should get redirected to homepage with title as my name \"([^\"]*)\"$")
    public void i_should_get_redirected_to_homepage_with_title_as_my_name(String nameExpected)
    {
        headerPage.validate(nameExpected);
    }


}
