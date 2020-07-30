package pages;

import Data.TypesOfProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriesPage extends TopPart{
    protected WebDriver driver;
    private By zipCodeField;
    private By typeField;
    private By continueButton;

    public CategoriesPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        this.zipCodeField = By.cssSelector("#zip_code_location");
        this.typeField =By.cssSelector("div.wrapper_inputs_form > div:nth-child(2) > div > input[type=text]");
        this.continueButton =By.cssSelector("div.wrapper_inputs_form > button");
    }
    public WebElement getZipCodeField(){return  driver.findElement(zipCodeField);}
    public WebElement getTypeField(){
        try {
            return driver.findElement(typeField);
        } catch (NotFoundException ex) {
            return null;
        }
    }
    public boolean typeFieldIsAvailable() {
        return getTypeField() != null;
    }
    public WebElement getContinueButton(){return  driver.findElement(continueButton);}

    public void selectCategory(String zipCode, TypesOfProperties types)
    {
        getZipCodeField().sendKeys(zipCode);
        getTypeField().sendKeys(types.toString());
        getContinueButton().click();
    }
    public void selectCategory(String zipCode)
    {
        getZipCodeField().sendKeys(zipCode);
        getContinueButton().click();
    }
}
