package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends TopPart {
    protected WebDriver driver;
    private By greenLawncareCategory;
    private By nonChemicalHomeCleaningCategory;
    private By ecoFriendlyHairStylistCategory;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        this.greenLawncareCategory = By.cssSelector("#services > div.category_wrapper > a:nth-child(1)");
        this.nonChemicalHomeCleaningCategory =By.cssSelector("#services > div.category_wrapper > a:nth-child(3)");
        this.ecoFriendlyHairStylistCategory =By.cssSelector("#services > div.category_wrapper > a:nth-child(4)");
    }
    public WebElement getGreenCategory(){return  driver.findElement(greenLawncareCategory);}
    public void clickGreenCategory(){ getGreenCategory().click();}

    public WebElement getNonChemicalCategory(){return  driver.findElement(nonChemicalHomeCleaningCategory);}
    public void clickNonChemicalCategory(){ getNonChemicalCategory().click();}

    public WebElement getEcoHairCategory(){return  driver.findElement(ecoFriendlyHairStylistCategory);}
    public void clickEcoHairCategory(){ getEcoHairCategory().click();}

    public HomePage clickEcoHair() {
        clickEcoHairCategory();
        return new HomePage(driver);
    }
}
