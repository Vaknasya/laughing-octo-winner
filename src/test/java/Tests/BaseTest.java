package Tests;

import Pages.SauceLabsPages.LoginPage;
import Pages.SauceLabsPages.MarketPage;
import allAboutDriver.DriverEnum;
import allAboutDriver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver = WebDriverSingleton.getDriver(DriverEnum.FIREFOX);
    protected LoginPage loginPage = new LoginPage(driver);
    protected MarketPage marketPage = new MarketPage(driver);

    public String loginPageLink = "https://www.saucedemo.com/";
    public String commonPassword = "secret_sauce";

    @BeforeSuite
    protected void setupMethod() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
    }

    @AfterTest
    public void quitTheApp() {
        driver.quit();
    }



}
