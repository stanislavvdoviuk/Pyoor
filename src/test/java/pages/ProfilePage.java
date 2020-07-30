package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage extends TopPart {
    protected WebDriver driver;
    private By nameField;
    private By emailField;
    private By phoneField;
    private By addressField;
    private By cityField;
    private By stateField;
    private By zipCodeField;

    private By updateInfoButton;
    private By updatePasswordButton;

    public ProfilePage(WebDriver driver)  {
        super(driver);
        this.driver=driver;
        this.nameField = By.cssSelector("div.wrapper_personal_info > span:nth-child(2)");
        this.emailField = By.cssSelector("div.wrapper_personal_info > span:nth-child(4)");
        this.phoneField = By.cssSelector("div.wrapper_personal_info > span:nth-child(6)");
        this.addressField = By.cssSelector("div.wrapper_personal_info > span:nth-child(8)");
        this.cityField = By.cssSelector("div.wrapper_personal_info > span:nth-child(10)");
        this.stateField = By.cssSelector("div.wrapper_personal_info > span:nth-child(12)");
        this.zipCodeField = By.cssSelector("div.wrapper_personal_info > span:nth-child(14)");

        this.updateInfoButton = By.cssSelector("div.changing_data_wrapper > button:nth-child(1)");
        this.updatePasswordButton = By.cssSelector("div.changing_data_wrapper > button:nth-child(2)");
    }
    public WebElement getNameField(){return  driver.findElement(nameField);}
    public WebElement getEmailField(){return  driver.findElement(emailField);}
    public WebElement getPhoneField(){return  driver.findElement(phoneField);}
    public WebElement getAddressField(){return  driver.findElement(addressField);}
    public WebElement getCityField(){return  driver.findElement(cityField);}
    public WebElement getStateField(){return  driver.findElement(stateField);}
    public WebElement getZipCodeField(){return  driver.findElement(zipCodeField);}

    public WebElement getUpdateInfo(){return  driver.findElement(updateInfoButton);}
    public WebElement getUpdatePassword(){return  driver.findElement(updatePasswordButton);}

}
