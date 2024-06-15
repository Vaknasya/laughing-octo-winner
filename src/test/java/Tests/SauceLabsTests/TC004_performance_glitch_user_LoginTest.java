package Tests.SauceLabsTests;

import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC004_performance_glitch_user_LoginTest extends BaseTest {
    String performanceGlitchedUserLogin = "performance_glitch_user";

    @Test
    public void performance_glitch_user_Login() {
        loginPage.open(loginPageLink);

        loginPage.sendLogin(performanceGlitchedUserLogin);
        loginPage.sendPassword(commonPassword);

        loginPage.clickLoginBtn();
        Assert.assertTrue(marketPage.isBurgerMenuButtonVisible());
    }
}
