package tests.ServicesTest.HairStylistTests;

import pages.EcoFriendlyHairStylist.BasicHairBookPage;
import pages.EcoFriendlyHairStylist.EcoFriendlyHairPage;
import org.testng.annotations.Test;
import tests.TestRunner;
import tests.Tools;
import pages.*;

import java.text.ParseException;

public class BookServiceTest extends TestRunner {
    @Test(description = "")
    public void bookingHairStylist() throws InterruptedException, ParseException {
        Tools tools=new Tools();
        tools.SuccessfulLogin("rovawen670@lege4h.com","Password12");

        HomePage homePage=new HomePage(getDriver());
        homePage
                .clickBookService()
                .clickEcoHairCategory();

        CategoriesPage categoriesPage=new CategoriesPage(getDriver());
        categoriesPage.selectCategory("06870");

        EcoFriendlyHairPage ecoFriendlyHairPage=new EcoFriendlyHairPage(getDriver());
        ecoFriendlyHairPage.clickKidsButton();
        BasicHairBookPage base =new BasicHairBookPage(getDriver());
        base.bookHair();
        Thread.sleep(7000);
    }
}
