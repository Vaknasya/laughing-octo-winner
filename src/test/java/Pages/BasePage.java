package Pages;

import allAboutDriver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected static WebDriver instance = WebDriverSingleton.getInstance();

    public BasePage(WebDriver instance) {
        this.instance = instance;
    }

    public void open(String url) {
        instance.get(url);
    }





}