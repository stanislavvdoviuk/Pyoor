package tests;

import pages.EcoFriendlyHairStylist.BasicHairBookPage;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebElement;
import pages.ChooseVersionField;
import pages.RegistrationModal;
import pages.TopPart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;

public class Tools extends TestRunner{
    public void SuccessfulLogin(String email, String password) throws InterruptedException {
        TopPart topPart = new TopPart(getDriver());
        topPart.clickLoginButton();
        ChooseVersionField choose =new ChooseVersionField(getDriver());
        choose.clickCustomerButton();
        RegistrationModal login=new RegistrationModal(getDriver());
        login.setUser(email,password);
    }
    public void setServiceOption(List<WebElement> block, String option)
    {
        for(int i=0;i<block.size();i++)
        {
//            String value=block.get(i).getText();
//            if(value.contentEquals(option))
//            {block.get(i).click();}
        if(option.contains(block.get(i).getText())){
            block.get(i).click();
        }
        }
    }
    public void setDatePickerDate(LocalDate date) throws InterruptedException, ParseException {
        SimpleDateFormat currentMonthAndYearPattern = new SimpleDateFormat("MMMM yyyy", Locale.US);
        //button to open calendar
        BasicHairBookPage calendar =new BasicHairBookPage(getDriver());
        calendar.getDate().click();
        WebElement monthFiled=getDriver().findElement(By.cssSelector("div.calendar-navigation > span.calendar-label"));
        LocalDate currentDate = currentMonthAndYearPattern.parse(monthFiled.getText()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if(date.isBefore(currentDate)) {
            throw new InvalidArgumentException("Invalid date argument");
        }
        //button to move next in calendar
        WebElement nextLink = getDriver().findElement(By.cssSelector("div.calendar-navigation > span.calendar-button.button-next"));
        //button to move previous month in calendar
        WebElement previousLink = getDriver().findElement(By.cssSelector("div.calendar-navigation > span.calendar-button.button-prev"));
        long monthsCount = ChronoUnit.MONTHS.between(currentDate, date);
        for(int i = 0; i < monthsCount; i++)
        {
            nextLink.click();
        }
        //get all dates from calendar to select correct one
        List<WebElement> list_AllDateToBook = getDriver().findElements(By.cssSelector("div.tail-datetime-calendar > div.calendar-date > table > tbody > tr > td.calendar-day.undefined"));
        WebElement desiredDay = list_AllDateToBook.get(date.getDayOfMonth() - 1);
        if(desiredDay.getAttribute("class").contains("unActiveDay"))
        {
            throw new InvalidArgumentException("Unactive day selected");
        }
        desiredDay.click();
    }
}
