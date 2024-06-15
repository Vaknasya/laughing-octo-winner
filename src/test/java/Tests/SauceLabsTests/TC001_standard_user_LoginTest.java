package Tests.SauceLabsTests;


import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_standard_user_LoginTest extends BaseTest {
    String standartUserLogin = "standard_user";

    @Test
    public void standard_user_login() {
        loginPage.open(loginPageLink);
        Assert.assertTrue(loginPage.isLoginCredentialsVisible());

        loginPage.sendLogin(standartUserLogin);
        loginPage.sendPassword(commonPassword);

        loginPage.clickLoginBtn();
        Assert.assertTrue(marketPage.isBurgerMenuButtonVisible());
    }
}
