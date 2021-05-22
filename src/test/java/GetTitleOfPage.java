import com.aventstack.extentreports.Status;
import commonBaseTest.BaseTest;
//
// import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import utils.ExtenTManager;

public class GetTitleOfPage extends BaseTest {
    @Test(testName = "demo",groups = "title",dataProvider = "usercreds")
    public void verifyGooglePage(String n1,String v1) throws InterruptedException {
        //test= extent.createTest("name");
        System.out.println("printing this group name"+gName.get());
        Reporter.log("Launched application and getting title");
        ExtenTManager.test.log(Status.INFO,"Launched application and getting title");
        System.out.println(driver.getTitle());
        ExtenTManager.test.log(Status.INFO,"Printing n1"+n1);
        Reporter.log("Printing n1"+n1);
        System.out.println(n1);
        ExtenTManager.test.log(Status.INFO,"Printing v1"+v1);
        Reporter.log("Printing v1"+v1);
        System.out.println(v1);
    }

}

