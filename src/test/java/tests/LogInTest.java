package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class LogInTest extends TestRunner
{
    @Test(description = "")
    public void checkLogin() throws InterruptedException {
        Tools tools=new Tools();
        tools.SuccessfulLogin("rovawen670@lege4h.com","Password12");

        ProfilePage user = new ProfilePage(getDriver());
        user.getUpdateInfo().click();
        DataChangingModal profilePage=new DataChangingModal(getDriver());
        profilePage.updateUsersData("User","0511115","Lviv","Lviv");
       // Thread.sleep(5000);
        Assert.assertEquals(user.getNameField().getText(),"User");
    }

}
