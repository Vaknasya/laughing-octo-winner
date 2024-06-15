package Pages.SauceLabsPages;

import Elements.Button;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketPage extends BasePage {

    public MarketPage(WebDriver instance) {
        super(instance);
    }

    private final Button addToCartBikeButton =
            new Button(By.cssSelector("#add-to-cart-sauce-labs-bike-light"), "Add bike to cart");
    public void clickAddToCartBikeBtn() {
        addToCartBikeButton.click();
    }
    public boolean isBikeAddBtnDisplayed(){
        return addToCartBikeButton.isDisplayed();
    }

    private final Button burgerMenuButton =
            new Button(By.cssSelector(".bm-burger-button"), "Burger Menu btn");
    public boolean isBurgerMenuButtonVisible(){
        return burgerMenuButton.isDisplayed();
    }
    public void clickBurgerMenuBtn() {
        burgerMenuButton.click();
    }

}
