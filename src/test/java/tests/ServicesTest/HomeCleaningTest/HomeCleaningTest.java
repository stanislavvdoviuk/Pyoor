package tests.ServicesTest.HomeCleaningTest;

import Data.ExtrasCleaningOptions;
import Data.ServiceFrequency;
import org.testng.Assert;
import pages.NonChemicalCleaning.BasicCleaningPage;
import pages.NonChemicalCleaning.NonChemicalCleaningPage;
import org.testng.annotations.Test;
import pages.NonChemicalCleaning.StandartCleaningPage;
import tests.TestRunner;
import tests.Tools;
import pages.*;

import java.text.ParseException;

public class HomeCleaningTest extends TestRunner {
    @Test(description = "")
    public void bookDeepClean() throws InterruptedException, ParseException {
        Tools tools=new Tools();
        tools.SuccessfulLogin("rovawen670@lege4h.com","Password12");
        HomePage homePage=new HomePage(getDriver());
        homePage
                .clickBookService()
                .clickNonChemicalCategory();

        CategoriesPage categoriesPage=new CategoriesPage(getDriver());
        categoriesPage.selectCategory("06870");

        NonChemicalCleaningPage cleaningPage=new NonChemicalCleaningPage(getDriver());
        cleaningPage.clickDeepCleanig();
        BasicCleaningPage clean=new BasicCleaningPage(getDriver());

        clean.bookDeepCleaning(2,1, "2020-08-04",5);
        Thread.sleep(7000);
    }

    @Test(description = "")
    public void bookStandartClean() throws InterruptedException, ParseException {
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
        StandartCleaningPage standartCleaningPage=new StandartCleaningPage(getDriver());
        String extras=
                ExtrasCleaningOptions.INSIDE_CABINETS.toString() +
                        ExtrasCleaningOptions.INSIDE_OF_WINDOWS.toString() +
                        ExtrasCleaningOptions.INSIDE_FRIDGE.toString();
        standartCleaningPage.bookStandartCleaning(2,1, ServiceFrequency.ONE_TIME.toString(),extras,"2020-08-04",5);
        Thread.sleep(7000);
    }

    @Test(description = "")
    public void checkingAlertMessage() throws InterruptedException, ParseException {
        Tools tools=new Tools();
        tools.SuccessfulLogin("rovawen670@lege4h.com","Password12");
        HomePage homePage=new HomePage(getDriver());
        homePage
                .clickBookService()
                .clickNonChemicalCategory();

        CategoriesPage categoriesPage=new CategoriesPage(getDriver());
        categoriesPage.selectCategory("06870");

        NonChemicalCleaningPage cleaningPage=new NonChemicalCleaningPage(getDriver());
        cleaningPage.clickDeepCleanig();
        BasicCleaningPage clean=new BasicCleaningPage(getDriver());
        clean.bookWithWrongData(2,2);
        Assert.assertTrue(clean.getAlert().isDisplayed());
        Thread.sleep(7000);
    }
}

