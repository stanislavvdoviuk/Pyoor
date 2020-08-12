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
    private By rightBar;

    public TopPart(WebDriver driver)  {
        this.driver=driver;
        this.loginButton = By.cssSelector("div.wrapper_profile_mobile > img");
        this.signInButton =By.cssSelector("div.sign_up_mobile");
//        this.bookServiceButton =By.xpath("//*[@id=\"scroll_active\"]/div[3]/div[1]/a[1]");
        this.bookServiceButton =By.cssSelector(".navigation_wrapper > a[href*=\"services\"]");
        this.rightBar=By.cssSelector("burger_menu_wrapper");
    }

        public WebElement getLoginButton(){return  driver.findElement(loginButton);}
        public WebElement getRightBar(){return  driver.findElement(rightBar);}
        public void clickLoginButton(){ getLoginButton().click();}

        public WebElement getBookServiceButton(){return  driver.findElement(bookServiceButton);}
        public void clickBookServiceButton() throws InterruptedException {
        if(getBookServiceButton().isDisplayed())
        {   Thread.sleep(2000);
            getBookServiceButton().click();}
         else
        {
        getRightBar().click();
            getBookServiceButton().click();
        }
    }

        public HomePage clickBookService() throws InterruptedException {
            clickBookServiceButton();
            return new HomePage(driver);
        }
    }

