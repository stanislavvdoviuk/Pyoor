package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RightSideMenu {
    protected WebDriver driver;
    private By loginButton;
    private By signInButton;
    private By bookServiceButton;

    public RightSideMenu(WebDriver driver)  {
        this.driver=driver;
        this.loginButton = By.cssSelector("div.wrapper_profile_mobile > img");
        this.signInButton =By.cssSelector("div.sign_up_mobile");
        this.bookServiceButton =By.cssSelector("#scroll_active > div.wrapper_navigation_section > div.navigation_wrapper > a:nth-of-type(1)");
    }
}
