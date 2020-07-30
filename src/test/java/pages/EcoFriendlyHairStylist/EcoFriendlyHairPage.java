package pages.EcoFriendlyHairStylist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.TopPart;

public class EcoFriendlyHairPage extends TopPart {
    protected WebDriver driver;
    private By familyButton;
    private By kidsButton;
    private By menButton;
    private By womenButton;

    public EcoFriendlyHairPage(WebDriver driver)  {
        super(driver);
        this.driver=driver;
        this.familyButton = By.cssSelector("div.wrapper_every_subcategories_stylist > a:nth-child(1)");
        this.kidsButton = By.cssSelector("div.wrapper_every_subcategories_stylist > a:nth-child(2)");
        this.menButton = By.cssSelector("div.wrapper_every_subcategories_stylist > a:nth-child(3)");
        this.womenButton = By.cssSelector("div.wrapper_every_subcategories_stylist > a:nth-child(4)");
    }

    public WebElement getFamilyButton(){return  driver.findElement(familyButton);}
    public void clickFamilyButton(){ getFamilyButton().click();}

    public WebElement getKidsButton(){return  driver.findElement(kidsButton);}
    public void clickKidsButton(){ getKidsButton().click();}

    public WebElement getMenButton(){return  driver.findElement(menButton);}
    public void clickMenButton(){ getMenButton().click();}

    public WebElement getWomenButton(){return  driver.findElement(womenButton);}
    public void clickWomenButton(){ getWomenButton().click();}
}
