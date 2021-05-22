import commonBaseTest.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GetAttributeOfImg extends BaseTest {
    @Test(groups = "attribute")
    public void getAttributeOfImage() throws InterruptedException {
        String srcValue=driver.findElement(By.xpath("//img")).getAttribute("srcset");
        System.out.println(srcValue);
    }
}

