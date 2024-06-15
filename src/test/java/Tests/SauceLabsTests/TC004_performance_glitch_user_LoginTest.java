package Tests.SauceLabsTests;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class TC004_performance_glitch_user_LoginTest extends BaseTest {

    @Test
    public void performance_glitch_user_Login() {
        loginPage.open(loginPageLink);

    }
}
