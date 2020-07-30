package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataChangingModal{
    protected WebDriver driver;
    private By nameField;
    private By phoneField;
    private By addressField;
    private By cityField;
    private By stateField;
    private By zipCodeField;

    private By saveButton;

    public DataChangingModal(WebDriver driver)  {
        this.driver=driver;
        this.nameField = By.cssSelector("#root > div:nth-child(11) > div > div.personal_account_customer_wrapper > div.wrapper_data_modal > div > form > div:nth-child(2) > div > input[type=text]");
        this.phoneField = By.cssSelector("#root > div:nth-child(11) > div > div.personal_account_customer_wrapper > div.wrapper_data_modal > div > form > div:nth-child(3) > div > input[type=text]");
        this.addressField = By.cssSelector("#root > div:nth-child(11) > div > div.personal_account_customer_wrapper > div.wrapper_data_modal > div > form > div:nth-child(4) > div > input[type=text]");
        this.cityField = By.cssSelector("#root > div:nth-child(11) > div > div.personal_account_customer_wrapper > div.wrapper_data_modal > div > form > div:nth-child(5) > div > input[type=text]");
        this.stateField = By.cssSelector("#root > div:nth-child(11) > div > div.personal_account_customer_wrapper > div.wrapper_data_modal > div > form > div:nth-child(6) > div > input[type=text]");
        this.zipCodeField = By.cssSelector("#root > div:nth-child(11) > div > div.personal_account_customer_wrapper > div.wrapper_data_modal > div > form > div:nth-child(7) > div > input[type=text]");
        this.saveButton = By.cssSelector("div.wrapper_data_modal > div > form > button");
}
    public WebElement getNameField(){return  driver.findElement(nameField);}
    public WebElement getPhoneField(){return  driver.findElement(phoneField);}
    public WebElement getAddressField(){return  driver.findElement(addressField);}
    public WebElement getCityField(){return  driver.findElement(cityField);}
    public WebElement getStateField(){return  driver.findElement(stateField);}
    public WebElement getZipCodeField(){return  driver.findElement(zipCodeField);}
    public WebElement getSaveButton(){return  driver.findElement(saveButton);}

    public void updateUsersData(String name,String phone,String address,String city)
    {

        getNameField().clear();
        getNameField().sendKeys(name);

        getPhoneField().clear();
        getPhoneField().sendKeys(phone);

        getAddressField().clear();
        getAddressField().sendKeys(address);

        getCityField().clear();
        getCityField().sendKeys(city);

        getSaveButton().click();
    }
}
