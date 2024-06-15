package Tests.SauceLabsTests;

import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC005_error_user_LoginTest extends BaseTest {
    String errorUserLogin = "error_user";

    @Test
    public void errorUserLogin() {
        loginPage.open(loginPageLink);

        loginPage.sendLogin(errorUserLogin);
        loginPage.sendPassword(commonPassword);

        loginPage.clickLoginBtn();
        Assert.assertTrue(marketPage.isBurgerMenuButtonVisible());
    }
}
