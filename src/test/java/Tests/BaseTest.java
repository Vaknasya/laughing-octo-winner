package Tests;

import allAboutDriver.DriverEnum;
import allAboutDriver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver = WebDriverSingleton.getDriver(DriverEnum.FIREFOX);

    @BeforeSuite
    protected void setupMethod() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
    }

    @AfterSuite
    public void quitTheApp() {
        driver.quit();
    }



}
