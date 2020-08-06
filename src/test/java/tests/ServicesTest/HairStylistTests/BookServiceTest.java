package tests.ServicesTest.HairStylistTests;

import pages.EcoFriendlyHairStylist.BasicHairBookPage;
import pages.EcoFriendlyHairStylist.EcoFriendlyHairPage;
import org.testng.annotations.Test;
import tests.SuccessfullLoginTestRunner;
import tests.TestRunner;
import tests.Tools;
import pages.*;

import java.text.ParseException;

public class BookServiceTest extends SuccessfullLoginTestRunner {
    @Test(description = "")
    public void bookingHairStylist() throws InterruptedException, ParseException {
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
       // Thread.sleep(7000);
    }
}
