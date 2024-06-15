package Tests.SauceLabsTests;

import Pages.SauceLabsPages.LoginPage;
import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_standard_user_LoginTest extends BaseTest {

    @Test
    public void standard_user_login() {
        loginPage.open(loginPageLink);
        Assert.assertTrue(loginPage.isLoginCredentialsVisible());

        loginPage.sendLogin("standard_user");
        loginPage.sendPassword(commonPassword);

        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.isShoppingCartVisible());
    }
}
