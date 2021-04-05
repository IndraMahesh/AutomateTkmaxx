import cucumber.api.java.After;
import cucumber.api.java.Before;
import functionLibraray.CommonLibrary;

public class Hooks {
    CommonLibrary commonLibrary = new CommonLibrary();

    @Before
    public void beforeTest()
    {
        commonLibrary.openBrowser();
    }
    @After
    public void afterTest()
    {
        commonLibrary.closeBrowser();
    }
}
