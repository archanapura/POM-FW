package commonBaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.ExtenTManager;
import utils.WebEventListener;

import java.util.Arrays;
import java.util.Optional;


public class BaseTest {
    public WebDriver dr;
    public EventFiringWebDriver driver;
    public WebDriverEventListener listener;
public Optional<String> gName;
    @BeforeSuite(groups = {"attribute","title"})
    public void configureReports(ITestContext context)
    {
     ExtenTManager.configureReports();
    }

   // @Parameters("browser")
    @BeforeClass(groups = {"attribute","title"})
    public void launchApp()
    {
        String browser=System.getProperty("platform.browser");
        switch(browser){
            case "Firefox":
        //System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();
        dr = new FirefoxDriver();
        break;
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                dr = new ChromeDriver();
                break;
    }
        driver=new EventFiringWebDriver(dr);
        listener=new WebEventListener();
        driver.register(listener);
        driver.get("https://google.com");
    }
    @BeforeTest(groups = {"attribute","title"})
    public void initializeTest(ITestContext context)
    {   gName=Arrays.stream(context.getIncludedGroups()).findFirst();
        System.out.println("Time we started "+ Arrays.stream(context.getIncludedGroups()).findFirst());
        System.out.println("Time we started "+context.getName()+context.getStartDate());

    }
    @BeforeMethod(groups = {"attribute","title"})
    public void initializeMethod(ITestResult result)
    {


        // System.out.println("Time we started "+result.getName()+result.getStartMillis());
    }
    @AfterMethod(groups = {"attribute","title"})
    public void closeMethod(ITestResult result)
    {
        System.out.println("Time we completed "+result.getName()+result.getEndMillis());
    }
    @AfterTest(groups = {"attribute","title"})
    public void closingSteps(ITestContext context) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Time we started "+context.getName()+context.getEndDate());
    }
    @AfterClass(groups = {"attribute","title"})
    public void closeApp()
    {driver.close();}
    @AfterSuite(groups = {"attribute","title"})
    public void closeExtentReports()
    {
       ExtenTManager.closeReports();
    }

    @DataProvider(name="usercreds")
    public Object[][] method1()
    {
        return new Object[][]{{"n2","v2"},{"n3","v3"}};
    }
}
