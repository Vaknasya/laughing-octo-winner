package Pages.SauceLabsPages;

import Elements.Label;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketPage extends BasePage {

    public MarketPage(WebDriver instance) {
        super(instance);
    }

    private final Label shoppingCartIcon =
            new Label(By.cssSelector("shopping_cart_link"), "Shopping cart icon");
    public void clickShoppingCart() {
        shoppingCartIcon.click();
    }
    public boolean isShoppingCartIconPresent() {
        return shoppingCartIcon.isDisplayed();
    }


}
