package allAboutDriver;

import org.openqa.selenium.WebDriver;

import static allAboutDriver.DriverFactory.createBrowserByArgument;

public class WebDriverSingleton {
    private static WebDriver instance;

    private WebDriverSingleton() {}

    public static synchronized WebDriver getDriver(DriverEnum typeOfDriver) {
        if (instance == null) {
            instance = createBrowserByArgument(typeOfDriver);
        }
        return instance;
    }

    public static WebDriver getInstance() {
        return instance;
    }

}