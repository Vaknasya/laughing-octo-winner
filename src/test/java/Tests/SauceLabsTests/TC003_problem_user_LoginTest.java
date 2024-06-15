package Tests.SauceLabsTests;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_problem_user_LoginTest extends BaseTest {
    String porblemUserLogin = "problem_user";

    @Test
    public void problem_user_login() {
        loginPage.open(loginPageLink);
        Assert.assertTrue(loginPage.isLoginCredentialsVisible());

        loginPage.sendLogin(porblemUserLogin);
        loginPage.sendPassword(commonPassword);

        loginPage.clickLoginBtn();
        Assert.assertTrue(marketPage.isBurgerMenuButtonVisible());
    }
}
