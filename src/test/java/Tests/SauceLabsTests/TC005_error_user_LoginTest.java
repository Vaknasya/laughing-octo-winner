package Tests.SauceLabsTests;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class TC005_error_user_LoginTest extends BaseTest {

    @Test
    public void errorUserLogin() {
        loginPage.open(loginPageLink);

    }
}
