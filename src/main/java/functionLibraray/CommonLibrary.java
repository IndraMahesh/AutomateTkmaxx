package functionLibraray;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.util.Properties;

public class CommonLibrary {

    public static WebDriver driver;
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void closeBrowser()
    {
        driver.quit();
    }
    public void jsExecutor(String script)
    {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript(script);
    }
    public void jsExecutor(String script, WebElement element)
    {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript(script,element);
    }
    public void cookies()
    {
        /*String currentWindow=driver.getWindowHandle();
        driver.switchTo().window(currentWindow);*/
        //driver.switchTo().frame(0);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
       // driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
    }
    public String readPropertyFile(String key) throws Exception
    {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\varan\\IdeaProjects\\AutomateTKMaxx\\src\\main\\resources\\testData\\testData.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String value= properties.getProperty(key);
        return value;
    }
}
