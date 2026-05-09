package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadLogoutPage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    private By DownloadInvoiceBtn = By.xpath("/html/body/section/div/div/div/a");

    private By ContinueBtn = By.xpath("/html/body/section/div/div/div/div/a");

    private By Logout = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");


    public DownloadLogoutPage(WebDriver driver){this.driver = driver;}

    public void Download_and_Continue(){

        driver.findElement(DownloadInvoiceBtn).click();
        driver.findElement(ContinueBtn).click();

    }

    public void Logout(){
        driver.findElement(Logout).click();

    }



}
