package pages.NonChemicalCleaning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.TopPart;
import tests.Tools;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

public class BasicCleaningPage extends TopPart {
    protected WebDriver driver;
    private By numberOfBedrooms;
    private By numberOfBedroomsDropdown;

    private By numberOfBathrooms;
    private By numberOfBathroomsDropdown;

    private By laundrySection;

    private By datePicker;

    private By timeSelector;
    private By timeDropdown;

    private By promocodeField;
    private By commentField;
    private By alert;
    private By nextButton;

    public BasicCleaningPage(WebDriver driver)  {
        super(driver);
        this.driver=driver;

        this.numberOfBedrooms = By.cssSelector("div.order_vendor > div:nth-child(1) > div > div > div > div");
        this.numberOfBedroomsDropdown = By.cssSelector("div.order_vendor > div:nth-child(1) > div > div > input[type=text]");

        this.numberOfBathrooms = By.cssSelector("div.order_vendor > div:nth-child(2) > div > div > div > div");
        this.numberOfBathroomsDropdown = By.cssSelector(" div.order_vendor > div:nth-child(2) > div > div > input[type=text]");

        this.laundrySection = By.cssSelector("div.order_vendor > div:nth-child(3) > div > div");

        this.datePicker = By.cssSelector("#calendar");

        this.timeSelector = By.cssSelector("div.wrapper_choosing_time > div.choosing_date_time > div > div.wrapper_time_select > div");
        this.timeDropdown=By.cssSelector("div.choosing_date_time > div > div > input[type=text]");

        this.promocodeField = By.cssSelector(".promocode_wrapper #promo");
        this.commentField = By.cssSelector(".choosing_date_comment #comment");
        this.alert=By.cssSelector("div.order_vendor > div.wrapper_submit_btn > span");
        this.nextButton = By.cssSelector(".wrapper_active_link_btn");
    }
    public WebElement getNumberOfBedroomsDropdown(){return  driver.findElement(numberOfBedroomsDropdown);}
    public List<WebElement> getNumberOfBedrooms(){return  driver.findElements(numberOfBedrooms);}

    public WebElement getNumberOfBathroomsDropdown(){return  driver.findElement(numberOfBathroomsDropdown);}
    public List<WebElement> getNumberOfBathrooms(){return  driver.findElements(numberOfBathrooms);}

    public List<WebElement> getLaundrySection(){return  driver.findElements(laundrySection);}

    public WebElement getDate(){return  driver.findElement(datePicker);}

    public WebElement getTimeDropdown(){return  driver.findElement(timeDropdown);}
    public List<WebElement> getTime(){return driver.findElements(timeSelector);}

    public WebElement getPromocodeField(){return  driver.findElement(promocodeField);}
    public WebElement getCommentField(){return  driver.findElement(commentField);}
    public WebElement getAlert(){return driver.findElement(alert);}
    public WebElement getNextButton(){return  driver.findElement(nextButton);}

    public void bookDeepCleaning(int bedrooms, int bathrooms, String date, int timeToStart) throws InterruptedException, ParseException {
        Tools tools = new Tools();

        getNumberOfBedroomsDropdown().click();
        getNumberOfBedrooms().get(bedrooms).click();

        getNumberOfBathroomsDropdown().click();
        getNumberOfBathrooms().get(bathrooms).click();

        getLaundrySection().get(0).click();

        tools.setDatePickerDate(LocalDate.parse(date));

        Thread.sleep(3000);

        getTimeDropdown().click();
        getTime().get(timeToStart).click();
        Thread.sleep(3000);
        getNextButton().click();
    }
    public void bookWithWrongData(int bedrooms, int bathrooms)
    {
        Tools tools = new Tools();

        getNumberOfBedroomsDropdown().click();
        getNumberOfBedrooms().get(bedrooms).click();

        getNumberOfBathroomsDropdown().click();
        getNumberOfBathrooms().get(bathrooms).click();

        getNextButton().click();
    }
}
