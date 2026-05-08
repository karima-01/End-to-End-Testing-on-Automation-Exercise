package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {
    protected WebDriver driver;

    private By productsBy = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");

    private By SearchBy = By.id("search_product");

    private By submitSearchBy = By.id("submit_search");

    private By addProduct1By = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a");

    private By continueShoppingBy = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[1]/div/div/div[3]/button");

    private By continueShoppingPopupBy = By.className("modal-content");

    private By addProduct2By = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");

    private By cartBy = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");

    private By deleteProduct2By = By.xpath("//*[@id=\"product-30\"]/td[6]/a");



    private By proceedToCheckoutBy = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");

    private By commentBy = By.name("message");

    private By placeOrderBy = By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a");



    public ProductsPage (WebDriver driver){
        this.driver = driver;
    }


    public void searchIsValid(String Search){

        driver.findElement(productsBy).click();

        driver.findElement(SearchBy).sendKeys(Search);

        driver.findElement(submitSearchBy).click();

    }


    public void AddToCart(String comment){
        driver.findElement(addProduct1By).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.findElement(addProduct2By).click();
        driver.findElement(cartBy).click();
        driver.findElement(deleteProduct2By);
        driver.findElement(proceedToCheckoutBy).click();
        driver.findElement(commentBy).sendKeys(comment);
        driver.findElement(placeOrderBy).click();
    }












}
