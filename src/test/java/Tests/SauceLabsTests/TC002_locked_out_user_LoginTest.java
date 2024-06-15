package Tests.SauceLabsTests;

import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_locked_out_user_LoginTest extends BaseTest {
    String lockedUserLogin = "locked_out_user";

    @Test
    public void locked_out_user_Login() {
        loginPage.open(loginPageLink);
        Assert.assertTrue(loginPage.isLoginCredentialsVisible());

        loginPage.sendLogin(lockedUserLogin);
        loginPage.sendPassword(commonPassword);

        Assert.assertTrue(loginPage.isLoginErrorVisible());
    }
}
