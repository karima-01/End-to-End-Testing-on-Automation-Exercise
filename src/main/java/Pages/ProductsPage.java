package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.SystemColor.window;

public class ProductsPage {
    protected WebDriver driver;
    private WebDriverWait wait;
    private By productsBy = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");

    private By SearchBy = By.id("search_product");

    private By submitSearchBy = By.id("submit_search");

    private By addProduct1By = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a");

    private By continueShoppingBy = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[1]/div/div/div[3]/button");

    private By continueShoppingPopupBy = By.className("modal-content");

    private By addProduct2By = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a");

    private By cartBy = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");

    private By deleteProduct2By = By.xpath("/html/body/section/div/div[2]/table/tbody/tr[2]/td[6]/a");



    private By proceedToCheckoutBy = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");

    private By commentBy = By.name("message");

    private By placeOrderBy = By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a");



    public ProductsPage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    }


    public void searchIsValid(String Search){

        driver.findElement(productsBy).click();

        driver.findElement(SearchBy).sendKeys(Search);

        driver.findElement(submitSearchBy).click();

    }

    private void clickContinueShopping(){
        WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(continueShoppingBy));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",continueBtn);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(continueShoppingBy));
    }


    public void AddToCart(String comment){

        driver.findElement(addProduct1By).click();
        clickContinueShopping();



        WebElement product2 = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});",product2);

        new Actions(driver).moveToElement(product2).perform();

        WebElement addBtn2 = wait.until(ExpectedConditions.elementToBeClickable(addProduct2By));

        addBtn2.click();
        clickContinueShopping();



        driver.findElement(cartBy).click();
        driver.findElement(deleteProduct2By).click();
        driver.findElement(proceedToCheckoutBy).click();
        driver.findElement(commentBy).sendKeys(comment);
        driver.findElement(placeOrderBy).click();
    }












}
