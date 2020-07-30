package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseVersionField extends TopPart{
    protected WebDriver driver;
    private By customerButtton;
    private By proButton;
    public ChooseVersionField(WebDriver driver)  {
        super(driver);
        this.driver=driver;
        this.customerButtton = By.cssSelector("div.choose_version_mobile_active > div > div:nth-child(3)");
        this.proButton =By.cssSelector("div.choose_version_mobile_active > div > div:nth-child(4)");
    }

    public WebElement getCustomerButton(){return  driver.findElement(customerButtton);}
    public void clickCustomerButton(){ getCustomerButton().click();}

    public WebElement getProButton(){return  driver.findElement(proButton);}
    public void clickProButton(){ getProButton().click();}
}
