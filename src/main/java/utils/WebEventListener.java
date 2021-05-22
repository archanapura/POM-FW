package utils;

import com.aventstack.extentreports.Status;
//import commonBaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

public class WebEventListener extends TestNGListeners implements WebDriverEventListener {

    @Override
    public void beforeAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Navigating to "+url);
        Reporter.log("Navigating to "+url);
       // ExtenTManager.test.log(Status.INFO,"Navigating to "+url);

    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        Reporter.log("Navigated to "+url);
        Reporter.log(driver.getCurrentUrl(),true);
       // ExtenTManager.test.log(Status.INFO,"Navigated to "+driver.getCurrentUrl());
    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        Reporter.log("Navigating back ",true);
        Reporter.log(driver.getCurrentUrl());
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        Reporter.log("Navigated back ",true);
        Reporter.log(driver.getCurrentUrl());
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {

    }

    @Override
    public void afterNavigateForward(WebDriver driver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        Reporter.log("Finding element "+element,true);
        test.log(Status.INFO,"Finding element "+element);

    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
       test.log(Status.INFO,"Found element "+element);
        Reporter.log("Found element "+element);
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        Reporter.log("Trying to click "+element);
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        Reporter.log("Clicked "+element);
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void beforeScript(String script, WebDriver driver) {

    }

    @Override
    public void afterScript(String script, WebDriver driver) {

    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {

    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {

    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {

    }
}
