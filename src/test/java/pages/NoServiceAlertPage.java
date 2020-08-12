package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NoServiceAlertPage  extends  TopPart{
    protected WebDriver driver;
    private By titleWrapper;

    public NoServiceAlertPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        this.titleWrapper = By.cssSelector("  .title_wrapper");
    }
    public WebElement getTitleWrapper(){return  driver.findElement(titleWrapper);}
}
