package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {
    protected WebDriver driver;

    private By cardNameBy = By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[1]/div/input");

    private By cardNoBy = By.name("card_number");

    private By cvcBy = By.name("cvc");

    private By expirationMonthBy = By.name("expiry_month");

    private By expirationYearBy = By.name("expiry_year");

    private By confirmOrderBy = By.id("submit");

    public PaymentPage(WebDriver driver){

        this.driver=driver;
    }

    public void Payment(String NameOnCard , String CardNo, String CVC , String ExpMonth, String ExpYear){

        driver.findElement(cardNameBy).sendKeys(NameOnCard);
        driver.findElement(cardNoBy).sendKeys(CardNo);
        driver.findElement(cvcBy).sendKeys(CVC);
        driver.findElement(expirationMonthBy).sendKeys(ExpMonth);
        driver.findElement(expirationYearBy).sendKeys(ExpYear);
        driver.findElement(confirmOrderBy).click();
    }

}
