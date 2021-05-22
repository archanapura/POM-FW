package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtenTManager {
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void configureReports()
    {
        extent = new ExtentReports();
        ExtentHtmlReporter spark = new ExtentHtmlReporter("target/Spark.html");
        extent.attachReporter(spark);
       

    }
    public static void closeReports()
    {
        extent.flush();
    }
}
