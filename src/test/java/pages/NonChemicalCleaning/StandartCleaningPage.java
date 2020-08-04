package pages.NonChemicalCleaning;

import Data.ExtrasCleaningOptions;
import Data.ServiceFrequency;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.Tools;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

public class StandartCleaningPage extends BasicCleaningPage{
    protected WebDriver driver;
    private By serviceFrequencyBlock;
    private By timePeriodBlock;
    private By extrasBlock;

    public StandartCleaningPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        this.serviceFrequencyBlock = By.cssSelector("div.order_vendor > div:nth-child(3) > div > div > div");
        this.timePeriodBlock = By.cssSelector("div.order_vendor > div:nth-child(4) > div > div > div");
        this.extrasBlock = By.cssSelector("div.order_vendor > div:nth-child(5) > div > div > div");
    }
    public List<WebElement> getServiceFrequency(){return  driver.findElements(serviceFrequencyBlock);}
    public List<WebElement> getTimePeriod(){return  driver.findElements(timePeriodBlock);}
    public List<WebElement> getExtras(){return  driver.findElements(extrasBlock);}
    public void bookStandartCleaning(int bedrooms, int bathrooms,String serviceFreauency,String extras, String date, int timeToStart) throws ParseException, InterruptedException {
        Tools tools = new Tools();

        getNumberOfBedroomsDropdown().click();
        getNumberOfBedrooms().get(bedrooms).click();

        getNumberOfBathroomsDropdown().click();
        getNumberOfBathrooms().get(bathrooms).click();
        tools.setServiceOption(getServiceFrequency(), serviceFreauency);
        tools.setServiceOption(getExtras(), extras);

        tools.setDatePickerDate(LocalDate.parse(date));

        Thread.sleep(4000);

        getTimeDropdown().click();
        getTime().get(timeToStart).click();
        Thread.sleep(3000);
        getNextButton().click();
    }
}
