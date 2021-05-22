import commonBaseTest.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchElement extends BaseTest {
  /*  @FindBy(xpath="//input[@name='q']")
    private WebElement textElement;*/

    @Test(groups = "search")
    public void searchtInGoogle() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("google");
    }

}
