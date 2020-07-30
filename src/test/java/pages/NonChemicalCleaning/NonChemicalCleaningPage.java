package pages.NonChemicalCleaning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.TopPart;

public class NonChemicalCleaningPage extends TopPart {
    protected WebDriver driver;
    private By standartCleaningField;
    private By deepCleaningField;
    private By moveCleaningField;

    public NonChemicalCleaningPage(WebDriver driver)  {
        super(driver);
        this.driver=driver;
        this.standartCleaningField = By.cssSelector("div.wrapper_every_subcategories_cleaning > a:nth-child(1)");
        this.deepCleaningField = By.cssSelector("div.wrapper_every_subcategories_cleaning > a:nth-child(2)");
        this.moveCleaningField = By.cssSelector("div.wrapper_every_subcategories_cleaning > a:nth-child(3)");
    }

    public WebElement getStandartCleaning(){return  driver.findElement(standartCleaningField);}
    public void clickStandartCleaning(){ getStandartCleaning().click();}

    public WebElement getDeepCleanig(){return  driver.findElement(deepCleaningField);}
    public void clickDeepCleanig(){ getDeepCleanig().click();}

    public WebElement getMoveCleaning(){return  driver.findElement(moveCleaningField);}
    public void clickMoveCleaning(){ getMoveCleaning().click();}
}
