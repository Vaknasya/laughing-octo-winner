package Tests.SauceLabsTests;

import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC006_visual_user_LoginTest extends BaseTest {
    String visualUserLogin = "visual_user";

    @Test
    public void visualUserLogin() {
        loginPage.open(loginPageLink);

        loginPage.sendLoginData(visualUserLogin, commonPassword);

        loginPage.clickLoginBtn();
        Assert.assertTrue(marketPage.isBurgerMenuButtonVisible());
    }
}
