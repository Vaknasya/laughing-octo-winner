package Pages.SauceLabsPages;

import Elements.Button;
import Elements.Label;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver instance) {
        super(instance);
    }
    MarketPage marketPage = new MarketPage(instance);

    private final Label loginUsernameField =
            new Label(By.cssSelector("#user-name"), "Login field");
    public void sendLogin(String username) {
        loginUsernameField.sendKeys(username);
    }

    private final Label loginPasswordField =
            new Label(By.cssSelector("#password"), "Password field");
   public void sendPassword(String password) {
       loginPasswordField.sendKeys(password);
   }

   protected final Button loginButton =
           new Button(By.cssSelector("#login-button"), "Login button");
   public void clickLoginBtn() {
       loginButton.click();
   }

   private final Label loginCredentials =
           new Label(By.cssSelector("#login_credentials"), "Login credentials");
   public boolean isLoginCredentialsVisible(){
       return loginCredentials.isDisplayed();
   }
   public boolean isShoppingCartVisible(){
       return marketPage.isShoppingCartIconPresent();
   }
}