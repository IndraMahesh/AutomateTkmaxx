import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = {"@search"},dryRun = false,
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/tar.html"})
public class Run {
    @AfterClass
    public static void generateReport()
    {
        Reporter.loadXMLConfig("C:\\Users\\varan\\IdeaProjects\\AutomateTKMaxx\\src\\main\\resources\\reportsConfig\\extentReportConfig.xml");
    }

}
