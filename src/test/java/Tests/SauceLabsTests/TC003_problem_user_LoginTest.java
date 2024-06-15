package Tests.SauceLabsTests;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class TC003_problem_user_LoginTest extends BaseTest {

    @Test
    public void problem_user_login() {
        loginPage.open(loginPageLink);

    }
}
