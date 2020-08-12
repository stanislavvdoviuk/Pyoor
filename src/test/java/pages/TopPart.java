package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopPart {
    protected WebDriver driver;
    private By loginButton;
    private By signInButton;
    private By bookServiceButton;

    public TopPart(WebDriver driver)  {
        this.driver=driver;
        this.loginButton = By.cssSelector("div.wrapper_profile_mobile > img");
        this.signInButton =By.cssSelector("div.sign_up_mobile");
        this.bookServiceButton =By.xpath("//*[@id=\"scroll_active\"]/div[3]/div[1]/a[1]");
        //this.bookServiceButton =By.cssSelector("#scroll_active > div.wrapper_navigation_section > div.navigation_wrapper > a:nth-of-type(1)");
    }

        public WebElement getLoginButton(){return  driver.findElement(loginButton);}
        public void clickLoginButton(){ getLoginButton().click();}

        public WebElement getBookServiceButton(){return  driver.findElement(bookServiceButton);}
        public void clickBookServiceButton(){ getBookServiceButton().click();}

        public HomePage clickBookService()
        {
            clickBookServiceButton();
            return new HomePage(driver);
        }
    }

