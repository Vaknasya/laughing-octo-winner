package Tests.SauceLabsTests;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class TC002_locked_out_user_LoginTest extends BaseTest {

    @Test
    public void locked_out_user_Login() {
        loginPage.open(loginPageLink);

    }
}
