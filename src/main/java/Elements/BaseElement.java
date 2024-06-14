package Elements;

import allAboutDriver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

public abstract class BaseElement {
    protected static WebDriver instance = WebDriverSingleton.getInstance();
    public By locator;
    protected String name;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public WebElement findElement() {
        return instance.findElement(this.locator);
    }

    public void click() {
        findElement().click();
    }

    public List<WebElement> findElements() {
        return instance.findElements(this.locator);
    }

    public boolean isDisplayed() {
        return findElement().isDisplayed();
    }

    public String getText(){
        return findElement().getText();
    }

    public void sendKeys(String keys){
        findElement().sendKeys(keys);
    }

    Wait<WebDriver> wait = new FluentWait<WebDriver>(instance)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);

    public void moveTo() {
        new Actions(instance).moveToElement(findElement()).build().perform();
    }

    public void clickAndHold(){
        new Actions(instance).clickAndHold(findElement()).build().perform();
    }

}
