package utils;

import com.aventstack.extentreports.Status;
//import commonBaseTest.BaseTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNGListeners extends  ExtenTManager implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Started the test on start");

        System.out.println(result.getName());
        //System.out.println(context.getAllTestMethods());
       test= extent.createTest(result.getName());

       // Reporter.log("Started the test" + context.getStartDate());
     //   System.out.println( context.getStartDate());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("completed the test");

        System.out.println(context.getPassedTests());
                System.out.println(context.getFailedTests());
                        System.out.println(context.getEndDate());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log(result.getName()+" is executed successfully",true);
        System.out.println(result.getName()+" is executed successfully");
        test.log(Status.INFO,"Launched application and getting title");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName()+" is skipped due to "+result.getSkipCausedBy());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+" failed due to"+result.getThrowable());
        test.log(Status.INFO,"Launched application and getting title");
    }

}
