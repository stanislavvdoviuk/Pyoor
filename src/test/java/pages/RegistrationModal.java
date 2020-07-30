package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationModal {
    protected WebDriver driver;
    private By emailField;
    private By passwordField;
    private By subtimButton;

    public RegistrationModal(WebDriver driver)  {
        this.driver=driver;
        this.emailField = By.cssSelector("div.inputs_wrapper > div:nth-child(1) > input[type=email]");
        this.passwordField =By.cssSelector(" div.inputs_wrapper > div:nth-child(2) > input[type=password]");
        this.subtimButton=By.cssSelector("button.submit");
    }

    public WebElement getEmailField(){return  driver.findElement(emailField);}
    public WebElement getPasswordField(){return  driver.findElement(passwordField);}
    public WebElement getSubtim(){return driver.findElement(subtimButton);}

    public void setUser(String email, String password){
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getSubtim().click();
    }
}
