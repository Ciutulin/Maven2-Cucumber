package Maven2;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DashboardPage extends Utils {

    private By _pageTitleText = By.xpath("//li[7]/a/b");
    String expectMessageTitle = "Dashboard";

    public void dashboardPage () {
        Assert.assertEquals(getTextFromElement(_pageTitleText), expectMessageTitle);
    }
}
