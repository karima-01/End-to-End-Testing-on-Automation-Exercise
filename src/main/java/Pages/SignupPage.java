package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

    protected WebDriver driver;

    private By signupButtonBy = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");


    private By nameBy = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");

    private By emailBy = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");

    private By signupBy = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

    private By emailLoginBy = By.name("email");

    private By passwordBy = By.name("password");

    private By LoginButtonBy = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");



    public SignupPage(WebDriver driver){
        this.driver = driver;
    }


    public void Signupfirst (String Name, String email){
        driver.findElement(signupButtonBy).click();
        driver.findElement(nameBy).sendKeys(Name);
        driver.findElement(emailBy).sendKeys(email);
        driver.findElement(signupBy).click();
    }

    public void Login(String email, String password){
        driver.findElement(emailLoginBy).sendKeys(email);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(LoginButtonBy).click();


    }
}
