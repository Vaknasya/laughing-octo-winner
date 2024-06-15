package Tests.SauceLabsTests;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class TC006_visual_user_LoginTest extends BaseTest {

    @Test
    public void visualUserLogin() {
        loginPage.open(loginPageLink);

    }
}
