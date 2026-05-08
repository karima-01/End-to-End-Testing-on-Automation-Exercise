package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InfoPage {

    protected WebDriver driver;

    private By titleBy = By.id("id_gender2");

    private By passwordBy = By.id("password");

    private By firstnameBy = By.id("first_name");

    private By lastnameBy = By.id("last_name");

    private By addressBy = By.id("address1");

    private By stateBy = By.id("state");

    private By cityBy = By.id("city");

    private By zipcodeBy = By.id("zipcode");

    private By phoneBy = By.id("mobile_number");

    private By countryBy = By.id("country");

    private By dayBy = By.id("days");

    private By monthBy = By.id("months");

    private By yearBy = By.id("years");

    private By createAccButtonBy = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");

    public InfoPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillnames(String password,String firstname , String lastname){
        driver.findElement(titleBy).click();
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(firstnameBy).sendKeys(firstname);
        driver.findElement(lastnameBy).sendKeys(lastname);
    }

    public void fillAddress(String address, String state , String city ,String country){

        driver.findElement(addressBy).sendKeys(address);
        driver.findElement(stateBy).sendKeys(state);
        driver.findElement(cityBy).sendKeys(city);

        WebElement countryElement = driver.findElement(countryBy);
        countryElement.click();
        new Select(countryElement).selectByContainsVisibleText(country);
    }

    public void phonecode (String phone, String zipcode){
        driver.findElement(zipcodeBy).sendKeys(zipcode);
        driver.findElement(phoneBy).sendKeys(phone);
        driver.findElement(createAccButtonBy).click();

    }

    public void setDate(String day, String month, String year){

        WebElement DayElement = driver.findElement(dayBy);
        DayElement.click();
        new Select(DayElement).selectByContainsVisibleText(day);

        WebElement MonthElement = driver.findElement(monthBy);
        MonthElement.click();
        new Select(MonthElement).selectByContainsVisibleText(month);

        WebElement YearElement = driver.findElement(yearBy);
        YearElement.click();
        new Select(YearElement).selectByContainsVisibleText(year);

    }









}
