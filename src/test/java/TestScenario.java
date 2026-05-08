import Pages.InfoPage;
import Pages.PaymentPage;
import Pages.ProductsPage;
import Pages.SignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.*;



import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import javax.naming.Name;


//Sign up and login --> go to products page --> search with T-shirt --> add to cart the first product in search --> continue shopping-->
// add the last product in search  --> go to cart --> delete one of items in cart --> checkout

public class TestScenario extends BaseTest {

    @Test
    public void Scenario() {

// First Step Of signing up
        SignupPage signupPage = new SignupPage(driver);
        signupPage.Signupfirst("Sixth Test","Sixth_Test12@gmail.com");
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/signup","First Step Of Signing up is Successful, now with the rest of the information");

        InfoPage infoPage = new InfoPage(driver);
        infoPage.fillnames("1234","Sixth","Test");
        infoPage.fillAddress("43 city street","state","city","Canada");
        infoPage.setDate("21","October","2003");
        infoPage.phonecode("834564356","112233");
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/account_created","Account Created Successfully");



        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        continueButton.click();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.searchIsValid("T-shirt");
        productsPage.AddToCart("thank you");

        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");

        PaymentPage paymentPage = new PaymentPage(driver);

        paymentPage.Payment("Test Name","49630769864435","323","04","2030");

        WebElement message = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));

        Assert.assertEquals(message,"Order Placed!");

        WebElement logout = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        logout.click();

        signupPage.Login("Fourth_Test1234567890@gmail.com","1234");

        WebElement deleteAccount = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));

        Assert.assertTrue(deleteAccount.isDisplayed());







    }
}
