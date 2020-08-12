package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class ZipCodeTest extends SuccessfullLoginTestRunner {
    @Test(description = "")
    public void checkingIncorrectZipCode() throws InterruptedException {

        HomePage homePage=new HomePage(getDriver());
        homePage
                .clickBookService()
                .clickNonChemicalCategory();
        CategoriesPage categoriesPage=new CategoriesPage(getDriver());
        categoriesPage.selectCategory("0687");
        Assert.assertTrue(categoriesPage.getErrorVendor().isDisplayed());
    }
    @Test(description = "")
    public void checkingCorrectZipCode() throws InterruptedException {

        HomePage homePage=new HomePage(getDriver());
        homePage
                .clickBookService()
                .clickNonChemicalCategory();

        CategoriesPage categoriesPage=new CategoriesPage(getDriver());
        categoriesPage.selectCategory("06847");
        NoServiceAlertPage alertPage=new NoServiceAlertPage(getDriver());

        Assert.assertTrue(alertPage.getTitleWrapper().isDisplayed());
    }
}
