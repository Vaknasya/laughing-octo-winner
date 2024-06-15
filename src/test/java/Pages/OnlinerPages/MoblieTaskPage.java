package Pages.OnlinerPages;

import Elements.Label;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoblieTaskPage extends BasePage {

    public MoblieTaskPage(WebDriver instance) {
        super(instance);
    }

    private final Label smartphonesCatalog =
            new Label(By.xpath("//span[@class = \"project-navigation__text\"]//span[text()='Смартфоны']"), "Catalog");
    public void clickSmartphonesCatalog() {
        smartphonesCatalog.click();
    }


    private final Label HonorCheckbox =
            new Label(By.xpath("//div[@class = \"catalog-form__checkbox-text\"]//div[text()='HONOR']"), "Honor checkbox");
    public void disableHonorCheckbox(){
        HonorCheckbox.click();
    }
    public boolean isHonorCheckboxVisible(){
        return HonorCheckbox.isDisplayed();
    }

    private final Label AppleCheckbox =
            new Label(By.xpath("//div[@class = \"catalog-form__checkbox-text\"]//div[text()='Apple']"), "Apple checkbox");
    public void clickAppleCheckbox() {
        AppleCheckbox.click();
    }

    private final Label firstPrice =
            new Label(By.cssSelector(".catalog-form__offers-flex a[href*=\"prices\"]"), "First price");
    public int getFirstPrice() {
        return Integer.parseInt(firstPrice.getText().replaceAll("[^0-9]", ""));
    }

}
