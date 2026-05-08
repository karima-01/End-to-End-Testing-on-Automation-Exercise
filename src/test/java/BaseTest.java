import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        String title = driver.getTitle();
        System.out.println("Title: " + title);
    }

    @AfterClass
    public void afterClass(){

    }
}
