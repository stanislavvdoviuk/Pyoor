package pages.EcoFriendlyHairStylist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.TopPart;
import tests.Tools;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

public class BasicHairBookPage extends TopPart {
    protected WebDriver driver;
    private By numberOfPeoples;
    private By numberOfPeoplesDropdown;
    private By timeSelector;
    private By timeDropdown;
    private By datePicker;
    private By promocodeField;
    private By commentField;
    private By nextButton;

    public BasicHairBookPage(WebDriver driver)  {
        super(driver);
        this.driver=driver;
        this.numberOfPeoples = By.cssSelector("div.every_inputs_wrapper > div > div > div > div");
        this.numberOfPeoplesDropdown = By.cssSelector("div.every_inputs_wrapper > div > div > input");

        this.timeSelector = By.cssSelector("div.wrapper_choosing_time > div.choosing_date_time > div > div.wrapper_time_select > div");
        this.timeDropdown=By.cssSelector("div.choosing_date_time > div > div > input[type=text]");

        this.datePicker = By.cssSelector("#calendar");

        this.promocodeField = By.cssSelector(".promocode_wrapper #promo");
        this.commentField = By.cssSelector(".choosing_date_comment #comment");
        this.nextButton = By.cssSelector(".wrapper_active_link_btn");
    }

    public WebElement getNumberOfPeoplesDropdown(){return  driver.findElement(numberOfPeoplesDropdown);}
    public List<WebElement> getNumberOfPeoples(){return  driver.findElements(numberOfPeoples);}

    public WebElement getTimeDropdown(){return  driver.findElement(timeDropdown);}
    public List<WebElement> getTime(){return driver.findElements(timeSelector);}

    public WebElement getDate(){return  driver.findElement(datePicker);}

    public WebElement getPromocodeField(){return  driver.findElement(promocodeField);}
    public WebElement getCommentField(){return  driver.findElement(commentField);}
    public WebElement getNextButton(){return  driver.findElement(nextButton);}

    public void bookHair() throws InterruptedException, ParseException {
        Tools tools = new Tools();

        getNumberOfPeoplesDropdown().click();
        getNumberOfPeoples().get(2).click();

        tools.setDatePickerDate(LocalDate.parse("2020-11-18"));

        Thread.sleep(5000);
        getTimeDropdown().click();
        getTime().get(2).click();

        getNextButton().click();
    }
}
