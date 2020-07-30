package tests.ServicesTest;

import pages.NonChemicalCleaning.NonChemicalCleaningPage;
import org.testng.annotations.Test;
//import pages.CategoriesPage;
//import pages.HomePage;
import tests.TestRunner;
import tests.Tools;
import pages.*;

import java.text.ParseException;

public class HomeCleaningTest extends TestRunner {
    @Test(description = "")
    public void bookHomeClean() throws InterruptedException, ParseException {
        Tools tools=new Tools();
        tools.SuccessfulLogin("rovawen670@lege4h.com","Password12");
        HomePage homePage=new HomePage(getDriver());
        homePage
                .clickBookService()
                .clickNonChemicalCategory();

        CategoriesPage categoriesPage=new CategoriesPage(getDriver());
        categoriesPage.selectCategory("06870");

        NonChemicalCleaningPage cleaningPage=new NonChemicalCleaningPage(getDriver());
        cleaningPage.clickStandartCleaning();

        Thread.sleep(7000);
    }
}
