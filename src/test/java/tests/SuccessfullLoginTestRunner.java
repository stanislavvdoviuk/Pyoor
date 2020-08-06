package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class SuccessfullLoginTestRunner extends TestRunner {

    @BeforeClass(alwaysRun = true)
    public void beforeClass() throws InterruptedException {
        Tools tools=new Tools();
        tools.SuccessfulLogin("rovawen670@lege4h.com","Password12");
    }

}
